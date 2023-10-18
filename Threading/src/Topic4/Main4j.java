package Topic4;

public class Main4j {
	public static void main(String[] args) {
		Runnable r1 = new MyRunnable4j();
		Runnable r2 = new MyRunnable4j(6);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		System.out.println(Thread.currentThread().getName()+" priority is "+Thread.currentThread().getPriority());
		t1.start();
		t2.start();
	}
}
