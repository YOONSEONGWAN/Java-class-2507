package test.main;

import test.auto.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// car type 객체의 참조감(id)을 담을 수 있는 c1이라는 이름의 비어있는 변수 만들기
		Car c1 = null;
		// Car class로 객체를 생성하고 할당된 참조값을 c1에 대입하기 
		c1 = new Car();
		// c1에 들어있는 참조값을 이용해서 drive() 메소드 호출하기
		c1.drive();
		
		// Car 클래스로 객체를 하나 더 생성하고 할당된 참조값을 c2대입
		Car c2 = new Car();
		//c2에 있는 참조값을 이용해서 drive() 메소드 호출. 이때 달리는 객체는 서로 다른 객체다.
		c2.drive();
		
		System.out.println("maim 메소드가 종료 됩니다.");
	}
}
