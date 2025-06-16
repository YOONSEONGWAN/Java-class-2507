package test.main;
/*
 * 	[ Java 참조 데이터 type ]
 * 	
 * 	String type
 * 
 * 	- 문자열을 다룰 때 사용하는 data type이다. 
 * 	
 * 	* 8가지 기본데이터 말고는다 참조데이터이다
 */
public class MainClass05 {
	public static void main(String[] args) {
		//김구라라는 Sting type 객체를 heap 영역에 만들고 그 		참조값을 변수에 담기
		String name="김구라";
		//name 안에 있는 참조값을 tmp 변수에 복사해주기
		String tmp=name;
		//원숭이라는 Sting type 객체를 heap영역에 만들고 그 참조값을 name 변수에 덮어쓰기
		name="원숭이";
		//name 변수를 비우기
		name=null;
		
		//변수 안에 참조값이 들어가는 게 아니고 실제 값이 들어가는 기본 데이터 type
		int num=10;
		double num2=10.1;
		boolean isRun=true;
		//변수 안에 참조값이 들어가는 참조 데이터 type인 String(id가 들어감)
		String yourName="해골";
		
		num.
	}
}
