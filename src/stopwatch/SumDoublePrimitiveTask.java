package stopwatch;

/**
 * A task that adds primitive double in an array.
 * 
 * @author Kongpon Charanwattanakit
 *
 */
public class SumDoublePrimitiveTask implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int amount;

	/**
	 * Initialize SumDoublePrimitiveTask by the amount.
	 * 
	 * @param amount
	 *            is how many times to add the number
	 */
	public SumDoublePrimitiveTask(int amount) {
		this.amount = amount;
	}

	/**
	 * Add numbers from 1 to ARRAY_SIZE using primitive double. If the amount of
	 * time is more than the ARRAY_SIZE, reset the adding to 1 when it reaches
	 * ARRAY_SIZE.
	 */
	@Override
	public void run() {
		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
		double sum = 0.0;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < amount; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value

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
		return String.format("Sum array of double primitives with count=%,d\n", amount);

	}

}
