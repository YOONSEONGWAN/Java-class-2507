package test.main;

import test.mypac.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		MemberDto dto=new MemberDto();
		dto.setNum(23);
		dto.setName("김구라");
		dto.setAddr("노량진");
		
		//dto 객체에 보관된 num, name, addr을 참조하고 싶다면?
		//회원의 번호를 콘솔창에 출력하고 싶다면 -> 접근메소드도 만들어 주어야 한다.
		System.out.println(dto.getNum());
		//회원의 이름을 콘솔창에 출력하고 싶다면
		System.out.println(dto.getName());
		System.out.println(dto.getAddr());
		
		//dto의 getter 메소드를 호출해서 리턴되는 값을 변수에 연습삼아 담아보세요.
		int num=dto.getNum();
		String name=dto.getName();
		String addr=dto.getAddr();
	}
}
