package test.main;

import test.mypac.Post;

public class MainClass11 {
	public static void main(String[] args) {
		Post p1 = null;
		Post p2 = new Post();
		Post p3 = p2;
		
		//위의 3줄을 실행하면 Post 객체는 총 몇 개가 실행될까?
		// 변수는 3개 생성되었지만 객체는 new할 때만 실행이 된다. 
		
		p2.id=1;
		p2.content="hello";
		p2.author="kim";
		
		System.out.println(p3.content);
		//System.out.println(p1.content);
		//널포인트 익셉션이 나온다. 찾아갈 곳이 없기 때문에.
	}
}
