# Stopwatch tasks by Kongpon Charanwattanakit (5910546376)
I ran the tasks on a Macbook Pro, and got
these results:

 Task | Time
 --------------------------------------|-------:
 Append 50,000 chars to String | 0.869101 sec
 Append 100,000 chars to String | 1.918872 sec
 Append 200,000 chars to String | 8.452629 sec
 Append 50,000 chars to StringBuilder | 0.000993 sec
 Append 100,000 chars to StringBuilder | 0.001672 sec
 Append 200,000 chars to StringBuilder | 0.001903 sec
 Add .5 billion double using array | 0.677232 sec
 Add 1 billion double using array | 1.337512 sec
 Add 2 billion double using array | 2.719576 sec
 Add .5 billion Double using array | 2.187084 sec
 Add 1 billion Double using array | 4.111022 sec
 Add 2 billion Double using array | 9.080298 sec
 Add .5 billion BigDecimal using array | 4.529876 sec
 Add 1 billion BigDecimal using array | 9.268163 sec
 Add 2 billion BigDecimal using array | 19.508028 sec

## Explanation of Results
###Appending chars to String
When I tried double the number of chars added to the String, the elapsed time is increasing exponentially. This is because every time we do the `+=`, a new String is created and then replace the old one. For example, when a `String a = "abc";` performs `a = a + "def";`, now the memory will have a String `"abc"`, `"def"`, and `"abcdef"`, and then String `a` will point to `"abcdef"` instead. A String object has attributes `int hash;` and `char[] value;`, so every time a String is created, it takes time and consumes memories. The effect of this memory consuming method is minor in a small length of String. But with a large size String, for example a String with 100,000 chars, it is very memory consuming. What happens when that String performed a `+= 'a';` method is, it will use memory to store a new result String which is 100,001 chars long, and still keep the old String (100,000 chars long) until it is replaced by the new one.
###Appending chars to StringBuilder
This method is so much faster than adding normal Strings. `StringBuilder` will not create new String instance when using `append` method. StringBuilder has a char array inside, with a capacity of 16 initially. So adding String or char into this StringBuilder will just update the value inside the char[], and no memory is being used in this process (because the char[] already takes the memory for 16 char). But if the added String/char is exeeded the maximum capacity of the char[], now StringBuilder's char[] will allocate more memories (char[] capacity become (2 times + 2) bigger). So this means the StringBuilder only allocates more memories when the String goes beyond the limit, while normal String will allocate more memories everytime it is appended.
###Adding double
Adding primitive `double` is a lot faster than the wrapper class `Double` and `BigDecimal`. Because `double` is a primitive, it does not contain any attributes or methods. So each `double` will consume less memory and faster than `Double` and `BigDecimal`.
###Adding Double
Adding wrapper class `Double` is slower than primitive `double` because `Double` is an object, which contains attributes and methods which takes memory.
###Adding BigDecimal
`BigDecimal` alone has a lot of attributes compare to `Double`. It also has a special process when adding numbers. Sometimes `double` gives you an inaccurate calculation, due to the computer's architecture. Unlike `Double` or `double`, `BigDecimal` is very accurate when dealing with decimals, which means you are unlikely getting calculation errors in `BigDecimal` objects. This also means `BigDecimal` must have more complex ways dealing with numbers to make sure the result is accurate. `add` method in `BigDecimal` does a lot more than adding so it takes more time to get the result.
