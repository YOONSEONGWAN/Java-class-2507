package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		//String type의 기능(메소드) 사용해보기
		
		String str="abcd1234";
		
		//메소드를 사용한 위치는 다른 값으로 바뀔 수도, 안바뀔 수도 있다.
		//문자열의 길이를 리턴하는 length() 사용해보기
		int length=str.length();
		//문자열을 대문자로 만들어주는 메소드
		String upper=str.toUpperCase();
		//특정문자열 포함 여부 리턴
		boolean contains=str.contains("cd");
		
	}
}
