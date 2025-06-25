package test.mypac;

// Shape 클래스를 상속 받아서 Circle 클래스 정의하기
public class Circle extends Shape{
	//원의 반지름을 저장할 필드
	private int radius;
	//double area;
	
	public Circle(int x, int y, int radius) {
		super(x, y); // super()는 부모 클래스의 생성자를 의미.
		//자식이 받아서 부모 생성자로 전달. 자식껀 자식에게
		// 부모객체가 먼저 만들어져야 하기 때문에 그 전에 코드가 오면 안 		된다.
		this.radius=radius;
	}

	public void printArea() {
		//원의 넓이
		double area = Math.PI*radius*radius;
		System.out.println("원의 넓이는: "+area);
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("반지름: "+this.radius);
	}
}
