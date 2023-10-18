package Topic4;

public class Main4k {
	public static void main(String[] args) {
		Runnable r1 = new MyRunnable4k(6);
		Thread t1 = new Thread(r1);
		t1.start();
		for(int i=1;i<=10;i++)
			System.out.println(Thread.currentThread().getName()+" priority is "+Thread.currentThread().getPriority()+" and i = "+i);
	}
}
