package test.main;

import test.mypac.Operator;

public class MainClass07 {
	public static void main(String[] args) {
		// 더하기 연산을 해서 결과값을 리턴해주는 Operator type 객체
		Operator plus = (double num1, double num2)->{
			return num1+num2;
		};
		System.out.println(plus.execute(5, 3));
		
		// 람다 표현식 (매개변수의 type 생략 가능)
		Operator minus = (double num1, double num2) -> {
			return num1-num2;
		};
		System.out.println(minus.execute(5, 3));
		
		// 메소드의 {} 생략하고 return 예약어 없이 리턴할 값만 -> 우측에 작성
		Operator multiply = (a, b) -> a*b;
		
		double result1=plus.execute(10, 10); //20
		double result2=minus.execute(10, 10); //0
		double result3=multiply.execute(10, 10); //100
	}
}
