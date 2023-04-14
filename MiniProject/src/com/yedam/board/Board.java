package com.yedam.board;

import java.sql.Date;

import lombok.Data;

@Data
public class Board {
	private int indexNo;
	private String title;
	private String content;
	private int memberId;
	private String memberName;
	private Date writeDate;
}


 