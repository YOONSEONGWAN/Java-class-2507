package test.main;

import test.mypac.MyUtil;
import test.mypac.WowException;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("main method start");
		try {
		MyUtil.generate();
		}catch(WowException we) {
			System.out.println("오잉 WowException이 발생했네?");
			System.out.println("예외 메세지:"+we.getMessage());
		}
		System.out.println("main method end");
	}
}
