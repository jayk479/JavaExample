package com.yedam.app;

import java.util.Scanner;
//import com.yedam.board.*;

import com.yedam.board.BoardService;
import com.yedam.member.MemberService;

public class MemberControl {
	
	String menu = "";
	MemberService ms = new MemberService();
	BoardService bs = new BoardService();
	Scanner sc = new Scanner(System.in);
	
	public MemberControl() {
		job();
	}
	
	public void job() {
		
		while(true) {
			menu();
			if(MemberService.memberInfo.getGrade().equals("A")){
				if(menu.equals("1")) {
					ms.getMemberList();
					memberMenu();
				}else if(menu.equals("2")) {
					new BoardControl();
				}else if(menu.equals("99")) {
					ms.logout();
					break;
				}else {
					System.out.println("오입력");
				}
			}else if(MemberService.memberInfo.getGrade().equals("BS")) {
			
				if(menu.equals("1")) {
					new ReservationControl();
				}else if(menu.equals("2")) {
					new BoardControl("BS");
				}else if(menu.equals("3")) {
					//개인정보수정
					ms.updateMemberInfo();
				}else if(menu.equals("4")) {
					ms.memberDelete();
					break;
				}else if(menu.equals("99")) {
					ms.logout();
					break;
				}else {
					System.out.println("오입력");
				}
			}else if(MemberService.memberInfo.getGrade().equals("NS")) {
				
				if(menu.equals("1")) {
					bs.getBoardList();
				}else if(menu.equals("99")) {
					ms.logout();
					break;
				}else {
					System.out.println("오입력");
				}
			}
		}	
	}
	
	private void menu() {
		
		if(MemberService.memberInfo.getGrade().equals("A")) {
			System.out.println("1. 회원관리 | 2. 공지사항 | 99. 로그아웃");
		}else if(MemberService.memberInfo.getGrade().equals("BS")) {
			System.out.println("1. 예약 | 2. 게시판 | 3. 개인정보수정 | 4. 탈퇴 | 99. 로그아웃");
		}else if(MemberService.memberInfo.getGrade().equals("NS")) {
			System.out.println("1. 공지사항 | 99. 로그아웃");
		}
		System.out.println("입력> ");
		menu = sc.nextLine();
	}
	
	private void memberMenu() {
		while(true) {
			System.out.println("1. 회원권한수정 | 2. 회원강제탈퇴 | 3. 돌아가기");
			System.out.println("입력> ");
			menu = sc.nextLine();
			if(menu.equals("1")) {
				ms.updateMemberGrade();
			}else if(menu.equals("2")) {
				ms.memberDelete2();
			}else if(menu.equals("3")) {
				break;
			}
		}
	}
}
