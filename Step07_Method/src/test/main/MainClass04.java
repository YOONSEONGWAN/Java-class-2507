package test.main;

import test.mypac.Post;

public class MainClass04 {
	public static void main(String[] args) {
		// sendPost() 메소드를 호출해보세요.
		MainClass04.sendPost(new Post(1, "hello", "김구라"));
		
		Post p1=new Post(2, "해골입니다", "해골");
		sendPost(p1);
		
		sendPost(null);
		
		sendPost(new Post());
		
		Post p2 = new Post();
		p2.setId(3);
		p2.setTitle("제목3");
		p2.setAuthor("작성자3");
		
		sendPost(p2);
	}
	
	public static void sendPost(Post post) {
		System.out.println("글을 전송했습니다.");
	}
}
