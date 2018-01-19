package com.javaex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javaex.connection.DbConnect;

import EmaillistVo.EmaillistVo;

public class EmaillistDao {

	
	
	
	public void insert(EmaillistVo vo) {
		
		
		Connection conn = new DbConnect().getCon(); //드라이버로드, 디비연동
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {			
			// 3. SQL문 준비 / 바인딩 / 실행
			String query = "INSERT INTO emaillist VALUES (seq_emaillist_no.nextval, ? ,? , ?)";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, vo.getLastName());
			pstmt.setString(2, vo.getFirstname());
			pstmt.setString(3, vo.getEmail());

			int count = pstmt.executeUpdate();

			// 4.결과처리
			System.out.println(count + "건 저장완료");
		}  catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			// 5. 자원정리
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

		}
	}
	
	public List<EmaillistVo> getListAll() {
		Connection conn = new DbConnect().getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmaillistVo> volist = new ArrayList<EmaillistVo>();
		
		try {
			
			// 3. SQL문 준비 / 바인딩 / 실행
				String query = "select * from emaillist";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			// 4.결과처리
			while(rs.next()) {
				EmaillistVo vo = new EmaillistVo();
				
				vo.setNo(rs.getInt(1));
				vo.setLastName(rs.getString(2));
				vo.setFirstname(rs.getString(3));
				vo.setEmail(rs.getString(4));

				volist.add(vo);
				
				//authorList.toString();
				//System.out.println(authorId+" "+authorName+" "+authorDesc);
			}
			
		}  catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			
			// 5. 자원정리
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

		}
		
		return volist;
	}
	
	
}
