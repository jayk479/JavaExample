package com.yedam.reservation;

import java.util.List;
import java.util.Scanner;

import com.yedam.member.MemberService;

public class ReservationService {
	
	Scanner sc = new Scanner(System.in);
	
	public static Reservation reservationInfo = null;
	
	public void showMeetingRooms() {
		List<Reservation> list = ReservationDAO.getInstance().showMeetingRooms1();
		System.out.println("1회의실");
		//List<Reservation> list = Reservation.getInstance().showMeetingRooms();
		for (int i = 0; i < 2; i++) {
			System.out.print(list.get(i).getRsvDay() + "\t");
			for (int j = 0; j < 6; j++) {
				System.out.print(list.get(j).getRsvTime() + "\t");
				//System.out.print(list.get(j).getRoomId()+" 회의실 ");
			}	
			System.out.println();
			
			//System.out.print(list.get(i).getRsvDay()+ " " + list.get(i).getRsvTime()+"\n");
//			for (int j = 0; j < 3; j++) {
//			}
		}
		System.out.println();
	}
	
	public void selectMeetingRoom() {
		Reservation rsv = new Reservation();
		System.out.println("회의실> ");
		int roomId = Integer.parseInt(sc.nextLine());
		System.out.println("요일> ");
		String rsvDay = sc.nextLine();
		System.out.println("시간> ");
		String rsvTime = sc.nextLine();
		
		rsv.setMemberName(MemberService.memberInfo.getMemberName());
		rsv.setRoomId(roomId);
		rsv.setRsvDay(rsvDay);
		rsv.setRsvTime(rsvTime);
		
		int result = ReservationDAO.getInstance().selectMeetingRoom(rsv);
		if(result > 0) {
			System.out.println("예약성공");
		}else {
			System.out.println("예약실패");
		}	
	}
	
	public void getReservation() {
		Reservation rsv = ReservationDAO.getInstance().getReservation(MemberService.memberInfo.getMemberName());
		if(rsv == null) {
			System.out.println("예약내역없음");
		}else {
			System.out.println(rsv.getRoomId()+"회의실 "+rsv.getRsvDay()+"요일 " + rsv.getRsvTime());
		}
	}
	
//	public void updateRerevation() {
//		Reservation rsv = ReservationDAO.getInstance().updateRerevation();
//		System.out.println("이전예약취소");
//		System.out.println("회의실> ");
//		int roomId = Integer.parseInt(sc.nextLine());
//		System.out.println("요일> ");
//		String rsvDay = sc.nextLine();
//		System.out.println("시간> ");
//		String rsvTime = sc.nextLine();
//		
//		rsv.setMemberName(MemberService.memberInfo.getMemberName());
//		rsv.setRoomId(roomId);
//		rsv.setRsvDay(rsvDay);
//		rsv.setRsvTime(rsvTime);
//		
//		int result = ReservationDAO.getInstance().selectMeetingRoom(rsv);
//		if(result > 0) {
//			System.out.println("예약수정성공");
//		}else {
//			System.out.println("예약수정실패");
//		}	
//	}
	
	public void deleteRerevation() {
		Reservation rsv = new Reservation();
		 rsv.setMemberName(MemberService.memberInfo.getMemberName());
		 
		 int result = ReservationDAO.getInstance().deleteRerevation(rsv);
		 if(result > 0) {
			 System.out.println("삭제");
		 }else {
			 System.out.println("삭제실파");
		 }
		
		
	}
	
}
