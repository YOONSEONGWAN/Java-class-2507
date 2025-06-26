package test.mypac;


// 공중 공격을 담당하는 무기를 만든다고 가정 
public class SkyWeapon extends Weapon {
	/*
	 * 	Weapon(추상 클래스로 생선된 객체)이 제공해주는 기능을 활용하며
	 * 	attack()을 나의 상황에 맞게 구현할 수 있다.
	 */
	// 어택 오버라이드를 강제함. 
	// 웨폰은 누가 만들어줬지만 공격은 내가 할 수 있다는 장점
	@Override
	public void attack() {
		this.prepare(); // 부모객체가 제공하는 기능도 사용 
		System.out.println("공중 공격을 해요");
	}
}
