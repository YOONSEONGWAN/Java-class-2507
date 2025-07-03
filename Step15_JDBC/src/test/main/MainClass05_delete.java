package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass05_delete {
	// 딜리트문 만들기
	public static boolean delete(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount=0;
		try {
			conn=new DBConnector().getConn();
			String sql="""
					DELETE MEMBER
					WHERE NUM = ?
			""";
			// conn 을 DB 랑 연결 했으면 거기에 뭐라도 담아야 한다.
			// sql 문을 받아 pstmt 에 담기
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(3, dto.getNum());
			rowCount=pstmt.executeUpdate();
			// 업데이트 실행 결과가 리턴된다. 갯수를 변수에 담기
		}catch(Exception e) {
			e.printStackTrace();
		}
		if (rowCount>0) {
			return true; // 작업 성공이라는 의미에서 true 값 리턴
		}else {
			return false; // 작업 실패라는 의미에서 false 값 리턴
		}
	}
	public static void main(String[] args) {
		String name="누구게4";
		String addr="어디게4";
		MemberDto dto=new MemberDto();
		dto.setNum(0);
		boolean isSuccess=delete(dto);
		if(isSuccess) {
			System.out.println("성공!");
		}else {
			System.out.println("실패니까 다른 동작을 다시 해 봐야지...");
		}
}
}
