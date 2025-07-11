package test.mypac;

import java.util.Random;

public class MyUtil {
	// 0~9 사이의 랜덤한 정수를 콘솔에 출력하는 메소드,
	// 우연히 7이 나오면 WowException 이 발생하는 메소드.
	public static void generate() {
		Random ran=new Random();
		//0~9 사이의 랜덤한 정수를 발생시켜서
		int ranNum=ran.nextInt(9);
		
		// 만일 우연히 7이라는 숫자가 나오면
		if(ranNum==7) {
			throw new WowException("wowo ! 행운의 7번 !");
		}
		System.out.println(ranNum+"숫자가 나왔습니다.");
	}
	
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요..");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그림 완성");
	}
	// 5초가 걸리는 가상의 전송을 하는 메소드
	public static void send() throws InterruptedException
	{
		System.out.println("5초 동안 전송을 해요...");
		Thread.sleep(5000);
		System.out.println("전송 완료");
		
		// Throws 하는 순간 누군가에게 처리를 해야 한다.
	}
}
