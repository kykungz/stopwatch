package stopwatch;

public class AppendStringBuilderTask implements Runnable {
	private int size;

	public AppendStringBuilderTask(int size) {
		this.size = size;
	}

	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < size) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		String result = builder.toString();
		System.out.println("final string length = " + result.length());
	}

	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", size);

	}

}
