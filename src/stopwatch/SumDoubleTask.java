package stopwatch;

/**
 * A task that adds Double wrapper class in an array.
 * 
 * @author Kongpon Charanwattanakit
 *
 */
public class SumDoubleTask implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int amount;
	private Double[] values;

	/**
	 * Initialize SumDoubleTask by the amount.
	 * 
	 * @param amount
	 *            is how many times to add the number
	 */
	public SumDoubleTask(int amount) {
		this.amount = amount;
		// create array of values to add, before we start the timer
		values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
	}

	/**
	 * Add numbers from 1 to ARRAY_SIZE using Double wrapper class. If the
	 * amount of time is more than the ARRAY_SIZE, reset the adding to 1 when it
	 * reaches ARRAY_SIZE.
	 */
	@Override
	public void run() {
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < amount; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", amount);
	}

}
