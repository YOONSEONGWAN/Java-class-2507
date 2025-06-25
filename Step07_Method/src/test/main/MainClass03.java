package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		//printSum() 메소드 3번 호출
		MainClass03.printSum(1, 2);
		printSum(10, 87);
		printSum(123712, 23701);
	}
	
	public static void printSum(int num1, int num2) {
		int result = num1+num2;
		System.out.println(num1+"과 "+num2+"의 합: "+result);
	}
}
