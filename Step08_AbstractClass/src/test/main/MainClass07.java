package test.main;

import test.mypac.SkyWeapon;
import test.mypac.Weapon;

public class MainClass07 {
	public static void main(String[] args) {
		
		/*
		 * 	여기서 아래의 정의된 useWeapon() 메소드를 호출하려면?
		 */
		
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				prepare();
				System.out.println("무기를 사용해요!");
			}
		});
		Weapon w1 = new SkyWeapon();
		useWeapon(w1);
		
		Weapon w2 = new Weapon() {
			@Override
			public void attack() {
				prepare();
				System.out.println("무차별난사");
			}
		};
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.attack();
	}

}
