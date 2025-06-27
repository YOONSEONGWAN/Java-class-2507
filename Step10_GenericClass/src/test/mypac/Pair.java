package test.mypac;

// Generic Class 는 2개 이상일 수도 있다.
public class Pair<K, V> {
	//field
	private K key;
	private V value;
	
	// 생성자
	public Pair(K key, V value) {
		this.key=key;
		this.value=value;
	}
	
	// method
	public K getKey() {
		return key;
	}
	public V getVlaue() {
		return value;
	}
}
