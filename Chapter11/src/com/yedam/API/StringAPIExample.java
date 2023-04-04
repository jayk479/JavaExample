package com.yedam.API;

import java.util.Iterator;
import java.util.Scanner;


public class StringAPIExample {

	public static void main(String[] args) {
		//byte[] -> String 변환
		
//		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
//		
//		String str1 = new String(bytes);
//		System.out.println(str1);
//		
//		//내가 원하는 위치를 선정(6)하고 그 갯수만큼 출력(4)
//		String str2 = new String(bytes, 6, 4);
//		System.out.println(str2);
//		
//		//charAt()
//		//인덱스 값(문자 위치)를 입력해서 해당 위치에 있는 문자를 가져오기
//		String ssn = "010645-159874";
//		char gender = ssn.charAt(7);
//		System.out.println(gender);
//		
//		switch (gender) {
//		case '1':
//		case '3':
//			System.out.println("남자");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자");
//			break;
//		default:
//			break;
//		}
//		
//		// 문자열 비교
//		//equals()
//		
//		String str3 = "김또치";
//		String str4 = "김또치";
//		String str5 = new String("김또치");
//
//		if(str3.equals(str4)) {
//			System.out.println("같은 문자열");
//		}else {
//			System.out.println("다른 문자열");
//		}
//		if(str3.equals(str5)) {
//			System.out.println("같은 문자열");
//		}else {
//			System.out.println("다른 문자열");
//		}
//		
//		//바이트배열로 변환 : getBytes()
//		//String ->  byte로 변환
//		
//		String str6 = "helloworld";
//		byte[] byte1 = str6.getBytes();
//		for (byte temp  : byte1) {
//			System.out.println(temp);
//		}
//		
//		//byte -> String
//		String str7 = new String(byte1);
//		System.out.println(str7);
//		
//		// byte <-> String + encoding type
//		try {
//			//String -> byte + EUC-KR
//			// UTF-8, MS949 etc
//			byte[] byte2 = str6.getBytes("EUC-KR");
//			System.out.println("byte2.length : " + byte2.length);
//			for(byte temp : byte2) {
//				System.out.println(temp);
//			}
//			
//			//byte -> String
//			String str8 = new String(byte2, "EUC-KR");
//			System.out.println(str8);
//			
//			
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		
//		// 문자열 찾기
//		// indexOf()
//		String subject = "자바 프로그래밍";
//		int index = subject.indexOf("그래밍");
//		System.out.println(index);
//		
//		// 문자열 길이
//		System.out.println(subject.length());
//		
//		String ssn2 = "000012-393939";
//		if(ssn2.length() == 14) {
//			System.out.println("주민번호자리수맞음");
//		}else {
//			System.out.println("주민번호자리수틀림");
//		}
//		
//		// 문자열 대치(바꾸기)
//		// replace
//		String oldStr = "자바 프로그래밍";
//		String newStr = oldStr.replace("자바", "Java");
//		System.out.println(newStr);
//		
//		// 문자열 자르기
//		// subString()
//		// 매개변수에 따라서 자르는 방법이 다르다.
//		// 1) 매개 변수가 1개 일 때 -> 해당 위치로부터 뒤로 다 자름
//		String ssn3 = "123456-1234567";
//		String firstNum = ssn3.substring(7);
//		System.out.println(firstNum);
//		
//		// 2) 매개 변수가 2개 일 때 -> 시작 위치 ~ 끝나는 위치 앞까지 자름
//		String secondNum = ssn3.substring(0, 6);
//		System.out.println(secondNum);
//		
//		
//		// 대문자 -> 소문자
//		String dae = "ABCDEFG";
//		System.out.println(dae.toLowerCase());
//		
//		//소문자 -> 대문자
//		String so = "abcdefg";
//		System.out.println(so.toUpperCase());
//		
//		//양쪽 공백 제거
//		//trim()
//		String name = "    고희동     ";
//		System.out.println(name.trim());
//		
//		// 기본타입 -> 문자열 변환
//		//String.valueof
//		
//		String temp = String.valueOf(123);
//		temp = String.valueOf(true);
//		System.out.println(temp);
//		System.out.println();
//		
//		//문자열 분리하기
//		//split() - 조건문자(구분자)를 통한 문자열 분리
//		
//		String value = "1,2,3,4,5,6,7,8,9";
//		String[] strAry = value.split(",");
//		for(String data : strAry) {
//			System.out.println(data);
//		}
//		
//		// contains() - 포함하고 있는 문자열 확인
//		String var = "또치";
//		if(var.contains("또")) {
//			System.out.println("또 포함 됨");
//		}else {
//			System.out.println("또 포함 안 됨");
//		}
//		
//		// isEmpty()
//		String empty = "";
//		if(empty.isEmpty()) {
//			System.out.println("비었다");
//		}else {
//			System.out.println("안 비었다");
//		}
//		
//		// String의 단점을 보완해 줄 수 있는 API
//		// Stringbuffer
//		// Stringbuilder
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append("ye");
//		sb.append("dam");
//		System.out.println(sb);
		
		System.out.println("===============");
		//문제 1] 문자열 뒤집기
		//예시 : 입력 > "12345678"
		           // 출력 > "87654321"
		String mon1 = "12345678";
//		byte[] byte1 = mon1.getBytes();
//		byte[] temp = null;
		
		String revers = "";
		for (int i = mon1.length()-1 ; i >= 0; i--) {
			revers = revers + mon1.charAt(i);
		}
		System.out.println(revers);
		
		
			

		//문제 2] 문자열 개수 세기
		// 입력되는 문자열을 뒤집어 출력하라
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("입력> ");
//		String mon2 = sc.next();
//		String mon22 = "";
//		//byte[] byte2 = mon2.getBytes();
//		for (int i = mon2.length()-1; i >= 0; i--) {
//			char temp = mon2.charAt(i);
//			mon22 += temp;
//		}
////		for (int i = mon2.length()-1 ; i >= 0; i--) {
////			revers = revers + mon2.charAt(i);
////		}
//		System.out.println(mon22);
//
//		
		
		//문제 3] 문자열 압축
		// 예시 : 입력 >"YYYEEDDDYYYMMMAAA";
		//      출력 >Y3E2D3Y3M3A3
		// 기본타입할 때?
		// 정답??
//		int alpha = 0;
//		int number = 0;
//		int blank = 0;
//		System.out.println("입력> ");
//		String mon3 = sc.next();
//		for (int i = 0; i < mon3.length(); i++) {
//			char temp = mon3.charAt(i);
//			if(temp == ' ') {
//				blank++;
//			}else if(temp >= '0' && temp <= '9') {
//				number++;
//			}else if(temp >= 'a' && temp <= 'z') {
//				alpha++;
//			}
//		}
//		System.out.println("공백 : " + blank + " 숫자 : " + number + " 알파벳 : " + alpha);
//		
//		
//		System.out.println("문자열 입력> ");
//		//String mon3 = sc.next();
//		String count = "";
//		byte[] bytes = mon3.getBytes();
//		
//		for (int i = 0; i < bytes.length; i++) {
//			if(bytes[i] == bytes[i+1]) {
//				
//			}
//		}
//		
		

		//문제 4] 생년월일 입력 후 나이 출력하기(220101 -> 2022년생, 230202 -> 1923년생)
//		        (단, 오늘 날짜 기준으로 생일이 지났으면 +1살, 안 지났으면 +0로 한다.)
//		        (올해 기준 +- 100살까지만 구한다.)
//		     예시) 
//		          입력> 950101 
//		          출력> 29
//		          입력> 001013
//		          출력> 23
		//1) 계산식(하드코딩)
		//1-1) 2000년 이후 2023 이전 출생 (23-태어난년도)+1
		//1-2) 1922년 이후 2000 이전 출생 (123-태어난년도)
		
//		System.out.println("생년월일>");
//		String birth = sc.next();
//		int birthNo = Integer.parseInt(birth.substring(0,2));
//		if(birthNo<=23) {
//			System.out.println("나이 : "+(23-birthNo+1));
//		}else if(birthNo > 23) {
//			System.out.println("나이 : " + (123-birthNo));
//		}
		
		// 계산식 -> 일반화
		// Calendar, date(simpledateFormat)
		// 오늘 년도를 가지고와서 이 년도를 활용해서 프로그램 동작
		// 연월일시간 나이를 측정
		// 연월일 지났다. 안 지났다.
		
		System.out.println("입력> ");
		String mon4 = sc.next();
		String year = mon4.substring(0, 2);
		String date = mon4.substring(2);
		String currDate = "0404";
		int age = 0;
		if(Integer.parseInt(date) >= Integer.parseInt(currDate)) {
			if(Integer.parseInt(year) >= 23) {
				age = 2023 - (1900+Integer.parseInt(year));
			}else {
				age = 2023 - (2000+Integer.parseInt(year));
			}
			}else {
				if(Integer.parseInt(year) >= 23) {
					age = 2023 - (1900+Integer.parseInt(year))+1;
				}else {
					age = 2023 - (2000+Integer.parseInt(year))+1;
				}
			}
		System.out.println(age+"살");
//	

		//문제 5] 중복 문자 갯수 세기
//		         입력> aaabbccceedddd
//		         출력> a 3개, b 2개, c 3개, e 2개, d 4개
		
		
		// a~z : 26개
		// 배열 인덱스 -> 0~ 25개의크기를 가지는 배열
		// 아스키 코드 활용ㅇㅇ
		// 문자열 입력
		String mon5 = sc.next().toLowerCase();
		int charAry[] = new int[26];
		
		for (int i = 0; i < mon5.length(); i++) {
			char temp = mon5.charAt(i);
			charAry[temp-'a']++;
		}
		for (int i = 0; i < charAry.length; i++) {
			if(charAry[i] != 0) {
				System.out.println((char)(97-i)+" "+charAry[i]+"개");
			}
		}
		
		
//		System.out.println("입력> ");
//		String mon5 = sc.next();
//		int  = 0;
//		for (int i = 0; i < mon5.length(); i++) {
////			if(mon5.indexOf(mon5.charAt(i))) {
////			}
//			System.out.println();
//			System.out.println(mon5.charAt(i));
//			
//				count++;
//			}
		
			//System.out.println(mon5.charAt(0)+count+"개");
		}
		
		
	

}
