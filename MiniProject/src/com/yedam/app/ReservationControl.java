package com.yedam.app;

import java.util.Scanner;

import com.yedam.reservation.ReservationService;

public class ReservationControl {
	Scanner sc = new Scanner(System.in);
	ReservationService rs = new ReservationService();
	
	String menu = "";
	
	public ReservationControl() {
		job();
	}
	
	private void job() {
		while(true) {
			System.out.println("1. 예약하기 | 2. 예약확인 | 3.예약변경 | 4. 예약취소 | 5. 돌아가기 ");
			System.out.println("입력> ");
			menu = sc.nextLine();
			if(menu.equals("1")) {
				rs.showMeetingRooms();
				//회의실선택->요일선택->시간선택
				 rs.selectMeetingRoom();
			}else if(menu.equals("2")) {
				rs.getReservation();
			}else if(menu.equals("3")) {
				//rs.updateRervation();
				rs.deleteRerevation();
				rs.selectMeetingRoom();
			}else if(menu.equals("4")) {
				rs.deleteRerevation();
			}else if(menu.equals("5")) {
				break;
			}else {
				System.out.println("오입력");
			}
		}
	}
}
