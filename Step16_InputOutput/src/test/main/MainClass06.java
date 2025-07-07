package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		// 콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps=System.out;
		//PrintStream 객체의 참조값을 부모 type 변수에 담기
		OutputStream os=ps;
		// 2byte 처리 스트림이기 때문에 한글 처리 가능 
		var osw=new OutputStreamWriter(os);
		// 좀 더 많은 문자열을 한 번에 출력 가능하도록 하고 개행기호 출력도 가능한
		// BufferedWriter 버퍼드라이터
		var bw=new BufferedWriter(osw);
		try {
			bw.write("하나");
			bw.newLine(); // 운영체제에 맞는 개행기호 자동으로 출력해주는 메소드
			bw.write("두울");
			bw.newLine();
			bw.write("세엣");
			bw.newLine();
			bw.flush(); // 방출
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
