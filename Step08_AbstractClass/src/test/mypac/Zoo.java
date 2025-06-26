package test.mypac;

public class Zoo {
	// Inner Class. 내부 클래스
	public class Monkey{
		public void say() {
			System.out.println("안녕 나는 원숭이야.");
		}
	}
	public class Tiger{
		public void roar() {
			System.out.println("안녕 나는 어흥이야~");
		}
	}
	// 메소드 (호출되면 객체 생성해서 리턴)
	public Monkey getMonkey() {
		return new Monkey();
	}
	// 메소드 ( 호출되면 Tiger 객체 생성해서 리턴)
	public Tiger getTiger() {
		return new Tiger();
	}
}
