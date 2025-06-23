package test.main;

import java.io.InputStream;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  1. 콘솔창으로부터 입력 받을 수 있는 Scanner 객체를 생성해서 그 참조값을 scan이라는 지역변수에 담아보세요.
		 *  2. scan에 담겨있는 Scanner 객체를 2번 사용해서 콘솔창으로부터 숫자를 2개 입력 받아보세요.
		 *  3. 입력받은 숫자(문자열)를 실제 숫자로 변경하세요.
		 *  4. 두 수의 합을 구해서 콘솔창에 이쁘게 출력해 보세요.
		 */
		
		
		InputStream is=System.in; 
		//바이트 기반입력스트림. 입력데이터를 바이터 단위로 읽는다.
		Scanner scan=new Scanner(is); 
		// is라는 바이트 스트림을 문자로 읽을 수 있게 감싸준다.
		System.out.println("첫 번째 숫자 입력:");
		String result1=scan.nextLine();
		// 위에서 입력된 값을 문자열, 스트링으로 돌려줌. 
		//nextLine: 줄 단위로 개행기호 전까지 읽어준다 
		System.out.println("두 번째 숫자 입력:");
		String result2=scan.nextLine();
		double pa1=Double.parseDouble(result1);
		double pa2=Double.parseDouble(result2);
		double sum1=pa1+pa2;
		String info=String.format("%f 과 %f 의 합은: %f",pa1, pa2, sum1);
		System.out.println(info);
		//System.out.println(pa1+"과 "+pa2+"의 합은: "+sum1);
		
		
		Scanner scan2=new Scanner(is);
		System.out.println("첫 번째 숫자 입력:");
		String result3=scan2.nextLine();
		System.out.println("두 번째 숫자 입력:");
		String result4=scan2.nextLine();
		double pa3=Double.parseDouble(result3);
		double pa4=Double.parseDouble(result4);
		if (pa3 == pa4) {
			System.out.println("두 숫자가 같아요!");
		}else if (pa3>pa4) {
			System.out.println("첫 번째 숫자가 커요");
		}else if (pa3<pa4) {
			System.out.println("두 번째 숫자가 커요");
		}
	}
}
