package com.yedam.API;

public class Member {
	
//	@Override
//	public String toString() {
//		return "Member [id=" + id + "]"; //자바에서 제공되는 기본 형식
//	}

	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// String은 객체임ㅇㅇ 객체는 해시코드를 가진다ㅇㅇ
		return id.hashCode();
	}
	
	
	
	
}
