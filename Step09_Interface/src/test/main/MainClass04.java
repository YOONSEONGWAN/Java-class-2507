package test.main;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		// 인터페이스도 익명의 InnerClass를 이용해서 구현 객체 생성 가능
		Remocon r1=new Remocon() {
			
			@Override
			public void up() {
				System.out.println("채널 올려요!");
			}
			
			@Override
			public void down() {
				System.out.println("채널 내려요!");
			}
		};
		// 지역변수 r1 에 있는 참조값을 전달하면서 메소드 호출
		useRemocon(r1);
		//메소드 호출하면서 즉석 객체 생성 호출
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("변수 없이 채널 올려요!");
			}
			@Override
			public void down() {
				System.out.println("변수 없이 채널 내려요!");
			}
		});
	} // 여기까지 메인메소드의 지역변수
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
