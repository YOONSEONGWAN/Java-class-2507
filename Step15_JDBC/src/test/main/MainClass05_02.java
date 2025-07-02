package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass05_02 {
	public static void main(String[] args) {
		// create table, insert, update, delete 문 작성법 공부하기
		Connection conn=null;
		
		try {
			//오라클 드라이버 로딩 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "TIGER");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e){
			e.printStackTrace();
		}
		PreparedStatement pstmt=null; 
		ResultSet rs=null;
		try {
			String sql="""
					INSERT INTO MEMBERJ (NUM, NAME, ADDR)
					VALUES(?, ?, ?) 
					""";// ???는 바인딩 파라미터, 인덱스로 관리함
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "김일번");
			pstmt.setString(3, "1동");
			pstmt.executeUpdate();
			pstmt.clearParameters(); // 💡 바인딩 초기화
			pstmt.setInt(1, 2);
			pstmt.setString(2, "김둘번");
			pstmt.setString(3, "2동");  
			pstmt.executeUpdate();
			pstmt.clearParameters(); // 💡 바인딩 초기화
			pstmt.setInt(1, 3);
			pstmt.setString(2, "김삼번");
			pstmt.setString(3, "3동");  
			pstmt.executeUpdate();
			pstmt.clearParameters(); // 💡 바인딩 초기화
			pstmt.setInt(1, 4);
			pstmt.setString(2, "김넷번");
			pstmt.setString(3, "4동");
			pstmt.executeUpdate();
			pstmt.clearParameters(); // 💡 바인딩 초기화
			pstmt.setInt(1, 5);
			pstmt.setString(2, "김오번");
			pstmt.setString(3, "5동");
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
