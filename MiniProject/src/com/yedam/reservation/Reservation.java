package com.yedam.reservation;

import lombok.Data;

@Data
public class Reservation {
	private int roomNo;
	private String yoil;
	private String time;
	private boolean rsv;
	private int rsvNo;
}
