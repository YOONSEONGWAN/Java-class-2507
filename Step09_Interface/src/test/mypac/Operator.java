package test.mypac;

@FunctionalInterface //메소드 하나인 게 강제됨
public interface Operator {
	//매개변수에 전달되는 두 수를 연산해서 결과값을 리턴해주는 추상 메소드(구현은 자유)
	public double execute(double num1, double num2);
	// 리턴 값으로 double을 되돌려주는 메소드다
}
