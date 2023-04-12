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
			String sql = "SELECT * FROM BOARD1";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				board1 = new Board();
				board1.setIndexNo(rs.getInt("index_no"));
				board1.setTitle(rs.getString("title"));
				board1.setContent(rs.getString("content"));
				board1.setMemberName(rs.getString("writer"));
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
			String sql = "UPDATE BOARD1 SET TITLE = ?, CONTENT = ? WHERE INDEX_NO = ?";
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
			String sql = "INSERT INTO BOARD1 VALUES ((SELECT MAX(INDEX_NO)+1 FROM BOARD1), ?, ?, 'ADMIN', SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			
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
			String sql = "DELETE FROM BOARD1 WHERE INDEX_NO = ?";
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
			String sql = "SELECT INDEX_NO2, TITLE2, WRITE_DATE2 FROM BOARD2";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				board2 = new Board();
				board2.setIndexNo(rs.getInt("index_no2"));
				board2.setTitle(rs.getString("title2"));
				board2.setWriteDate(rs.getDate("write_date2"));
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
			String sql = "SELECT * FROM BOARD2 WHERE INDEX_NO2 = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, indexNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new Board();
				board.setIndexNo(rs.getInt("index_no2"));
				board.setTitle(rs.getString("title2"));
				board.setContent(rs.getString("content2"));
				board.setWriteDate(rs.getDate("write_date2"));
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
			String sql = "INSERT INTO BOARD2 VALUES ((SELECT MAX(INDEX_NO2)+1 FROM BOARD2), ?, ?, SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			
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
			String sql = "UPDATE BOARD2 SET TITLE2 = ?, CONTENT2 = ? WHERE INDEX_NO2 = ?";
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
	
	//게시글삭제
	public int boardDelete2(int indexNo) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM BOARD2 WHERE INDEX_NO2 = ?";
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
	
}
