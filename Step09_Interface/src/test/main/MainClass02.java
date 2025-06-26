package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		// 다형성 확인
		Object r1=new MyRemocon();
		Remocon r2=new MyRemocon();
		MyRemocon r3=new MyRemocon();
		
		useRemocon((Remocon)r1); //Object 타입이지만 캐스팅할 수 있다.
		useRemocon(r2);
		useRemocon(r3);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
