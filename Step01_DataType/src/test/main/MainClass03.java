package test.main;

/* [Java 기본 데이터 type]
 * 2. 논리형(boolean)
 * 
 * - true, false 둘 중 하나
 * - true, false를 직접 쓰거나 비교연산 혹은 논리 연산의 결과로 얻어낼 수 있다.
 * - 참과 거짓을 나타래려는 데이터타입
 */

public class MainClass03{ 
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun = true;
		
	if(isRun) {
		System.out.println("달려요" );
		
	}
	//비교 연설문의 결과로 얻어진 boolean 값 담기
	boolean isGreater = 10>1;
	//논리 연산의 결과로 얻어진 boolean값 알기
	boolean result=true||false;
	//한 번 선언한 변수는 재선언 불가능
	result=false; //동일한 타입인 경우, 변수에 다른 값을 대입할 수 있다.
		
}

}
