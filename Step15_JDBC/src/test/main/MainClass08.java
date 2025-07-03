package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		// Scanner 객체를 이용해서 회원의 이름과 주소를 입력 받은 다음,
		Scanner scan=new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name=scan.nextLine();
		
		System.out.print("주소 입력: ");
		String addr=scan.nextLine();
		
		// MemberDao 객체를 이용해서 DB 에 저장하려면?
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		MemberDao dao=new MemberDao();
		//new MemberDao().insert(dto);
		// 메소드는 작업의 성공 여부를 리턴해준다.
		boolean isSuccess=dao.insert(dto);
		if(isSuccess) {
			System.out.println(name+"님의 정보를 성공적으로 저장했습니다.");
		}else {
			System.out.println("저장 실패");
		}
	}
}
