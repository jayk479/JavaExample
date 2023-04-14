package com.yedam.member;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.Application;

public class MemberService {
	
	public static Member memberInfo = null;
	
	Scanner sc = new Scanner(System.in);
	
	// 로그인
	public void login() {
		Member member = new Member();
		System.out.println("ID> ");
		String id = sc.nextLine();
		System.out.println("PW> ");
		String pw = sc.nextLine();
		
		member = MemberDAO.getInstance().login(id);
		
		if(member != null) {
			if(pw.equals(member.getPw())) {
				System.out.println("로그인성공");
				memberInfo = member;
				//System.out.println(MemberService.memberInfo.getMemberId());
			}else {
				System.out.println("패스워드오류");
			}
		}else {
			System.out.println("아이디오류");
		}	
	}
	
	// 로그아웃
	public void logout() {
		if(memberInfo != null){
			memberInfo = null;
			System.out.println("로그아웃되었습니다.");
		}else {
			login();
		}
	}
	
	// 회원가입
	public void memberAdd() {
		Member member = new Member();
		System.out.println("ID> ");
		String id = sc.nextLine();
		System.out.println("PW> ");
		String pw = sc.nextLine();
		System.out.println("이름> ");
		String name = sc.nextLine();
		System.out.println("생년월일(YY/MM/DD)> ");
		String birth = sc.nextLine();
		
		member.setId(id);
		member.setPw(pw);
		member.setMemberName(name);
		member.setBirth(birth);
				
		int result = MemberDAO.getInstance().memberAdd(member);
		if(result == 1) {
			System.out.println("회원가입완료");	
			new Application();
		}else {
			System.out.println("회원가입실패");
		}
	}
	
	// 회원전체조회
	public void getMemberList(){
		List<Member> list = MemberDAO.getInstance().getMemberList();
		for(int i = 0; i < list.size(); i++) {
			System.out.print("번호 : " + list.get(i).getMemberId()+"\t");
			System.out.print("\t이름 : " + list.get(i).getMemberName()+"\t");
			System.out.print("\t권한 : " + list.get(i).getGrade()+"\t");	
			System.out.print("\tID : " + list.get(i).getId());
			System.out.println();
		}
	}
	
	// 회원권한수정
	public void updateMemberGrade() {
		Member member = new Member();
		int result = 0;
		System.out.println("번호> ");
		int memberId = Integer.parseInt(sc.nextLine());
		System.out.println("등급> ");
		String grade = sc.nextLine();
		List<Member> list = MemberDAO.getInstance().getMemberList();
		for (int i = 0; i <list.size(); i++) {
			if(list.get(i).getMemberId() == memberId) {
				if(grade.equals("BS")) {
					member.setMemberId(memberId);
					member.setGrade(grade);						
					result = MemberDAO.getInstance().updateMemberGrade(member);
				}else {
					System.out.println("적용되는권한아님");											
				}
			}
		}
		if(result > 0) {
			System.out.println("수정성공");
		}else {
			System.out.println("수정실패");
		}
	}	
	
	// 회원개인정보수정
	public void updateMemberInfo() {

		Member member = new Member();
		System.out.println("ID재입력> ");
		String id = sc.nextLine();
		System.out.println("수정할메일> ");
		String mail = sc.nextLine();
		System.out.println("수정할주소> ");
		String address = sc.nextLine();
		
		member.setId(id);
		member.setMail(mail);
		member.setAddress(address);
		
		int result = MemberDAO.getInstance().updateMemberInfo(member, id);
		
		if(MemberService.memberInfo.getId().equals(id)) {
			if(result > 0) {
				System.out.println("수정성공");
			}else {
				System.out.println("수정실패");
			}
		}else {
			System.out.println("본인확인필요");
		}
	
	}
	
	// 탈퇴
	public void memberDelete() {
		
		Member member = new Member();
		System.out.println("id재입력> ");
		String id = sc.nextLine();
		member.setId(id);
		int result = MemberDAO.getInstance().memberDelete(id);
		if(MemberService.memberInfo.getPw().equals(id)) {
			if(result > 0) {
				System.out.println("회원탈퇴완료");
			}else {
				System.out.println("회원탈퇴실패");
			}
		}else {
			System.out.println("본인확인필요");
			memberDelete();
		}
	
	}
	
	// 강제탈퇴
	public void memberDelete2() {
		
		System.out.println("삭제할회원번호> ");
		int memberid = Integer.parseInt(sc.nextLine());
		int result = MemberDAO.getInstance().memberDelete2(memberid);
		if(result > 0) {
			System.out.println("강제탈퇴완료");
		}else {
			System.out.println("해당회원없음");
		}
	}
}
