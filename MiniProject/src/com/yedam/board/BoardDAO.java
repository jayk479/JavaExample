package com.yedam.board;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BoardDAO extends DAO{
	
	private static BoardDAO boardDao = new BoardDAO();
	
	private BoardDAO() {
		
	}
	public static BoardDAO getInstance() {
		return boardDao;
	}
	
	// 공지사항목록
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<>();
		Board board1 = null;
		
		try {
			conn();
			String sql = "SELECT * FROM BOARD ORDER BY INDEX_NO";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				board1 = new Board();
				board1.setIndexNo(rs.getInt("index_no"));
				board1.setTitle(rs.getString("title"));
				board1.setContent(rs.getString("content"));
				board1.setMemberId(rs.getInt("member_id"));
				board1.setMemberName(rs.getString("MEMBER_NAME"));
				board1.setWriteDate(rs.getDate("write_date"));
				list.add(board1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	// 공지수정
	public int updateBoard(Board board) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE BOARD SET TITLE = ?, CONTENT = ? WHERE INDEX_NO = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getIndexNo());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	// 공지추가
	public int boardAdd(Board board) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO BOARD VALUES ((SELECT MAX(INDEX_NO)+1 FROM BOARD), ?, ?, ?,'ADMIN', SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getMemberId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	// 공지삭제
	public int boardDelete(int indexNo) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM BOARD WHERE INDEX_NO = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, indexNo);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
	
	// 게시판목록
	public List<Board> getBoard2List(){
		List<Board> list = new ArrayList<>();
		Board board2 = null;
		
		try {
			conn();
			String sql = "SELECT INDEX_NO, TITLE, WRITE_DATE, MEMBER_ID FROM BOARD2 ORDER BY INDEX_NO";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				board2 = new Board();
				board2.setIndexNo(rs.getInt("index_no"));
				board2.setTitle(rs.getString("title"));
				board2.setWriteDate(rs.getDate("write_date"));
				board2.setMemberId(rs.getInt("member_id"));
				list.add(board2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	// 게시판글열람
	public Board getContent(int indexNo) {
		Board board = null;
		try {
			conn();
			String sql = "SELECT * FROM BOARD2 WHERE INDEX_NO = ? ORDER BY INDEX_NO";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, indexNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new Board();
				board.setIndexNo(rs.getInt("index_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriteDate(rs.getDate("write_date"));
				board.setMemberId(rs.getInt("member_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			disconn();
		}
		return board;
	}
	
	
	// 게시판글작성
	public int boardAdd2(Board board) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO BOARD2 VALUES ((SELECT MAX(INDEX_NO)+1 FROM BOARD2), ?, ?, ?, ?, SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getMemberId());
			pstmt.setString(4, board.getMemberName());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	// 게시글수정
	public int updateBoard2(Board board) {
		int result = 0;
		try {
			conn();
			
			String sql = "UPDATE BOARD2 SET TITLE = ?, CONTENT = ? WHERE INDEX_NO = ? AND MEMBER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getIndexNo());
			pstmt.setInt(4, board.getMemberId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//게시글삭제
	public int boardDelete2(Board board) {
		int result = 0;
		try {
			conn();
		
			String sql = "DELETE FROM BOARD2 WHERE INDEX_NO = ? and MEMBER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getIndexNo());
			pstmt.setInt(2, board.getMemberId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	
	}
	
}
