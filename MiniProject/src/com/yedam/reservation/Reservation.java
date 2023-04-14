package com.yedam.reservation;

import java.sql.Date;

import lombok.Data;

@Data

public class Reservation{
	private String rsvId;
	private Date rsvDate;
	private String day;
	private String time;
	private int roomNo;
	private int rsvAble;
	private int memberId;
	private int rentNo;
	private String rsvMm;
}

