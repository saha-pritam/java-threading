package Topic3;

public class MyThread3k implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("Child Thread");
		for(int i=0;i<=10;i++)
			System.out.println(Thread.currentThread().getName()+" - "+i);
	}
}
