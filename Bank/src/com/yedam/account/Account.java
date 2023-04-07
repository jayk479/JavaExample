package com.yedam.account;

import java.sql.Date;

import lombok.Data;

@Data
public class Account {
	private int accountId;
	private int customerId;
	private int balance;
	private Date credate;
	
	// JOIN 할 때 CUSTOMER 테이블에 있는 CUSTOMER_NAME을 저장하기 위해
	// 필드 추가
	
	private String customerName;
}
