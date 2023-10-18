package Topic2;

public class MyThread2c extends Thread{

	@Override
	public void run() {
		//2d. What is Job of a thread?
		for(int i=0;i<=10;i++)
			System.out.println("MyThread :- "+i);	}

}
