package Topic4;

public class Main4cdefgh {

	public static void main(String[] args) {
		System.out.println(Thread.MIN_PRIORITY); //4c. What is Thread.MIN_PRIORITY? 
		System.out.println(Thread.NORM_PRIORITY); //4d. What is Thread.MAX_PRIORITY? 
		System.out.println(Thread.MAX_PRIORITY); //4e. What is Thread.NORM_PRIORITY? 
		
		System.out.println(Thread.currentThread().getPriority());//4f. How to get priority of a thread? 
		Thread.currentThread().setPriority(9);//4g. How to set priority of a thread? 
		System.out.println(Thread.currentThread().getPriority());

		try {
			Thread.currentThread().setPriority(11); //4h. How to set priority of a thread? 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
