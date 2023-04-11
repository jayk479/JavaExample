package com.yedam.member;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.yedam.app.Application;

public class MemberService {
	
	public static Member memberInfo = null;
	
	Scanner sc = new Scanner(System.in);
	
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
			}else {
				System.out.println("패스워드오류");
			}
		}else {
			System.out.println("아이디오류");
		}	
	}
	
	public void logout() {
		if(memberInfo != null) {
			memberInfo = null;
			System.out.println("로그아웃되었습니다.");
		}
	}
	
	public void memberAdd() {
		Member member = new Member();
		System.out.println("ID> ");
		String id = sc.nextLine();
		System.out.println("PW> ");
		String pw = sc.nextLine();
		System.out.println("이름> ");
		String name = sc.nextLine();
//		System.out.println("생년월일> ");
//		String birth = sc.nextLine();
		
		
		member.setId(id);
		member.setPw(pw);
		member.setMemberName(name);
		//member.setBirth(birth);
		
		int result = MemberDAO.getInstance().memberAdd(member);
		if(result == 1) {
			System.out.println("회원가입완료");
			new Application();
		}else {
			System.out.println("회원가입실패");
		}
		
	}
	
	public void getMemberList(){
		List<Member> list = MemberDAO.getInstance().getMemberList();
		for(int i = 0; i < list.size(); i++) {
			System.out.print("번호 : " + list.get(i).getMemberId()+"\t");
			System.out.print("이름 : " + list.get(i).getMemberName()+"\t");
			System.out.print("등급 : " + list.get(i).getGrade()+"\t");	
			System.out.print("ID : " + list.get(i).getId()+"\n");
		}
	}

	public void updateMemberGrade() {
		Member member = new Member();
		
		System.out.println("번호> ");
		int memberId = Integer.parseInt(sc.nextLine());
		System.out.println("등급> ");
		String grade = sc.nextLine();
		
		member.setMemberId(memberId);
		member.setGrade(grade);
		
		int result = MemberDAO.getInstance().updateMemberGrade(member);
		
		if(result > 0) {
			System.out.println("수정성공");
		}else {
			System.out.println("수정실패");
		}

	}
	public void updateMemberInfo() {
		
//		Member member = new Member();
//		System.out.println("패스워드재입력> ");
//		String pw = sc.nextLine();
//		
//		if(member.getPw().equals(pw)) {
//			System.out.println("수정할메일> ");
//			String mail = sc.nextLine();
//			System.out.println("수정할주소> ");
//			String address = sc.nextLine();
//			
//			member.setPw(pw);
//			member.setMail(mail);
//			member.setAddress(address);
//			int result = MemberDAO.getInstance().updateMemberInfo(member, pw);
//			if(result > 0) {
//				System.out.println("수정성공");
//			}else {
//				System.out.println("수정실패");
//			}
//			
//		}else {
//			System.out.println("비밀번호불일치");
//		}

		Member member = new Member();
		System.out.println("패스워드재입력> ");
		String pw = sc.nextLine();
		System.out.println("수정할메일> ");
		String mail = sc.nextLine();
		System.out.println("수정할주소> ");
		String address = sc.nextLine();
		
		member.setPw(pw);
		member.setMail(mail);
		member.setAddress(address);
		
		int result = MemberDAO.getInstance().updateMemberInfo(member, pw);
		if(result > 0) {
			System.out.println("수정성공");
		}else {
			System.out.println("수정실패");
		}
		
	}
	
	public void memberDelete() {
		System.out.println("비밀번호재입력> ");
		String memberPw = sc.nextLine();
		int result = MemberDAO.getInstance().memberDelete(memberPw);
		// 비밀번호 같으면 같이 삭제되어버림ㅇㅇ 그리고 비밀번호 틀리면 로그아웃되어버림
		if(MemberService.memberInfo.getPw().equals(memberPw)) {
			if(result > 0) {
				System.out.println("회원탈퇴완료");
			}else {
				System.out.println("회원탈퇴실패");
			}
		}else {
			System.out.println("비밀번호불일치");
		}
	
	}
	
	public void memberDelete2() {
		System.out.println("삭제할멤버아이디> ");
		int memberId = Integer.parseInt(sc.nextLine());
		int result = MemberDAO.getInstance().memberDelete2(memberId);
		if(result > 0) {
			System.out.println("강제탈퇴완료");
		}else {
			System.out.println("강제탈퇴실패");
		}
	}

	
}
