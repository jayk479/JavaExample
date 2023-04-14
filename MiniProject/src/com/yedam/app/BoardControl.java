package com.yedam.app;

import java.util.Scanner;

import com.yedam.board.BoardService;

public class BoardControl {
	BoardService bs = new BoardService();
	Scanner sc = new Scanner(System.in);
	String menu = "";
	
	public BoardControl() {
		job();
	}
	
	public BoardControl(String grade) {
		if(grade.equals("BS")) {
			job2();
		}
	}
	
	private void job() {
		while(true) {
		System.out.println("1. 공지사항조회 | 2. 공지사항수정 | 3. 공지사항작성 | 4. 공지사항삭제 | 5. 돌아가기");
		System.out.println("입력> ");
		menu = sc.nextLine();			
			if(menu.equals("1")) {
				bs.getBoardList();
			}else if(menu.equals("2")) {
				bs.updateBoard();
			}else if(menu.equals("3")) {
				bs.boardAdd();
			}else if(menu.equals("4")) {
				bs. boardDelete();
			}else if(menu.equals("5")) {
				// 돌아가기
				break;
			}else {
				System.out.println("오입력");
			}
		}
	}
	
	private void job2() {
		while(true) {
			System.out.println("1. 공지사항 | 2. 익명게시판 | 3. 돌아가기");
			System.out.println("입력> ");
			menu = sc.nextLine();
			if(menu.equals("1")) {
				bs.getBoardList();
			}else if(menu.equals("2")){
				job21();
			}else if(menu.equals("3")){
				break;
			}else {
				System.out.println("오입력");
			}
		}
	}
	
	private void job21() {
		while(true) {
			System.out.println("1. 게시글열람 | 2. 게시글작성 | 3. 게시글수정 | 4. 게시글삭제 | 5. 돌아가기");
			System.out.println("입력> ");
			
			menu = sc.nextLine();
			if(menu.equals("1")){
				bs.getBoard2List();
				bs.getContent();
				//여기서 댓글작성				
			}else if(menu.equals("2")) {
				bs.boardAdd2();
			}else if(menu.equals("3")) {
				bs.updateBoard2();
			}else if(menu.equals("4")) {
				bs. boardDelete2();
			}else if(menu.equals("5")) {
				break;
			}else {
				System.out.println("오입력");
			}
		}
	}
	
}
