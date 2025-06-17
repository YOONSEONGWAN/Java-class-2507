package test.main;
/*
 *  1. 산술연산자 테스트
 *  
 *   +, -, *, /, %
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num1=5;
		int num2=2;
		//+연산하기
		int sum = 10 + 1; 
		int sum2 = num1 + num2;
		int sum3 = 10 + num2;
		//정수끼리 연산시 결과는 정수만 나온다.
		int result1 = 5/3;
		int result2 = num1 /num2;
		//연산의 결과로 실수 값을 얻어내고 싶으면 적어도 하나는 실수여야 한다.
		//double result3 = 5/3.0; ==
		double result3 = 5/ (double)3;
		//10을 3으로 나눈 나머지 값을 변수에 담기
		int result4 = 10%3;
		
		 
		byte a = 10;
		// a는 byte type인데 a에 저장된 값을 int type b에 대입하는 건 문제가 없을까. -> 인트가 훨씬 넓으니까 문제가 없다.
		int b = a;
		// b는 int type인데 b에 저장된 값을 byte type c에 대입하는 건 문제가 없을까. -> 인트가 크기 때문에 에러가 날 수도 있다. 항상 못 담은 건 아니다.
		byte c = (byte)b;
		/* (byte)처럼 캐스팅 연산자를 쓰면 우측에 바이트 타입이 있다고 인식을 시켜주기 때문에 문법이 성립한다. 
		 * 대신 b 안에 들어있는 값이 byte 범위 안에 있는 게 확실할 때에만 casting해야 오류가 없다. 
		 * 
		 */
		int d = 1000;
		byte e = (byte)d; //이렇게 강제로 해도 성립은 된다. 값 자체는 틀린 값이다.
		
		
	}
}
