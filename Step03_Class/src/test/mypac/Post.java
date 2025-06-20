package test.mypac;

public class Post {
	//글번호를 저장할 필드
	public int id;
	//글 내용을 저장할 필드
	public String content;
	//글 작성자를 저장할 필드
	public String author;
	//객체의 모습을 상상해보면 세 개의 필드가 있고 초기값은 0 널널일 것
	
	
	/*
	 * 숫자는 %d 
	 * 문자는 %s
	 * %%%의 순서대로 들어간다.
	 */
	public void printData() {
		System.out.println(String.format("번호:%d 내용:%s 작성자:%s", this.id, this.content, this.author)
		);
		// 순서대로 기호 위치에 
	}
}
