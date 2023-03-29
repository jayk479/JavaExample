package com.yedam.arrange;

import java.util.Calendar;

public class Exam01 {

	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// 요일을 숫자로 가져옴ㅇㅇ 일~토 1234567

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUSEDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FIRDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		default:
			break;
		}
	}

}
