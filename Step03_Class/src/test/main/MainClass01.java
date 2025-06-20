package test.main;
import java.io.File;
import java.io.IOException;
// java.util package에 있는 Random 클래스를 import
import java.util.Random;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) throws IOException {
		System.out.println("메인 메소드 시작");
		//기본 데이터 type의 값이 담길 수 있는 빈 공간은 만들 수 없다 ex. int num=null;
		int num; //선언만 하면 변수가 만들어지지 않고 만들어질 준비만 한다. 디버깅 모드에서 해도 만들어지지 않고 넘어간다. 자바 스크립트는 언디파인드로 만들어지는 것과는 다름
		num = 10; // 값을 넣는 시점에 만들어진다. 
		
		//문자열을 다룰 때는 스트링타입을 사용
		String name="kim";
		
		String str = null;
		//랜덤한 숫자를 얻어내고 싶다면? 랜덤한 숫자를 뱉어주는 객체가 필요하다. ran에는 random 타입만 들어갈 수 있다.
		Random ran = null;
		ran=new Random();  //랜덤 객체 생성. 새로운 객체를 만들겠다(new)
		boolean result1=ran.nextBoolean();
		
		System.out.println(result1);
		
		int result2=ran.nextInt();
		System.out.println(result2);
			
		// 콘솔창에 문자열을 출력하고 싶다면? 콘솔창에 문자열을 출력해주는 기능을 가진 객체가 필요하다.
		
		// 파일 시스템에 memo.txt 파일을 만들고 싶다면? 파일을 만들 수 있는 기능을 가진 객체가 필요하다. 
		File f = new File("C://playground/memo.txt"); 
		f.createNewFile();
		
		//콘솔창에 입력한 숫자나 문자열을 읽어들이고 싶다면? 콘솔창에 입력한 내용을 이용해서 int나 String을 만들어내는 기능을 가진 객체가 필요하다.
		Scanner scan = new Scanner(System.in);
		String line=scan.nextLine();
		
		System.out.println("main 메소드가 종료되었습니다.");
	}
}
