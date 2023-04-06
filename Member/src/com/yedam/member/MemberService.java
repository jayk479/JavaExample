package com.yedam.member;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	// impl = service
	// 로그인 여부에 따라 분기 나뉨ㅇㅇ
	// 로그인은 메뉴 이동 할 떄마다 그 로그인 정보가 남아있어야함.
	// 정적 멤버(static)ㅇㅇㅇㅇㅇ
	// 1. 로그인
	// login성공
	// 로그인 -> 아이디, 패스워드 -> 조회성공 -> 로그인
	// 로그인 -> 정적 필드에게 로그인한 정보를 입력
	// 로그인실패
	// 정보조회실패 -> 정적필드에데이터 안 넣어준다.
	Scanner sc = new Scanner(System.in);
	
	public static Member memberInfo = null;
	//공용   공유    객체타입  객체          객체없음ㅇㅇ
	// 로그인 안 되어 있어 데이터 xxxx
	// login 여부 확인은 null은 로그인x, != null 은 로그인 된 거ㅇㅇ
	
	public void login() {
		//id 입력
		System.out.println("ID> ");
		String id = sc.nextLine();
		System.out.println("PW> ");
		String pw = sc.nextLine();
		
		// 1.member == null (id가 없다)
		// 2.member != null (회원정보가있다)
		Member member = MemberDAO.getInstance().login(id);
		
		if(member != null) {
			if(member.getPw().equals(pw)) {
				System.out.println("정상 로그인 되었습니다");
				System.out.println(member.getName()+"님 환영합니다.");
				memberInfo = member;
			}else {
				System.out.println("비밀번호가틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
	}
	
	public void logout() {
		memberInfo = null;
		System.out.println("로그아웃성공");
	}
	
	//회원전체조회
	public void getMemberList() {
		List<Member> list = MemberDAO.getInstance().getMemberList();
		for (Member member : list) {
			System.out.println("ID : " + member.getId());
			System.out.println("PW : " + member.getPw());
			System.out.println("NM : " + member.getName());
		}
	}
	
	//회원등록
	public void memberAdd() {
		
		String id = "";
		
		while(true) {
			System.out.println("ID> ");
			id = sc.nextLine();
			Member member = MemberDAO.getInstance().login(id);
			//이하 ID중복확인
			// 이걸로 NOT NULL, UNIQUE조건
			if(member == null) {
				System.out.println("회원가입가능");
				break;
			}else {
				System.out.println("중복ID, 재입력");
			}
		}
		
		System.out.println("PW> ");
		String pw = sc.nextLine();
		System.out.println("이름> ");
		String name = sc.nextLine();
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		
		int result  = MemberDAO.getInstance().memberAdd(member);
		
		if(result == 1) {
			System.out.println("회원등록성공");
		}else {
			System.out.println("회원등록실패");
		}
	}
	
	//회원수정
	//login 되어 있는 정보를 수정하는지 -> 실시간으로 로그인된 정보도 바꿔줘야한다
	//login 안 되어 있는 정보를 수정하는지 
	public void memberUpdate() {
		
		System.out.println("ID> ");
		String id = sc.nextLine();
		System.out.println("PW> ");
		String pw = sc.nextLine();
		
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);

		int result = MemberDAO.getInstance().memberUpdate(member);
		
		if(result > 0) {
			// 실시간으로 로그인된 정보도 바꿔줘야한다ㅇㅇ 
			if(id.equals(memberInfo.getId())){
				memberInfo = MemberDAO.getInstance().login(id);
			}
		}else {
			System.out.println("PW변경실패");
		}
	}
	
	//회원탈퇴
	// 로그인된 사람을 삭제할건지~~~~로그인 안 된 사람을~~~
	public void memberDelete() {
		System.out.println("삭제 ID> ");
		String id = sc.nextLine();
		
		int result = MemberDAO.getInstance().memberDelete(id);
		
		if(result > 0) {
			//로그인된사람을~~~
			if(id.equals(memberInfo.getId())){
				memberInfo = null; //자동로그아웃시켜버림
			}
		}else {	
			System.out.println("삭제완료");
		}
	}
}

