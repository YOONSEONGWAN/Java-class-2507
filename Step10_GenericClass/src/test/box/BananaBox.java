package test.box;

import test.fruit.Banana;

public class BananaBox {
	private Banana item;
	
	//Banana 를 포장하는 메소드
	public void pack(Banana item) {
		this.item = item;
	}
	
	//Banana 를 꺼내는 메소드
	public Banana unPack() {
		return item;
	}
}
