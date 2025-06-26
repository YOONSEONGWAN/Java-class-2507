package test.mypac;

public abstract class Weapon {
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	// 공격하는 메소드. 중괄호가 없어서 에러가 남.
	// 클래스랑 메소드에 abstract 를 넣어주면 에러 해결.
	public abstract void attack();
		
}
