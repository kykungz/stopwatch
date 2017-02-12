package stopwatch;

/**
 * A Task that appends char to StringBuilder.
 * 
 * @author Kongpon Charanwattanakit
 *
 */
public class AppendStringBuilderTask implements Runnable {
	private int size;
	private final char CHAR = 'a';
	private String result;

	/**
	 * Initialize the AppendStringBuilderTask with a specific size. The size is
	 * the final length of the String.
	 * 
	 * @param size
	 *            is the length of the final String
	 */
	public AppendStringBuilderTask(int size) {
		this.size = size;
	}

	/**
	 * Add char 'a' to the StringBuilder until it reaches final size and print
	 * the result length to the console.
	 */
	@Override
	public void run() {
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < size) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		result = builder.toString();
	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", size) + "final string length = " + result.length();

	}

}
