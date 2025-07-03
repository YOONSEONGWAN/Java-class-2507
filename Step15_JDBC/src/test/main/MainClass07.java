package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass07 {
	
	// member table 에 회원 한 명의 정보를 추가하는 메소드를 만든다고 가정
	public static boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화된 row 의 갯수를 담을 변수 선언하고 0으로 초기화
		int rowCount=0;
		try {
			conn = new DBConnector().getConn();
			String sql="""
				INSERT INTO MEMBER (NUM, NAME, ADDR)
				VALUES(MEMBER_SEQ.NEXTVAL, ?, ?)	
			""";
			pstmt=conn.prepareStatement(sql);
			//? 에 순서대로 필요한 값
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// sql 문 실행하고 변화된(추가, 수정, 삭제) row 의 갯수 			리턴받기
			//만약 추가 되어서 1 row ~~ 라는 값을 리턴받으면 아래의 위치에 			1이 리턴되고 로우카운트를 알면 성공인지 실패인지 알 수 있다
			rowCount=pstmt.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 널이 아닌 경우에만 메소드가 호출되어 종료하도록
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(rowCount>0) {
			return true; // 작업 성공이라는 의미에서 true 값 리턴
		}else {
			return false; // 작업 실패라는 의미에서 false 값 리턴
		}
	}
	
	public static void main(String[] args) {
		// DB 에 추가할 회원의 정보라고 가정( member table )
		String name="누구게4";
		String addr="어디게4";
		// 회원의 이름과 주소를 MemberDto 객체에 담는다
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		// 메소드 호출하면서 전달 
		boolean isSuccess=insert(dto); //반환 값에 따라 성공여부 확인
		if(isSuccess) {
			System.out.println("성공!");
		}else {
			System.out.println("실패니까 다른 동작을 다시 해 봐야지...");
		}
	}	
}
