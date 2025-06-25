package test.main;

import test.mypac.Messenger;
import test.mypac.Post;

public class MainClass05 {
	public static void main(String[] args) {
		// Messenger type 객체의 sendPost() 메소드를 호출해보세요.
		// 실행했을 때 Exception 발생 안 해야 함.
		
		Post p1=new Post(1, "안녕하세요", "김구라");
		Messenger m1=new Messenger();
		m1.sendPost(p1);
		
		Messenger m2=new Messenger();
		m2.sendPost(new Post(1, "안녕하세요", "해골"));
	}
}
