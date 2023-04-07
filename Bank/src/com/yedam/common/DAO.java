package com.yedam.common;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DAO {
	// DAO - DATA ACCESS OBJECT
	// JDBC연결
	// 1) ojdbc를 추가
	// 2) DAO
	
	// java -> DB 연결 할 때 쓰는 객체
	protected Connection conn = null;
	
	// Select(조회) 결과값을 반환 받는 객체 
	// select한 결과를 java로 전달
	protected ResultSet rs = null;
	
	// query문을(sql)을 가지고 실행하는 객체
	// 1) sql문 실행해주는 객체
	protected PreparedStatement pstmt = null;
	
	// 2) sql문 실행해주는 객체
	protected Statement stmt = null;
	
	// DB접속정보
	Properties pro = new Properties();
	
	
	String driver = "";
	String url = "";
								// 접속할 ip    PORT DB이름 == SID 
	String id = "";
	String pw = "";
	
	
	
	//DB 연결
	public void conn() {
		try {
			getProperties();
			//1. 드라이버 로딩
			//Class.forName(driver);
			//2.DB 연결
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//DB연결해제
	public void disconn() {
		try {
			// 연결 -> select -> 결과 == 실행
			// 결과확인끝 -> select닫기 -> 연결해제 
			if(rs != null) { // null이 아님 == 한 번은 사용했음
				// 결과 조회하는 객체
				rs.close();
			}
			if(stmt != null) {
				//sql실행하는객체
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				// db연결객체
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//DB접속정보호출메소드
	
	private void getProperties() {
		try {
			FileReader resource = new FileReader("src/config/db.properties");
			pro.load(resource);
			
			driver = pro.getProperty("Driver");
			url = pro.getProperty("url");
			id = pro.getProperty("id");
			pw = pro.getProperty("pw");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
