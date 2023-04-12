package com.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardService {
	
	Scanner sc = new Scanner(System.in);
	
	// 공지사항목록
	public void getBoardList() {
		List<Board> list = BoardDAO.getInstance().getBoardList();
		System.out.println("글번호\t제목\t내용\t\t\t\t\t작성자\t작성날짜");
		System.out.println("=========================================================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getIndexNo()+"\t");
			System.out.print(list.get(i).getTitle()+"\t");
			System.out.print(list.get(i).getContent()+"\t");
			System.out.print(list.get(i).getMemberName()+"\t");
			System.out.print(list.get(i).getWriteDate()+"\n");
		}
	}
	
	// 공지수정 
	public void updateBoard() {
		Board board = new Board();
		
		System.out.println("수정할글번호> ");
		int indexNo = Integer.parseInt(sc.nextLine());
		System.out.println("수정할제목> ");
		String title = sc.nextLine();
		System.out.println("수정할내용> ");
		String content = sc.nextLine();
		
		board.setIndexNo(indexNo);
		board.setTitle(title);
		board.setContent(content);
		
		int result = BoardDAO.getInstance().updateBoard(board);
		
		if(result > 0) {
			System.out.println("수정성공");
		}else {
			System.out.println("수정실패");
		}
	}
	
	// 공지추가
	public void boardAdd() {
		Board board = new Board();
		
		System.out.println("제목> ");
		String title = sc.nextLine();
		System.out.println("내용> ");
		String content = sc.nextLine();
		
		board.setTitle(title);
		board.setContent(content);
		
		int result = BoardDAO.getInstance().boardAdd(board);
		
		if(result == 1) {
			System.out.println("작성완료");
			
		}else {
			System.out.println("작성실패");
		}
	}
	
	// 공지삭제
	public void boardDelete() {
		System.out.println("삭제게시글번호입력> ");
		int indexNo = Integer.parseInt(sc.nextLine());
		int result = BoardDAO.getInstance().boardDelete(indexNo);
		if(result > 0) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제실패");
		}
	}
	
	// 게시판목록
	public void getBoard2List() {
		List<Board> list = BoardDAO.getInstance().getBoard2List();
		System.out.println("글번호\t제목\t\t\t\t\t작성날짜");
		System.out.println("=========================================================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getIndexNo()+"\t");
			System.out.print(list.get(i).getTitle()+"\t");
			System.out.print(list.get(i).getWriteDate()+"\n");
		}
	}
	
	// 게시판글열람
	public void getContent() {
		System.out.println("글번호> ");
		int indexNo = Integer.parseInt(sc.nextLine());
		Board board = BoardDAO.getInstance().getContent(indexNo);
		if(board == null) {
			System.out.println("해당 인덱스넘버 없음");
		}else {
			System.out.println("글번호\t제목\t\t\t\t\t작성날짜");
			System.out.println("=========================================================================");
			System.out.print(board.getIndexNo()+"\t");
			System.out.print(board.getTitle()+"\t\t\t\t\t");
			System.out.print(board.getWriteDate() + "\n");
			System.out.println("=========================================================================");
			System.out.println(board.getContent());
		}
		
	}
	
	// 게시판글작성
	public void boardAdd2() {
		Board board = new Board();
		
		System.out.println("제목> ");
		String title = sc.nextLine();
		System.out.println("내용> ");
		String content = sc.nextLine();
		
		board.setTitle(title);
		board.setContent(content);
		
		int result = BoardDAO.getInstance().boardAdd2(board);
		
		if(result == 1) {
			System.out.println("작성완료");
			
		}else {
			System.out.println("작성실패");
		}
	}
	
	//게시글수정
	public void updateBoard2() {
		Board board = new Board();
		
		System.out.println("수정할글번호> ");
		int indexNo = Integer.parseInt(sc.nextLine());
		System.out.println("수정할제목> ");
		String title = sc.nextLine();
		System.out.println("수정할내용> ");
		String content = sc.nextLine();
		
		board.setIndexNo(indexNo);
		board.setTitle(title);
		board.setContent(content);
		
		int result = BoardDAO.getInstance().updateBoard2(board);
		
		if(result > 0) {
			System.out.println("수정성공");
		}else {
			System.out.println("수정실패");
		}
	}
	
	// 게시글삭제
	public void boardDelete2() {
		System.out.println("삭제게시글번호입력> ");
		int indexNo = Integer.parseInt(sc.nextLine());
		int result = BoardDAO.getInstance().boardDelete2(indexNo);
		if(result > 0) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제실패");
		}
	}

}
