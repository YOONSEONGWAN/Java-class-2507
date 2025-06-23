package test.main;
/*
 * 	[ 기본 data type의 참조 data type ]
 * 	byte : Byte
 * 	short :Short
 * 	int : Integer
 * 	long : Long
 * 
 * 	float : Float
 * 	double : Double
 * 
 * 	char : Character
 * 	boolean : Boolean
 * 	- 때로는 기본 데이터 type의 참조데이터 type이 필요할 때가 있다.
 * 	- 기본 데이터 타입을 객체에 boixng포장하는 형태
 * 	- boxing과 unboxing은 자동으로 되기 때문에 신경 안 써도 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//기본데이터 type의 참조데이터 type 사용해보기
		Byte b=10;
		Short s=20;
		Integer i=30;
		Long l=40L;
		
		Float f=10.1f;
		Double d=10.2d;
		
		Character c='a';
		Boolean isRun=true;
		int num=10;
	}
}
