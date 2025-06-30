package test.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		// Set 클래스의 of() static 메소드 이용해서 read only set 객체
		//	생성 가능.
		Set<String> set1= Set.of("A","B","C","D");
		Set<String> set2= Set.of("C","D","E","F");
		
		// 중복 데이터가 들어있는 List
		List<String> names=List.of("kim","lee","lee","park");
		
		// List(자식) 는 Collection(부모) type 이기도 하다. 
		
		// HashSet 객체의 생성자에 List 를 전달해서 HashSet 객체 생성하면
		// 중복이 제.거.된.다.
		Set<String> nameSet = new HashSet<String>(names);
		// Set 가 중복을 제거할 때도 사용한다.
		
		// ArrayList 객체의 생성자에 Set 를 전달해 ArrayList 객체 생성
		// 인덱스로 관리할 수 있다.
		List<String> names2=new ArrayList<>(nameSet);
	}
}
