package test.main;

import test.mypac.Drill;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 	여기는 팀원이 코딩한다고 가정
		 * 	팀원이 직접 Drill type 객체를 생성해서
		 * 	어디에 구멍을 뚫을지 마음대로 결정할 수 있다. 
		 */
		
		Drill d1=new Drill() {
			
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요!");
			}
			
		};
		useDrill(d1);
		
		// 메소드가 하나일 경우 간단하게 표현하기
		// 아래가 오버라이드 된 추상 메소드
		Drill d2 = ()->{
			System.out.println("화살표 바닥에 구멍을 뚫어요!");
		}; 
		MainClass05.useDrill(d2); 
		// 1. 메인클래스05의 스태틱필드에서
		// 2. useDrill 생성자를 찾아 생성 후 생성자의 메소드 실행
		// 3. 생성자의 메소드는 Drill 타입이고, 
		// 4. 그 안에서 hole 이라는 메소드를 실행하니까
		// 5. Drill 타입 클래스에서 hole 메소드 찾아 실행  
		
		useDrill(()->{
			System.out.println("구멍을 바로 뚫어요");
		});
	}
	/*
	 * 	useDrill() 기능을 만드는 프로그래머 입장에서 생각해보자
	 * 	Drill 인터페이스는 본인이 미리 만들어 놓은 상태.
	 * 	메소드 안에서 Drill 객체를 이용해서 어떤 복잡한 동작을 미리 만들어놓을 수 있다.
	 */
	public static void useDrill(Drill d) { 
		d.hole();
	}
}
