package test.main;

import test.mypac.MyWeapon;
import test.mypac.SeaWeapon;
import test.mypac.SkyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		Weapon w1=new SkyWeapon();
		w1.attack();
		//위에는 공중 아래는 지상공격
		Weapon w2=new MyWeapon();
		w2.attack();
		
		/*
		 * 	해상 공격을 하는 Weapon type 객체를 만들어서 
		 * 	.attack() 메소드를 호출했을 때 해상공격이 되도록 구현
		 * 	단, 기존 클래스 수정 금지
		 */
		Weapon w3=new SeaWeapon();
		w3.attack();
	}
}
