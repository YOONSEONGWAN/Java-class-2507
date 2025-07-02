package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass04 {
	public static void main(String[] args) {
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
			String sql= """
					SELECT EMPNO, ENAME, DEPTNO, DNAME
					FROM EMP
					INNER JOIN DEPT USING(DEPTNO)
					ORDER BY EMPNO ASC
				""";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				var empno=rs.getInt("empno");
				var ename=rs.getString("ename");
				var deptno=rs.getInt("deptno");
				var dname=rs.getString("dname");
				String info = String.format("사원번호:%d 사원이름:%s 부서번호:%d 부서명:%s", empno, ename, deptno, dname);
				System.out.println(info);
				//System.out.println(empno+"|"+ename+"|"+deptno+"|"+dname+"|");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
