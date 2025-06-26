package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 우주를 공격하고 싶다.
		 * Weapon 추상 클래스를 상속 받은 클래스를 파일로 만들어야 하는 귀찮음
		 * Local Inner Class로 만들면 편하겠다.
		 */
		
		class SpaceWewapon extends Weapon{
			@Override
			public void attack() {
				prepare();
				System.out.println("우주를 공격해요");
			}
		}
		Weapon w1=new SpaceWewapon();
		w1.attack();
		
		// Weapon type 의 변수를 만들기도 귀찮다.
		new SpaceWewapon().attack();
	}
}
