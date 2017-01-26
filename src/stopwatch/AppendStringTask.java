package stopwatch;

public class AppendStringTask implements Runnable {
	private int size;

	public AppendStringTask(int size) {
		this.size = size;
	}

	@Override
	public void run() {
		final char CHAR = 'a';
		String result = "";
		int k = 0;
		while (k++ < size) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}

	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", size);
	}
}
