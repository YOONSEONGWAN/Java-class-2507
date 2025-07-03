package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;

public class MainClass04 {
	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement pstmt=null; 
		ResultSet rs=null;
		try {
			// 우리가 설계한 DBConnector 클래스를 이용해서 Connection 객체 얻어내기
			conn=new DBConnector().getConn();
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
