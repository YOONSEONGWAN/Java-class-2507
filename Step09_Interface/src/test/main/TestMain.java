// 이 클래스가 속해 있는 패키지 명시하기 (없으면 에러)
package test.main;
// 클래스 안에서 사용하는 다른 클래스나 인터페이스 import 

public class TestMain {// class 의 범위를 나타내는 중괄호 "시작"
	/*
	 * 	클래스 안에 무언가를 정의 할 땐, 들여쓰기를 통해
	 * 	클래스 안에 속한 걸 표시해준다
	 * 	클래스 안에 정의할 수 있는 것
	 * 	1. 필드, static 필드
	 * 	2. 메소드, static 메소드
	 * 	3. 생성자
	 * 	4. 또 다른 클래스 (Inner Class)
	 * 	순서가 정해진 건 아니지만 보통 필드 => 생성자 => 메소드 순으로 정의.
	 */
	
	//필드
	public String name="김구라";
	//static 필드
	public static String yourname="해골";
	
	//생성자(method 와 닮아 있지만 return type 이 없고 클래스명과 동일해야)
	public TestMain() {
		// 어디에선가 new TestMain() 해서 객체를 생성하면 여기가 실행.
		System.out.println("TestMain 생성자가 호출됨");
		// 생성자 안에는 지역변수를 만들 수 있다. 
	}
	//method
	public void test() {
		// 여기는 메소드 내부 new TestMain.test();로 호출
		// 어디에선가 이 클래스(TestMain)로 생성된 객체의 test() 메소드를 		호출하면 여기가 실행
		System.out.println("test() 메소드 호출됨 ");
		// 메소드 안에는 지역변수를 만들 수 있다.(메소드는 못 만든다.)
	}
	
	// static 메소드
	public static void doSomething() {
		// 어디에선가 클래스명에 . 찍어서 호출하는 메소드 		TestMain.doSomething(); 으로 호출
		System.out.println("doSomething() 메소드 호출됨");
	}
	
	// run 했을때(application 을 실행) 실행의 흐름이 시작되는 아주 특별한 	main 메소드
	public static void main(String[] args) {
		// application 의 동작을 여기서 준비한다. 
		// 객체 생성이나, 반복문, 메소드 호출 등등을 여기서 연습中...
		
	}
	
}// 클래스의 범위를 나타내는 중괄호 "끝"
