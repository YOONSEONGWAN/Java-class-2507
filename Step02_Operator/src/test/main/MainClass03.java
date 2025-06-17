package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		
		/*
		 * i 라는 변수를 만듥 초기값 0 대입
		 * i 가 10보다 작은 동안에 반복한다 (적당한 for문 블럭 실행
		 * i 를 1씨 올리면서 
		 *  논 for문 안에서 만들어진 자연변수(for문이 종료되면 i는 사라진다
		 */
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		// 콘솔창에 9부터 0까지 순서대로 출력되도록  
		// 9 8 7 6 ,,, 0
		/* i란 변수 만들고 초기값 9 대입.
		 * i가 0 이상인 동안에 반복한다.
		 * i를 1씩 감소 시키면서*/
		for(int i=9; i>=0; i--){
		System.out.println(i);
		
		//i를 두 번 선언할 수 있는 이유  2. 지역변수, */ 
	}
	}
}
