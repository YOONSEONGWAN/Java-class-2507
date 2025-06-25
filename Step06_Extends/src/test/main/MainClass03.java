package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		//아래의 3줄을 실행하면 참조값이 몇 개가 나올까.
		HandPhone p1=new HandPhone();
		Phone p2= p1;
		Object p3=p1;
		//casting으로 p3를 핸드폰 타입이라 하면 담을 수 		있다.
		HandPhone p4=(HandPhone)p3;
	}
}
