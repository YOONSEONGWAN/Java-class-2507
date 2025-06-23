package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		//String type 이 저장되어 있는 배열 
		String[] data = {"🍒", "🍎", "🍌", "🍈", "7"};
		
		//위의 배열에 저장된 5개 문자열 중에서 랜덤하게 1개만 출력되도록
		Random ran=new Random();
		int score = 0;
		
		String ranString=data[ran.nextInt(5)];
		String ranString2=data[ran.nextInt(5)];
		String ranString3=data[ran.nextInt(5)];
		
		System.out.print(ranString);
		System.out.print(ranString2);
		System.out.println(ranString3);
		
		if(ranString.equals(ranString2)&& ranString.equals(ranString3)) {
			System.out.println("🎉🎉 당첨!! 축하합니다~ 🎉🎉");
			switch (ranString) {
			case "7":
				score += 1000;
				break;
			default:
				score += 100;
				break;
				
			}
		}else {
			score -= 25;
			System.out.println("꽝! 다음 기회에~ 😝");
			System.out.println(score);
		}
	}
}
