package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		// java 에서 배열은 용도가 한정되어 있다. 
		// item 을 담을 수 있는 공간을 늘이거나 줄일 수 없다.
		
		// 문자열(String) type 을 담을 수 있는 방 5개 배열 객체 생성
		String[] names = new String[5];
		names[0]="김구라";
		names[1]="해골";
		names[2]="원숭이";
		
		// 아이템을 갯수 상관 없이 필요에 따라 마음대로 추가하거나 제거할 수 		있는 배열목록(ArrayList) 객체 생성하기
		ArrayList<String> friends=new ArrayList<>();
		// 객체 생성시에 제네릭 생략 가능
		// 타입 받을 때 타입을 적으면 됨
		
		// 1. 김구라 해골 원숭이를 순서대로 담아보기
		friends.add("김구라");
		friends.add("해골");
		friends.add("원숭이");
		// 1-1. 2번방의 item 을 신현호로 수정
		friends.set(2, "신현호");
		// 2. 0번방의 아이템을 불러와서 item 변수에 담기
		String item=friends.get(0);
		// 3. 1번방의 아이템을 삭제
		friends.remove(1);
		// 4. 저장된 아이템의 갯수(size)를 size 라는 지역변수에 담기
		int size=friends.size();
		// 5. 0번방에 "에이콘" 끼워넣기
		friends.add(0, "에이콘");
		// 6. 저장된 모든 아이템 전삭
		friends.clear();
		
		
	}
}
