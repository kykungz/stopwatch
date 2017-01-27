package stopwatch;

import java.math.BigDecimal;

/**
 * A task that adds BigDecimal in an array.
 * 
 * @author Kongpon Charanwattanakit
 *
 */
public class SumBigDecimalTask implements Runnable {
	static final int ARRAY_SIZE = 500000;

	private int amount;

	/**
	 * Initialize SumBigDecimalTask by the amount.
	 * 
	 * @param amount
	 *            is how many times to add the number
	 */
	public SumBigDecimalTask(int amount) {
		this.amount = amount;
	}

	/**
	 * Add numbers from 1 to ARRAY_SIZE using BigDecimal class. If the amount of
	 * time is more than the ARRAY_SIZE, reset the adding to 1 when it reaches
	 * ARRAY_SIZE.
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		BigDecimal sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < amount; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
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
		return String.format("Sum array of BigDecimal with count=%,d\n", amount);

	}

}
