package test.main;

import test.mypac.Drill;

public class TestMain02 {
	public static void main(String[] args) {
		Drill d1=new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요!");
			}
		};
		useDrill(d1); // 메소드를 실행
		// 위를 더 간단히 표현
		Drill d2 = () ->{//new Drill(){}, 오버라이드, 메소드 생략 하고 ()로만 표현 
			
		};
	}
	// 1. Drill 인터페이스를 임포트
	// 2. 클래스 안에 스태틱 메소드를 하나 만들었음: 구멍 뚫는 메소드
	public static void useDrill(Drill d) {
		d.hole();
	}
}
