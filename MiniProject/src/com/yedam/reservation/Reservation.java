package com.yedam.reservation;

import lombok.Data;

@Data
public class Reservation {
	private int rsvId;
	private int roomId;
	private boolean rsvAble;
	private String rsvDay;
	private String rsvTime;
	private String memberName;
}

