package Topic4;

public class MyRunnable4j implements Runnable {

	private int priority;
	
	public MyRunnable4j() {
	}

	
	public MyRunnable4j(int priority) {
		super();
		this.priority = priority;
	}

	@Override
	public void run() {
		if(priority!=0)
			Thread.currentThread().setPriority(priority);
		System.out.println(Thread.currentThread().getName()+" priority is "+Thread.currentThread().getPriority());
	}

}
