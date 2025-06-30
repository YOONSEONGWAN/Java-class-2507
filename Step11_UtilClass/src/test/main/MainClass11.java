package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		
		int i=0;
		// 무한 루프는 실해하다가 break 문을 만나면 탈출할 수 있다.
		while (i<5) {
			System.out.println(i+"반복합니다.");
			i++;
		}
		
		System.out.println("---------------");
		
		int j=0;
		while(true) {
			System.out.println(j+"반복합니다.");
			j++;
			if(j==5) {
				break;
			}
		}
	}
}
