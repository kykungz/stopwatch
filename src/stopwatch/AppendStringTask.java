package stopwatch;

/**
 * A Task that appends chars to String.
 * 
 * @author Kongpon Charanwattanakit
 *
 */
public class AppendStringTask implements Runnable {
	private int size;
	private final char CHAR = 'a';
	private String result;

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
		result = "";
		int k = 0;
		while (k++ < size) {
			result = result + CHAR;
		}
	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", size) + ("final string length = " + result.length());

	}
}
