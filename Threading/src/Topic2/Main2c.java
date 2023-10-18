package Topic2;

public class Main2c {

	public static void main(String[] args) {
		System.out.println("Main 2c starting");
		MyThread2c myThread = new MyThread2c(); // 2e. How to instantiate a thread? 
		myThread.start(); //2f. How to start a thread?
		System.out.println("Main 2c ending");

	}

}
