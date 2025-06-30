package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MainClass12 {
	public static void main(String[] args) {
		// 1. 로또 번호를 담을 HashSet 객체를 생성해서 Set type set1 			지역변수에 담아보세요
		Set<Integer> set1=new HashSet<>();
		// 2. Random 객체를 생성해서 참조값을 ran 이라는 지역변수에 담아 			보세요
		Random ran = new Random();
		/*
		 * 	3. while 문을 이용해서 랜덤 로또 번호를 set1에 반복적으로 담기
		 * 
		 * 	while 문은 무한 루프로 만들고 while 문 탈줄 조건은
		 * 	set1.size() 가 6이 되면 탈출하도록 하기
		 * 
		 * 	ran.nextInt(45) +1 은 1~45 사이의 랜덤정수 얻을 수 있습니다.
		 * 	로또 번호는 총 6개 입니다.
		 */
		
		
		// 방법1
		/*while(set1.size() < 6) {
			int lotto = ran.nextInt(45)+1;
			set1.add(lotto);}*/
		// 방법2
		while(true) {
			int ranNum=ran.nextInt(45)+1;
			set1.add(ranNum);
			if (set1.size()==6) {
				break;
			}
		}
		//	4. set1에 담긴 번호를 모두 하나씩 콘솔창에 출력해 보세요
		set1.forEach(num -> System.out.print(num+"  "));
		//	5. AI 에게 물어 봐서 set1에 담긴 내용을 List 에 담은 뒤 			오름차순 정렬
		List<Integer> lnum = new ArrayList<>(set1);
		Collections.sort(lnum);
		// 6. 오름차순 정렬된 번호를 하나씩 순서대로 콘솔창에 출력.
		System.out.println();
		//System.out.println("로또 번호: " + lnum);
		// 하나씩
		lnum.forEach(item -> System.out.print(item+" "));
	}
}
