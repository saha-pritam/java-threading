package Topic3;

public class Main3k {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" starting");
		Runnable runnable = new MyThread3k();
		Thread thread = new Thread(runnable); // 3c. How to instantiate thread when using runnable interface? 
		thread.start(); //3d. How to start thread when using runnable interface? 
		System.out.println(Thread.currentThread().getName()+" ending");
	}

}
