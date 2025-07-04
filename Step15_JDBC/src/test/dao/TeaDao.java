package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.TeaDto;
import test.util.DBConnector;

public class TeaDao {

    // 1. 차 정보 추가하기 (INSERT)
    public boolean insert(TeaDto dto) {
    	Connection conn=null;
    	PreparedStatement pstmt=null;
    	int rowCount = 0;
    	try {
    		conn=new DBConnector().getConn();
    		String sql="""
    			INSERT INTO TEA (
    			NUM, NAME, COLOR, SCENT, TASTE_SUMMARY, TASTE_RICHNESS, TASTE_WEIGHT, TASTE_DETAIL, EVALUATION)
    			VALUES(TEA_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)
    	""";
    		pstmt=conn.prepareStatement(sql);
    		pstmt.setString(1, dto.getName());
    		pstmt.setString(2,dto.getColor() );
    		pstmt.setString(3,dto.getScent() );
    		pstmt.setString(4, dto.getTasteSummary() );
    		pstmt.setInt(5, dto.getTasteRichness());
    		pstmt.setInt(6, dto.getTasteWeight());
    		pstmt.setString(7, dto.getTasteDetail());
    		pstmt.setString(8, dto.getEvaluation());
    		rowCount=pstmt.executeUpdate();
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally {
    		try {
    			if (pstmt !=null)
    				pstmt.close();
    			if(conn !=null)
    				conn.close();
    		}catch(Exception e){
        	}
    	}
    	if(rowCount>0) {
    		return true; // 작업 성공이라는 의미에서 true 값 리턴
		} else {
			return false; // 작업 실패라는 의미에서 false 값 리턴
    	}
    }
/*
 * ************************************
 */
    // 2. 전체 차 목록 불러오기 (SELECT)
    public List<TeaDto> selectAll() {
    	List<TeaDto> list=new ArrayList<TeaDto>();
    	Connection conn=null;
    	PreparedStatement pstmt=null;
    	ResultSet rs= null;
    	try {
    		conn = new DBConnector().getConn();
    		String sql="""
    				SELECT 
    				NUM, NAME, COLOR, SCENT, TASTE_SUMMARY, TASTE_RICHNESS, TASTE_WEIGHT, TASTE_DETAIL, EVALUATION
    				FROM TEA
    				ORDER BY NUM ASC
    			""";
    		pstmt=conn.prepareStatement(sql);
    		rs=pstmt.executeQuery();
    		while(rs.next()) {
    			TeaDto dto=new TeaDto();
    			dto.setNum(rs.getInt("num"));
    			dto.setName(rs.getString("name"));
    			dto.setColor(rs.getString("color"));
    			dto.setScent(rs.getString("scent"));
    			dto.setTasteSummary(rs.getString("taste_summary"));
    	        dto.setTasteRichness(rs.getInt("taste_richness"));
    	        dto.setTasteWeight(rs.getInt("taste_weight"));
    	        dto.setTasteDetail(rs.getString("taste_detail"));
    	        dto.setEvaluation(rs.getString("evaluation"));
    		list.add(dto);
    		} 
    	}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			}catch(Exception e) {e.printStackTrace();}
		}
    	
        return list;
    }

    // 3. 번호로 차 1명 정보 가져오기 (SELECT)
    public TeaDto getByNum(int num) {
        TeaDto dto=null;
        Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// DB 접속하는 트리거로 생각
			conn = new DBConnector().getConn();
			String sql="""
					SELECT NAME, COLOR, SCENT, TASTE_SUMMARY, TASTE_RICHNESS, TASTE_WEIGHT, TASTE_DETAIL, EVALUATION
					FROM TEA
					WHERE NUM =?
				""";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				dto= new TeaDto();
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setColor(rs.getString("color"));
				dto.setScent(rs.getString("scent"));
				dto.setTasteSummary(rs.getString("taste_summary"));
				dto.setTasteRichness(rs.getInt("taste_richness"));
				dto.setTasteWeight(rs.getInt("taste_weight"));
				dto.setTasteDetail(rs.getString("taste_detail"));
				dto.setEvaluation(rs.getString("evaluation"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
    	
    	return dto;
    }

    // 4. 수정하기 (UPDATE)
    public boolean update(TeaDto dto) {
    	Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
    	try {
    		conn=new DBConnector().getConn();
    		String sql="""
    			UPDATE TEA (
    			SET NAME=?, 
    			COLOR=?, 
    			SCENT=?, 
    			TASTE_SUMMARY=?, 
    			TASTE_RICHNESS=?, 
    			TASTE_WEIGHT=?, 
    			TASTE_DETAIL=?, 
    			EVALUATION=?)
    			WHERE NUM=?
    	""";
    		pstmt=conn.prepareStatement(sql);
    		
    		pstmt.setString(1, dto.getName());
    		pstmt.setString(2,dto.getColor() );
    		pstmt.setString(3,dto.getScent() );
    		pstmt.setString(4, dto.getTasteSummary() );
    		pstmt.setInt(5, dto.getTasteRichness());
    		pstmt.setInt(6, dto.getTasteWeight());
    		pstmt.setString(7, dto.getTasteDetail());
    		pstmt.setString(8, dto.getEvaluation());
    		pstmt.setInt(9, dto.getNum());
    		rowCount=pstmt.executeUpdate();
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally {
    		try {
    			if (pstmt !=null)
    				pstmt.close();
    			if(conn !=null)
    				conn.close();
    		}catch(Exception e){
        	}
    	}
    	if(rowCount>0) {
    		return true; // 작업 성공이라는 의미에서 true 값 리턴
		} else {
			return false; // 작업 실패라는 의미에서 false 값 리턴
    	}
    }

    // 5. 삭제하기 (DELETE)
    public boolean delete(int num) {
    	Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
    	try {
    		conn=new DBConnector().getConn();
    		String sql="""
    			DELETE FROM TEA
    			WHERE NUM = ? 
    	""";
    		pstmt=conn.prepareStatement(sql);
    		
    		pstmt.setInt(1, num);
    		rowCount=pstmt.executeUpdate();
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally {
    		try {
    			if (pstmt !=null)
    				pstmt.close();
    			if(conn !=null)
    				conn.close();
    		}catch(Exception e){
        	}
    	}
    	if(rowCount>0) {
    		return true; // 작업 성공이라는 의미에서 true 값 리턴
		} else {
			return false; // 작업 실패라는 의미에서 false 값 리턴
    	}
    }
}
