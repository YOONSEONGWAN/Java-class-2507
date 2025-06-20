package test.util;

import test.auto.Car;

public class MyUtil {
	// non static 필드 
	public String owner;
	//Car type을 담을 수 있는 static 필드
	public static Car car; //필드에는 선언만 하면 null이 들어감
	
	//data type 앞에 static 예약어를 넣어서 static 필드를 만들 수 있다.
	//필드는 선언시에 초기값을 넣어줄 수도 있다.
	public static String version="1.0";
	
	//method의 return type 앞에 static 예약어를 붙여 static 메소드를 만들 수 있다.
	public static void send() {
		System.out.println("전송합니다.");
	}
}

