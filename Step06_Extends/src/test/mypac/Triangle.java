package test.mypac;

public class Triangle extends Shape {
	private double base;
	private double height;
	
	public Triangle(int x, int y, double base, double height) {
		super(x, y);
		this.base=base;
		this.height=height;
	}
	
	public void printArea() {
		double area=base*height*0.5;
		System.out.println("삼각형의 넓이는: "+area);
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("밑변의 길이: "+base+", 높이: "+height);
	}
}
