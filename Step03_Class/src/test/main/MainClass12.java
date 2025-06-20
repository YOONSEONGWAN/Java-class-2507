package test.main;

import test.mypac.Post;

public class MainClass12 {
	public static void main(String[] args) {
	Post p1=new Post();
	p1.id=1;
	p1.content="hello";
	p1.author="kim";
			//객체의 메소드를 호출하면 해당 객체가 갖고있는 정보가 콘솔에 이쁘게 출력된다.
	p1.printData();
	
	Post p2= new Post();
	p2.id=2;
	p2.content="bye!";
	p2.author="Lee";
	
	p2.printData();
	
}
}
