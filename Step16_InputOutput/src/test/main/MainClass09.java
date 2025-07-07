package test.main;

import java.io.File;
import java.io.FileReader;

public class MainClass09 {
	public static void main(String[] args) {
		File f=new File("memo.txt");
		try {
			// 파일로부터 문자열을 읽어들일 수 있는 객체(f)
			var fr=new FileReader(f);
			// 한 번에 한 글자이기 때문에 반복문 돌아야
			//무한 루프 돌면서
			while(true) {
				int code=fr.read();
				if (code==-1)break; // 더이상 읽을 문자 없을 때 탈출
				// code 를 문자로 변환
				char ch=(char)code;
				System.out.print(ch);
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
