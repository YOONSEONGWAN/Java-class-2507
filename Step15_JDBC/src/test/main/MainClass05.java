package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;

public class MainClass05 {
	public static void main(String[] args) {
		int minSal=2000;
		int maxSal=3000;
		// 위의 범위의 sal 을 받는 사원들의 empno, ename, sal 을 		SELECT해서
		// sal 에 대해서 오름차순 정렬해서 콘솔창에 출력하기 
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=new DBConnector().getConn();
			// 실행 할 sql 문의 뼈대 구성
			String sql = """
				SELECT EMPNO, ENAME, SAL
				FROM EMP
				WHERE SAL BETWEEN ? AND ?	
				ORDER BY SAL ASC
			""";
			pstmt=conn.prepareStatement(sql); 
			// conn 의 prepareStatement 메소드를 실행하며 
			// 미완성의 sql 문을 전달
			// ? 에 필요한 값 binding 하기 
			pstmt.setInt(1, minSal);
			pstmt.setInt(2, maxSal);
			// SELECT 문 실행하고 결과를 ResultSet 객체로 받아오기
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				int sal=rs.getInt("sal");
				System.out.println(empno+"|"+ename+"|"+sal);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
