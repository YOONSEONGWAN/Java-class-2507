package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass05_01 {
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
					CREATE TABLE MEMBERJ (
					NUM NUMBER PRIMARY KEY,
					NAME VARCHAR2(50),
					ADDR VARCHAR2(50) )
					""";
			pstmt=conn.prepareStatement(sql);
			pstmt.executeQuery();
			System.out.println("테이블이 생성되었어요! 🏗️");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
