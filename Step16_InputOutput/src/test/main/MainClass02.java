package test.main;

import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// 1 byte 처리 스트림
		InputStream kbd=System.in;
		// 2 byte 처리 스트림( 65336 가지 표현이 가능하다) 한글 처리 가능한 객체
		var isr= new InputStreamReader(kbd);
		System.out.println("입력: ");
		
		try {
			// InputStreamReader 객체로 입력한 문자의 code 값 읽어내기
			int code=isr.read(); // 한글 처리가 가능하지만 한 글자만 읽음
			System.out.println("code: "+code);
			char ch=(char)code;
			System.out.println("ch: "+ch);			
		} catch (Exception e) {

		}
				
	}
}
