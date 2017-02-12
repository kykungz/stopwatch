package stopwatch;

/**
 * TaskTimer is a utility to measure the elapsed time in seconds of a specific
 * task.
 * 
 * @author Kongpon Charanwattanakit
 *
 */
public class TaskTimer {
	private Stopwatch timer;

	/**
	 * Initialize the TaskTimer.
	 */
	public TaskTimer() {
		this.timer = new Stopwatch();
	}

	/**
	 * Run the task and measure the elapsed time. After finished the task, it
	 * will print the elapsed time to console.
	 * 
	 * @param task
	 *            is the task to be run
	 */
	public void measureAndPrint(Runnable task) {
		timer.start();
		task.run();
		timer.stop();
		System.out.println(task.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
