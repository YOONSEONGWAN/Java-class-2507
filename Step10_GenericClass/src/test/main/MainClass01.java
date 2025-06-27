package test.main;

import test.box.AppleBox;
import test.box.BananaBox;
import test.fruit.Apple;
import test.fruit.Banana;

public class MainClass01 {
	public static void main(String[] args) {
		// Apple 객체를 생성해서 AppleBox 객체에 담아 보세요.
		
		Apple a1 = new Apple();
		AppleBox ab1 = new AppleBox();
		ab1.pack(a1);
		
		Banana b1 = new Banana();
		BananaBox bb1 = new BananaBox();
		bb1.pack(b1);
	}
}
