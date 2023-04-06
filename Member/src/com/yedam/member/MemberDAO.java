package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MemberDAO extends DAO{
	// 230406 KJY MemberDAO 아래 기능 구현
	// 로그인 - login()
	// 로그아웃 - logout()
	
	private static MemberDAO memberDao = null;
	
	private MemberDAO() {
		
	}
	public static MemberDAO getInstance() {
		if(memberDao == null) {
			memberDao = new MemberDAO();
		}
		return memberDao;
	}
	// 1. 로그인
	public Member login(String id) {
		// 1. id가 틀렸다, pw가 틀렸다. 채택
		// 2. 존재하지 않거나 id & pw가 틀렸습니다.

		// 기능
		// 1. 로그인
		// 2. 회원가입할 때 id 중복 체크
		Member member = null;
		try {
			conn();
			String sql = "SELECT * FROM MEMBER WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			
			rs = pstmt.executeQuery();
			
			//정상적으로 id가 조회되었을 때
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));	
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return member;
	}
	
	// 1. 회원 조회 
	public List<Member> getMemberList(){
		List<Member>list = new ArrayList<>();
		Member member = null;
		try {
			conn();
			String sql = "SELECT * FROM MEMBER";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}
	
	// 2. 회원 등록 
	public int memberAdd(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO MEMBER VALUES(?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3,member.getName());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	// 3. 회원 수정
	public int memberUpdate(Member member) {
		int result = 0;
		try {
			conn();
			
			String sql = "UPDATE MEMBER SET PW = ? WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2,member.getId());
		
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	// 4. 회원 탈퇴 
	public int memberDelete(String id) {
		int result = 0;
		try {
			conn();
			
			String sql = "DELETE FROM MEMBER WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	
	
	
	
}
