package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		// MemberDto 객체를 저장할 수 있는 ArrayList 객체 생성
		// MemberDto 타입의 참조값을 저장할 수 있음 
		// Dto 의 생성자는 num name addr 이니까 리스트 하나당 한 명의 
		// 정보를 담는 거임
		List<MemberDto> list=new ArrayList<>();
		
		// 1번 회원의 정보
		MemberDto /*객체타입*/ dto = new MemberDto();
		dto.setNum(1);
		dto.setName("김구라");
		dto.setAddr("노량진");
		
		// 2번 회원의 정보
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		// 3번 회원의 정보
		MemberDto dto3 = new MemberDto(3, "원숭이", "동물원");
		
		// 생성한 회원의 정보를 ArrayList 객체에 누적시키기
		// 객체 생성한 걸 만들어놓은 list 배열에 담는 것
		list.add(dto);
		list.add(dto2);
		list.add(dto3);
		
		// 확장 for 문 list 의 제너릭이 MemberDto type 이니까 선언
		for(MemberDto tmp:list) { //d정수, s문자열. f실수, n줄바꿈
			String info = String.format("번호:%d, 이름:%s, 주소:%s", tmp.getNum(), tmp.getName(), tmp.getAddr());
			//출력하기
			System.out.println(info);
		}
		
		System.out.println("forEach()를 이용하면 --------->");
		
		list.forEach(new Consumer<MemberDto>() {
			@Override
			public void accept(MemberDto t) {
				String a = String.format("번호:%d, 이름:%s, 주소:%s", t.getNum(), t.getName(), t.getAddr());
				System.out.println(a);
			}
		});
		
		System.out.println("forEach()를 줄여서2 --------->");
		
		list.forEach(item -> {//함수에 전달되는 item 은 MemberDto type
			String info = String.format("번호:%d, 이름:%s, 주소:%s", item.getNum(), item.getName(), item.getAddr());
			System.out.println(info);
		});
		
	}
}
