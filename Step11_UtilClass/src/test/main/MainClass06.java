package test.main;

import test.mypac.MyFunction;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  MyFunction 인터페이스는
		 *  execute() 추상 메소드 1개, 
		 *  log() default method,
		 *  help() static method 가지고 있다.
		 *  추상메소드 1개이기 때문에 ()->{}로 실행해도 괜찮다. 
		 */
		MyFunction f1 = ()->{
			System.out.println("실행합니다.");
		};
		// 구현 메소드 호출
		f1.execute(); // 이걸 호출하면 f1의 추상 메소드가 실행되며 {}의 		내용 수행
		// default method call. f1 하나에 하나. 디폴트메소드를 하나 		정의할 수 있다
		f1.log();
		// static method. 인터페이스당 하나만 만들어짐
		MyFunction.help();
		
	}
}
