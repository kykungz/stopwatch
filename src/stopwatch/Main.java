package stopwatch;

public class Main {
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
		taskTimer.runTask(new AppendStringBuilderTask(100000));
		taskTimer.runTask(new SumDoublePrimitiveTask(1000000000));
		taskTimer.runTask(new SumDoubleTask(1000000000));
		taskTimer.runTask(new SumBigDecimalTask(1000000000));

	}
}
