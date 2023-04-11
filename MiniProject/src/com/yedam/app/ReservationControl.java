package com.yedam.app;

import java.util.Scanner;

import com.yedam.reservation.ReservationService;

public class ReservationControl {
	Scanner sc = new Scanner(System.in);
	ReservationService rs = new ReservationService();
	
	int menu = 0;
	
	public ReservationControl() {
		job();
	}
	
	private void job() {
		while(true) {
			System.out.println("1. 예약가능확인 | 2.예약변경 | 3. 예약확인");
			System.out.println("입력> ");
			menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				rs.getReservationList();
			}else if(menu == 2) {
				
			}else if(menu == 3) {
				
			}
		}
		
	}
}
