package test.main;

import test.mypac.Messenger;
import test.mypac.Post;
import test.mypac.ZzangGu;

public class MainClass00_01 {
	public static void main(String[] args) {
		System.out.println("main method start");
		
		MainClass00_01.test();
		test();
		sendMsg("lets go lunch!");
		String str="pasta";
		sendMsg(str);
		
		printSum(1, 34.13412);
		
		Post po1=new Post();
		po1.setId(97);
		po1.setTitle("Ah,, I want eat lunch.");
		po1.setAuthor("mememe");
		sendPost(po1);
		sendPost(new Post(96, "loveyou", "keu"));
	
		Messenger m1=new Messenger();
		m1.sendPost(po1);
		
		ZzangGu z1=new ZzangGu();
		ZzangGu z2=new ZzangGu();
		ZzangGu z3=new ZzangGu();
		
		ZzangGu[] zn=new ZzangGu[3];
		zn[0]=z1;
		zn[1]=z2;
		zn[2]=z3;
		for(ZzangGu zi : zn) {
			zi.dance();
		}
		
	}
	public static void test() {
		System.out.println("called test method");
	}
	public static void sendMsg(String msg) {
		System.out.println(msg+" //send fin ^^");
	}
	public static void printSum(int num1, double num2) {
		double result = num1+num2;
		System.out.println(num1+" Plus "+num2+" is "+result);
	}
	public static void sendPost(Post post) {
		System.out.println("send post. thank you.");
	}
}
