package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass03 {
	public static void main(String[] args) {
		Connection conn=null;// 알아볼 인터페이스1
		
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
		PreparedStatement pstmt=null; // 알아볼 인터페이스2
		ResultSet rs=null;// 알아볼 인터페이스3
		try {
			String sql= """
					SELECT DEPTNO, DNAME, LOC
					FROM DEPT
					ORDER BY DEPTNO ASC
					""";
			pstmt=conn.prepareStatement(sql);// 객체를 미리 준비하는 코드
			rs=pstmt.executeQuery(); // 실행하면 리턴값을 rs 에 받아옴
			while(rs.next()) {
				int deptno=rs.getInt("deptno");
				String dname=rs.getString("dname");
				String loc=rs.getString("loc");
				System.out.println(deptno+"|"+dname+"|"+loc);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
