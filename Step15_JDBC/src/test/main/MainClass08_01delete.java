package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass08_01delete {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("삭제할 번호: ");
		int num=scan.nextInt();
		
		MemberDto dto=new MemberDto();
		dto.setNum(num);
		MemberDao dao=new MemberDao();
		//new MemberDao().insert(dto);
		// 메소드는 작업의 성공 여부를 리턴해준다.
		boolean isSuccess=dao.deleteByNum(num);
		if(isSuccess) {
			System.out.println(num+"번의 정보를 성공적으로 삭제했습니다.");
		}else {
			System.out.println("저장 실패");
		}
	}
}
