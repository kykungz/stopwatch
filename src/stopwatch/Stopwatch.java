package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Kongpon Charanwattanakit
 * @version 1.0
 */
public class Stopwatch {

	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds */
	private long stopTime;
	/** a boolean indicates whether the stopwath is running or not */
	private boolean running;

	/**
	 * Return the elapsed time of the stopwatch. If the stopwatch is running,
	 * then return the elapsed time since start until the current time. If
	 * stopwatch is stopped, then return the time between the start and stop
	 * times.
	 * 
	 * @return the elapsed time in seconds with decimal
	 */
	public double getElapsed() {
		if (isRunning()) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		} else {
			return (stopTime - startTime) * NANOSECONDS;
		}
	}

	/**
	 * Check weather the stopwatch is running or not.
	 * 
	 * @return the status of the stopwatch. true if it is running, false
	 *         otherwise
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * Reset the stopwatch and start if it is not running. If the stopwatch is
	 * already running then start does nothing.
	 */
	public void start() {
		if (!isRunning()) {
			this.startTime = System.nanoTime();
			running = true;
		}
	}

	/**
	 * Stop the stopwatch. If the stopwatch is already stopped, then stop does
	 * nothing.
	 */
	public void stop() {
		if (isRunning()) {
			this.stopTime = System.nanoTime();
			running = false;
		}
	}
}
