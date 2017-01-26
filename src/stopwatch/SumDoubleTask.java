package stopwatch;

public class SumDoubleTask implements Runnable {
	static final int ARRAY_SIZE = 500000;

	private int size;

	public SumDoubleTask(int size) {
		this.size = size;
	}

	@Override
	public void run() {
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < size; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}

	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", size);
	}

}
