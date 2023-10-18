package Topic4;

public class MyRunnable4k implements Runnable {

	private int priority;
	
	public MyRunnable4k() {
	}

	
	public MyRunnable4k(int priority) {
		super();
		this.priority = priority;
	}

	@Override
	public void run() {
		if(priority!=0)
			Thread.currentThread().setPriority(priority);
		for(int i=1;i<=10;i++)
			System.out.println(Thread.currentThread().getName()+" priority is "+Thread.currentThread().getPriority()+" and i = "+i);
	}

}
