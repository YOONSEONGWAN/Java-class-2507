package test.main;
/*
 * 	4. 논리 연산자 테스트 
 * 	&&, ||, !
 * 	and, orm not
 * */
public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * or연산 또는 이라고 읽으면 된다.
		 * 하나만 트루이면 트루 반환
		 * 모두 false일때만 false 반환
		 * */
		boolean result1 = false||false; //false
		boolean result2 = false||true;  //true
		boolean result3 = true||false; //true
		boolean result4 = true||true; //true
		
		/*and 연산
		 * 그리고
		 * 
		 * 모두 다 true여야 true
		 * 하나만 false여도 false
		 */
		boolean result5 = false&&false; //false
		boolean result6 = false&&true;  //false
		boolean result7 = true&&false; //false
		boolean result8 = true&&true; // true
		
		/*not연산
		 * ~가 아니면 이라고 읽음
		 * 
		 * boolean값 반전시킴 */
		boolean result9 = !true; //false
		boolean result10 = !false;  //true
		
	}
}
