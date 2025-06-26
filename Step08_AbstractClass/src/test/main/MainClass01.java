package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		//추상 클래스도 data type 의 역할을 할 수 있다.
		Weapon w1=null;
		
		//그럼 Weapon의 참조값은 어떻게 얻을까
		// 추상클래스는 data type 의 역할은 할 수 있지만 단독 객체생성은 불가능하다
		// Weapon w2= new Weapon(); < 이게 안 된다는 말.
		
		// Weapon 추상클래스를 상속받은 MyWeapon 클래스로 객체를 생성해서 Weapon type 의 참조값 얻어내기 
		// 다형성에 의해 MyWeapon은 부모 타입인 Weapon도 가능 
		Weapon w2= new MyWeapon();
		w2.prepare();
		w2.attack();
		}
}
