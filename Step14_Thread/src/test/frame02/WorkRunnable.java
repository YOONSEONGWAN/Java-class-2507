package test.frame02;
/*
 * 	새로운 스레드 만드는 방법2 
 * 	
 * 	1. Runnable 인터페이스를 구현한 클래스를 정의한다.
 * 	2. run() method 강제 오버라이드.
 * 	3. Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성자의 		인자로 전달한다.
 * 		-> new Thread(new WorkRunnable()).start() 
 * 	4. Thread 클래스로 만든 객체의 start() 메소드를 호출해서 스레드 시작 		시킨다.
 */
public class WorkRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("10초 걸리는 작업을 시작합니다.");
		try {
			// 결과적으로 메인 스레드는 10초간 sleep 상태로 된다.
			Thread.sleep(1000*10);
		}catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("작업이 종료 되었습니다.");	
	}

}
