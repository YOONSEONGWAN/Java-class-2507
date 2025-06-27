package test.main;

import test.fruit.Apple;
import test.mypac.Pair;

public class MainClass03 {
	public static void main(String[] args) {
		// Generic type 을 결정해야함
		Pair<String, Object>  p1=null;
		Pair<Integer, String>  p2=null;
		// 기본 data type 은 Generic Class 로 사용할 수 없다.
		// Wrapper Class type 으로 바꾸어 주어야 함 !
		//Pair<int, String> p3=null; // int 는 클래스가 아님
		
		// 객체 생성시 Generic 은 생략 가능 하다. 타입만 잘 받으면 됨
		Pair<String, Apple> p3 = new Pair<>("my", new Apple());
		
		String a=p3.getKey();
		Apple b=p3.getVlaue();
	}
}
