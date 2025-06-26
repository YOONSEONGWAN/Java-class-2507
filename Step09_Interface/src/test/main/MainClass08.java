package test.main;

import test.mypac.Person;
import test.mypac.Programer;
import test.mypac.Singer;

public class MainClass08 {
	public static void main(String[] args) {
		//Person 객체를 생성해서 Person type 으로 받으면 모든 메소드 可 
		Person p1=new Person();
		p1.work();
		p1.sing();
		p1.develop();
		
		System.out.println("------------------------");
		// Person 객체를 Singer type 으로 받으면 sing()메소드만 사용可
		// 캐스팅하기 전엔 노래만 가능
		Singer p2=new Person();
		p2.sing();
		
		System.out.println("------------------------");
		
		// Person 객체를 생성해서 Programmer type 으로 받으면 develop()만 可
		Programer p3=new Person();
		p3.develop();
	}
}
