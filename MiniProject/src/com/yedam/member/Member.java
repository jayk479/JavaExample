package com.yedam.member;


import lombok.Data;

@Data
public class Member {

	private int memberId; //영구결번해그냥
	private String memberName;
	private String birth;
	private String mail;
	private String address;
	private String phone;
	private String grade;
	private String id;
	private String pw;
}
