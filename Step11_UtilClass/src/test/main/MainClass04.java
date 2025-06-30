package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass04 {
	public static void main(String[] args) {
		// 인사말을 담을 ArrayList 객체를 생성해서 참조값을 greets 라는 지역변수에 대입하기
		ArrayList<String> greets=new ArrayList<>();
		greets.add("hello");
		greets.add("hi");
		greets.add("good night");
		
		// Generic 이 String 인 이유는 위의 제너릭이 스트링이기 때문
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String t) {
				// t 는 Consumer 객체를 사용하는 ArrayList 객체에
				// 저장된 item 이 전달된다.
				System.out.println(t);
			}
		};
		
		/*Consumer<String> con2=(item)->{
			System.out.println(item);
		};*/
		
		/*
		 *  forEach() 메소드를 호출하면서 전달한 Consumer 객체의 
		 *  accept() 메소드가
		 *  배열에 저장된 item 의 갯수만큼 호출되고
		 *  메소드의 매개 변수에는 배열에 저장된 아이템들이 순서대로 나온다. 
		 */
		greets.forEach(con);
		
		System.out.println("------------------------");
		
		// Consumer type 을 함수 모양으로 얻어내기
		Consumer<String> con2 = (t)->{
			System.out.println(t);
		};
		greets.forEach(con2);
		
		System.out.println("------------------------");
		
		greets.forEach((t)->{
			System.out.println(t);
		});
		
		System.out.println("------------------------");
		/*
		 *  매개변수의 갯수가 1개일때 매개변수 옆 ()는 생략 가능
		 *  매개변수 이름은 마음대로 정할 수 있다.
		 *  함수 안에서 실행할 code 가 1줄 이거나 리턴할 값만 명시할 땐
		 *  {}도 생략 가능
		 */
		greets.forEach(item->System.out.println(item));
		
		System.out.println("------------------------");
		
		
		greets.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
	}
}
