package test.mypac;

public class MyWeapon extends Weapon {
	
	// 추상클래스를 상속받으면 오버라이드가 강제된다.
	@Override
	public void attack() {
		this.prepare();
		System.out.println("지상공격을 해요");
	}
}
