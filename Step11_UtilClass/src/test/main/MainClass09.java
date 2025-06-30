package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/*
 * 	HashSet 은 Set 인터페이스를 구현한 클래스다.
 * 
 * 	- 순서가 없다
 * 	- key 값도 없다
 * 	- 중복은 허용 X
 * 	- 어떤 data 를 묶음(집합)으로 관리하고자 할 때 사용한다.
 */

public class MainClass09 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 HashSet 객체를 생성해서 참조값을 Set 		인터페이스 type 지역변수에 담기
		Set<Integer> set1=new HashSet<>();
		set1.add(11);
		set1.add(11);
		set1.add(22);
		set1.add(22);
		set1.add(33);
		set1.add(33);
		set1.add(44);
		set1.add(44);
		
		// 문자열을 저장할 수 있는 HashSet 객체
		Set<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("lee");
		set2.add("park");
		
		//Set 객체에 저장된 모든 아이템은 순서를 보장하지 않는다.
		//컨슈머 타입 전달. 세트에 저장된 값이 	item 에 전달이 된다.
		set1.forEach((item)->{
			// set1은 Set<Integer> 이기 때문에 item 에는 Integer 			type 이 전달된다.
			Integer tmp = item;
			System.out.println(tmp);
		}); 
		System.out.println("---------------------");
		
		set2.forEach((item)->{
			// set2 는 set<String> 이기 때문에 item 은 String type
			String tmp2=item;
			System.out.println(tmp2);
		});
		// 메소드 1개짜리 객체를 전달. 결국 포이치 내부에서 컨슈머 타입의
		// 객체의 메소드가 호출되는데
		// 그 메소드는 accept() 메소드가 확실한 상황 
		set2.forEach(new Consumer<String>() {
			@Override // accept 의 타입은 제너릭이 결정
			public void accept(String t) {
				
			}
		});
		
		System.out.println("---------------------");
		
		// Iterator 를 사용하는 구조도 연습해보자
		Iterator<String> it=set2.iterator();
		/*
		 * 	무한 루프를 구정하거나 정확한 반복 횟수를 알 수 없을 때 while 문
		 */
		while(it.hasNext()) {
			// Iterator 의 it 는 String 타입의 set2의 메소드니까 스트링 
			String item=it.next(); 
			System.out.println(item);
		}
	}
}
