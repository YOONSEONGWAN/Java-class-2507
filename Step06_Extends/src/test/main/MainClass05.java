package test.main;

import java.awt.Shape;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		SmartPhone p1=new SmartPhone();
		p1.call();
		p1.mobileCall();
		p1.takePicture();
		p1.doInternet();
		
		System.out.println("-----------------");
		// SmartPhone 객체를 생성해서 HandPhone type으로 담음
		HandPhone p2=new SmartPhone();
		// 사진을 찍으면 이건 몇 화소일까?-> 객체를 봐야함
		// 이미 1억화소 찍는 객체기 때문에 변경된 1억화소로 나옴
		p2.takePicture();
		
		System.out.println("-----------------");
		HandPhone p3=new HandPhone();
		p3.takePicture(); //Overide된 스마트폰과 관계 없는 객체에서 		찍었기 때문에 30만 화소로 나옴
		
	}
}
