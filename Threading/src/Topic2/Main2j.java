package Topic2;

public class Main2j {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" starting");
		MyThread2j myThread = new MyThread2j(); 
		myThread.start();
		System.out.println(Thread.currentThread().getName()+" ending");

	}

}
