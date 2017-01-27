package stopwatch;

/**
 * Main class, perform some common tasks involving strings and doubles, to
 * compare speed of using different data types.
 * 
 * @author Kongpon Charanwattanakit
 *
 */
public class Main {

	/**
	 * Run the tasks.
	 */
	public static void main(String[] args) {
		// Runnable[] tasks = { new AppendStringTask(50000), new
		// AppendStringTask(100000),
		// new AppendStringBuilderTask(100000), new
		// SumDoublePrimitiveTask(1000000000),
		// new SumDoubleTask(1000000000), new SumBigDecimalTask(1000000000) };
		// TaskTimer taskTimer = new TaskTimer();
		// for (Runnable task : tasks) {
		// taskTimer.runTask(task);
		// }

		TaskTimer taskTimer = new TaskTimer();
		taskTimer.runTask(new AppendStringTask(50000));
		taskTimer.runTask(new AppendStringTask(100000));
		taskTimer.runTask(new AppendStringTask(200000));

		taskTimer.runTask(new AppendStringBuilderTask(50000));
		taskTimer.runTask(new AppendStringBuilderTask(100000));
		taskTimer.runTask(new AppendStringBuilderTask(200000));

		taskTimer.runTask(new SumDoublePrimitiveTask(500000000));
		taskTimer.runTask(new SumDoublePrimitiveTask(1000000000));
		taskTimer.runTask(new SumDoublePrimitiveTask(2000000000));

		taskTimer.runTask(new SumDoubleTask(500000000));
		taskTimer.runTask(new SumDoubleTask(1000000000));
		taskTimer.runTask(new SumDoubleTask(2000000000));

		taskTimer.runTask(new SumBigDecimalTask(500000000));
		taskTimer.runTask(new SumBigDecimalTask(1000000000));
		taskTimer.runTask(new SumBigDecimalTask(2000000000));

	}
}
