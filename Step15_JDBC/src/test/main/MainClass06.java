package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {
		// DB 에 추가할 회원의 정보라고 가정( member table )
		String name="누구게";
		String addr="어디게";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		// ResultSet 은 SELECT 할 게 아니라 필요 없음
		try {
			conn = new DBConnector().getConn();
			String sql="""
				INSERT INTO MEMBER (NUM, NAME, ADDR)
				VALUES(MEMBER_SEQ.NEXTVAL, ?, ?)	
			""";
			pstmt=conn.prepareStatement(sql);
			//? 에 순서대로 필요한 값
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			// sql 문 실행하고 변화된(추가, 수정, 삭제) row 의 갯수 			리턴받기
			//만약 추가 되어서 1 row ~~ 라는 값을 리턴받으면 아래의 위치에 			1이 리턴되고 로우카운트를 알면 성공인지 실패인지 알 수 있다
			int rowCount=pstmt.executeUpdate();
			if(rowCount>0) {
				System.out.println("작업성공!");
			}else {
				System.out.println("작업실패!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
