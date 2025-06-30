package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * 	HashMap<key type, value type>
		 * 
		 * 	key type 은 일반적으로 String type 을 가장 많이 사용한다.
		 * 	value type 은 담고 싶은 데이터의 type 을 고려해서 지정하면 됨.
		 * 	value type 을 Object 로 지정하면 모든 data type 담을 수 있다.
		 * 	순서가 없는 데이터를 다룰 때 사용
		 * 	dto Class 대신 사용
		 */
		
		// 특정 키값으로 특정 밸류를 담는 것. 키의 제너릭은 보통 스트링
		// 밸류의 제너릭은 Object 로 하면 모든 걸 다 담을 수 있음
		// HashMap 클래스는 Map 인터페이스를 구현했다.
		Map<String, Object> map = new HashMap<>();
		// put 으로 담고 get 으로 꺼내 참조한다.
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("isMan", true);
		
		// 제네릭이 Object 이기 때문에 아무 데이터나 담을 수 있지만 
		// 캐스팅을 해야하는 번거로움이 있다 
		int num =(int)map.get("num");
		String name = (String)map.get("name");
		boolean isMan = (boolean)map.get("isMan");
		
		// 동일한 key 값으로 다시 담으면 수정 (덮어쓰기)
		map.put("name", "이정호");
		// 특정 key 내용 삭제
		map.remove("isMan");
		// 모두 삭제
		map.clear();
		
		// Map 인터페이스의 of() 라는 static method 로 읽기전용 객체도 만들 수 있다.
		Map<String, Object> map2 = Map.of(
				"num", 2, 
				"name", "해골",
				"isMan", false
			);
	}
}
