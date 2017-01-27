package stopwatch;

/**
 * A Task that appends chars to String.
 * 
 * @author Kongpon Charanwattanakit
 *
 */
public class AppendStringTask implements Runnable {
	private int size;

	/**
	 * Initialize the AppendStringTask with a specific size. The size is the
	 * final length of the String.
	 * 
	 * @param size
	 *            is the length of the final String
	 */
	public AppendStringTask(int size) {
		this.size = size;
	}

	/**
	 * Add char 'a' to the String until it reaches final size and print the
	 * result length to the console.
	 */
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

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", size);
	}
}
