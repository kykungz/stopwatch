package stopwatch;

public class TaskTimer {
	private Stopwatch timer;
	public TaskTimer() {
		this.timer = new Stopwatch();
	}
	public void runTask(Runnable task) {
		System.out.print(task.toString());
		timer.start();
		task.run();
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
