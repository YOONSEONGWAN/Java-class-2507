package test.main;

import java.util.Arrays;

public class MainClass01 {
	
	public static void main(String[] args) {
		/*
		 *  in javascript
		 *  
		 *  let nums=[10, 20, 30, 40, 50, ...];
		 *  
		 *  nums[0]
		 *  nums[1]
		 *  .
		 *  .
		 *  
		 *  in java
		 *   정수가 들어있는 배열의 data type은 int[]로 쓴다.
		 *  int[] nums={10, 20, 30, 40, 50, ...};
		 *   자바에서 배열은 {}를 쓴다.
		 *   자바는 배열이 한 번 만들어지면 size를 늘이거나 줄이지 못함.
		 *  nums[0]
		 *  nums[2]
		 */
		
		int[] nums= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
		
		System.out.println(Arrays.toString(nums));
		
		/*
		 *  "김구라" "해골" "원숭이" "주뎅이" "덩어리" 5개의 문자열이 저장된 배열을 만들고 그 참조값은 name라는 변수에 대입해보세요.
		 */
		
		String[] names= {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		System.out.println(Arrays.toString(names));
	
	
	//nums 배열에 저장된 숫자를 반복문 돌면서 콘솔창에 하나씩 출력하기
	for(int i=0; i<nums.length; i++) {
		System.out.println(nums[i]);
	}
	//names 배열에 저장된 문자열을 반복문 돌면서 콘솔창에 하나씩 순대로 출력
	for(int i=0; i<names.length; i++) {
		System.out.println(names[i]);
	}
	
	
	}
}
