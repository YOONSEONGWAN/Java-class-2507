package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main method start");
		
		try {
			/*
			 * 	Thread.sleep() 메소드 내부에서는 RuntimeException 을
			 * 	상속 받지 않은 
			 * 	InterruptedExcpetion 이 발생. RuntimeException 을
			 * 	상속 받지 않은 예외는 예외 처리를 의무적으로 해야 한다.
			 * 
			 * 	방법
			 * 	1. throw
			 * 	2. try~catch 로 묶어주기 
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println("main method quit");
	}
}
