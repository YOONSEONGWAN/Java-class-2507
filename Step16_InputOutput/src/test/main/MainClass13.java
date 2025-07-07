package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass13 {
	public static void main(String[] args) {
		try {
			// 파일로부터 byte 알갱이를 읽어들일 객체 생성
			var fis=new FileInputStream("c:/playground/SouthKorea.png");
			// byte 알갱이를 파일에 출력할 객체 생성
			var fos=new FileOutputStream("c:/playground/copied2.png");
			// byte 알갱이 1024개(1 kilo byte)를 한 번에 읽을 수 있는 배열 객체 생성
			byte[] buffer=new byte[1024];
			// 반복문 돌면서
			while(true){
				int readedCount=fis.read(buffer); 
				// 몇 바이트를 읽었는지를 리턴
				// 더이상 읽을 byte 가 없다면 반복문 탈출
				if(readedCount == -1)break;
				// 배열 안에 읽어들인 데이터를 읽은 갯수만큼 출력하기
				fos.write(buffer, 0, readedCount); // 배열을 0번 방으로부터 읽은 만큼 출력
				fos.flush();
			}
			System.out.println("파일을 copy 했습니다.");
			// 마무리 작업
			fos.close();
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
