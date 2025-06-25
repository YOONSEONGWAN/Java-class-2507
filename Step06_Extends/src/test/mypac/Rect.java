package test.mypac;

public class Rect extends Shape {
	/*
	 * 	Shape Class를 상속 받아서
	 * 	Rect 클래스 만들어보기 
	 */
	private double qus1;
	
	public Rect(int x, int y, double qus1) {
		super(x, y);
		this.qus1=qus1;
	}
	//printArea(); 메소드가 동작하기 위해 메소드 추가
	public void printArea() {
		double area = qus1*qus1;
		System.out.println("정사각형의 넓이는: "+area);
	}
	//printInfo(); 메소드가 동작하기 위해 메소드 추가
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("한 변의 길이: "+this.qus1);
	}
	
	/*
	Rect r1=new Rect(100, 200, 50);
	r1.printArea();
	r1.printInfo();
	*/
}
