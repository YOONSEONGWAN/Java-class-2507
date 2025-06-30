package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("나눌 수를 입력: ");
		String inputNum1=scan.nextLine();
		System.out.println("나누어지는 수 입력: ");
		String inputNum2=scan.nextLine();
		
		try {
			// 문자열 형태의 숫자를 실제 정수로 변경
			int num1=Integer.parseInt(inputNum1);
			int num2=Integer.parseInt(inputNum2);
			// 계산해보기
			int result1=num2/num1; // 몫
			int result2=num2%num1; // 몫
			System.out.println(num2+"를"+num1+"로 나눈 몫:"+result1);
			System.out.println(num2+"를"+num1+"로 나눈 나머지:"+result2);
		}catch(NumberFormatException nfe){
			// 예외 객체에 담긴 메시지
			System.out.println(nfe.getMessage());
			System.out.println("좋은 말 할 때 숫자 입력해라");
		
		}catch(ArithmeticException ae) {
			System.out.println("어던 수를 0으로 나눌 순 없습니다.");
		}
		System.out.println("main 메소드 종료 됩니다.");
	}
}
