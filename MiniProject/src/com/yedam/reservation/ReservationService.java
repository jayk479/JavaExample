package com.yedam.reservation;


import java.util.List;
import java.util.Scanner;

import com.yedam.member.MemberService;

public class ReservationService {
	
	
	
	Scanner sc = new Scanner(System.in);
	
	public static Reservation reservationInfo = null;
//	
//	public void showMeetingRooms() {
//		List<Reservation> list = ReservationDAO.getInstance().showMeetingRooms1();
//		System.out.println("1회의실");
//		//List<Reservation> list = Reservation.getInstance().showMeetingRooms();
//		for (int i = 0; i < list.size(); i++) {
//			//System.out.print(list.get(i).getDay() + "\t" + list.get(i).getTime() + "\n");
//			System.out.print(list.get(i).getDay() + "\t");
//			System.out.print(list.get(i).getTime() + "\n");
//		
////			for (int j = 0; j < 6; j++) {
////				System.out.print(list.get(j).getTime() + "\t");
//				
////				if(list.get(j).getRentNo()%5 == 0) {
////				System.out.print(list.get(j).getTime() + "\t");
////				}
//			}	
//			System.out.println();
//			
//			//System.out.print(list.get(i).getRsvDay()+ " " + list.get(i).getRsvTime()+"\n");
////			for (int j = 0; j < 3; j++) {
////			}
//		}
//		//System.out.println();
////	}
	
	// 예약하기 : 회의실선택 -> 예약가능한 요일, 시간 보여주기 -> 요일선택 -> 시간선택
	public void selectMeetingRoom() {
		Reservation rsv = new Reservation();
	
			System.out.println("회의실 선택 1회의실 | 2회의실 | 3회의실 ");
			System.out.println("회의실번호> ");
			int roomNo = Integer.parseInt(sc.nextLine());
			rsv.setRoomNo(roomNo);
			//List<Reservation> list = ReservationDAO.getInstance().showMeetingRooms1();
				if(roomNo == 1) {
					List<Reservation> list = ReservationDAO.getInstance().showRooms1();
					System.out.println("1회의실\n\t09:00~10:30\t10:30~12:00\t13:00~14:30\t14:30~16:00\t16:00~17:30\t17:30~19:00");
					for (int i = 0; i < 1; i++) {
						System.out.print(list.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list2 = ReservationDAO.getInstance().showRooms2();
					for (int i = 0; i < 1; i++) {
						System.out.print(list2.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list2.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list3 = ReservationDAO.getInstance().showRooms3();
	
					for (int i = 0; i < 1; i++) {
						System.out.print(list3.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list3.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list4 = ReservationDAO.getInstance().showRooms4();
					for (int i = 0; i < 1; i++) {
						System.out.print(list4.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list4.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list5 = ReservationDAO.getInstance().showRooms5();
					for (int i = 0; i < 1; i++) {
						System.out.print(list5.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list5.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					System.out.println();
//					for (int i = 0; i < list.size(); i++) {
//						System.out.print(list.get(i).getDay() + "\t");
//						System.out.print(list.get(i).getTime() + "\n");
//				}
				}else if(roomNo == 2) {
					List<Reservation> list = ReservationDAO.getInstance().showRooms6();
					System.out.println("2회의실\n\t9:00~10:30\t10:30~12:00\t13:00~14:30\t14:30~16:00\t16:00~17:30\t17:30~19:00");
					for (int i = 0; i < 1; i++) {
						System.out.print(list.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list2 = ReservationDAO.getInstance().showRooms7();
					for (int i = 0; i < 1; i++) {
						System.out.print(list2.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list2.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list3 = ReservationDAO.getInstance().showRooms8();
	
					for (int i = 0; i < 1; i++) {
						System.out.print(list3.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list3.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list4 = ReservationDAO.getInstance().showRooms9();
					for (int i = 0; i < 1; i++) {
						System.out.print(list4.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list4.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list5 = ReservationDAO.getInstance().showRooms10();
					for (int i = 0; i < 1; i++) {
						System.out.print(list5.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list5.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					System.out.println();
					
//					List<Reservation> list = ReservationDAO.getInstance().showMeetingRooms2();
//					System.out.println("2회의실");
//					for (int i = 0; i < list.size(); i++) {
//						System.out.print(list.get(i).getDay() + "\t");
//						System.out.print(list.get(i).getTime() + "\n");
//					}
				}else if(roomNo == 3) {
					List<Reservation> list = ReservationDAO.getInstance().showRooms11();
					System.out.println("3회의실\n\t09:00~10:30\t10:30~12:00\t13:00~14:30\t14:30~16:00\t16:00~17:30\t17:30~19:00");
				
					for (int i = 0; i < 1; i++) {
						System.out.print(list.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list2 = ReservationDAO.getInstance().showRooms12();
					for (int i = 0; i < 1; i++) {
						System.out.print(list2.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list2.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list3 = ReservationDAO.getInstance().showRooms13();
	
					for (int i = 0; i < 1; i++) {
						System.out.print(list3.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list3.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list4 = ReservationDAO.getInstance().showRooms14();
					for (int i = 0; i < 1; i++) {
						System.out.print(list4.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list4.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					List<Reservation> list5 = ReservationDAO.getInstance().showRooms15();
					for (int i = 0; i < 1; i++) {
						System.out.print(list5.get(i).getDay() + '\t');
						for (int j = 0; j < 6; j++) {
							System.out.print(list5.get(j).getRsvMm()+"\t\t");
						}
						System.out.println();
					}
					System.out.println();
					
//					List<Reservation> list = ReservationDAO.getInstance().showMeetingRooms3();
//					System.out.println("3회의실");
//					for (int i = 0; i < list.size(); i++) {
//						System.out.print(list.get(i).getDay() + "\t");
//						System.out.print(list.get(i).getTime() + "\n");
//					}
				}
			System.out.println("요일 선택 1. 월 | 2. 화 | 3. 수 | 4. 목 | 5. 금");
			System.out.println("요일> ");
			String day = sc.nextLine();
				if(day.equals("1")) {
					day = "월";
				}else if(day.equals("2")) {
					day = "화";
				}else if(day.equals("3")) {
					day = "수";
				}else if(day.equals("4")) {
					day = "목";
				}else if(day.equals("5")) {
					day = "금";
				}
			System.out.println("시간 선택 1. 09:00~10:30 | 2. 10:30~12:00 | 3. 13:00~14:30 | 4. 14:30~16:00 | 5. 16:00~17:30 | 6. 17:30~19:00");
			System.out.println("시간> ");
			String time = sc.nextLine();
				if(time.equals("1")) {
					time = "09:00~10:30";
				}else if(time.equals("2")) {
					time = "10:30~12:00";
				}else if(time.equals("3")) {
					time = "13:00~14:30";
				}else if(time.equals("4")) {
					time = "14:30~16:00";
				}else if(time.equals("5")) {
					time = "16:00~17:30";
				}else if(time.equals("6")) {
					time = "17:30~19:00";
				}
			
				//멤버아이디왜안됨?
			rsv.setMemberId(MemberService.memberInfo.getMemberId());
			rsv.setRoomNo(roomNo);
			rsv.setDay(day);
			rsv.setTime(time);
			
//			int rsvAble = 0;
//			reservationInfo = ReservationDAO.getInstance().getReservation(MemberService.memberInfo.getMemberId());
//			rsvAble = ReservationService.reservationInfo.getRsvAble();
			
//			if(rsvAble != 0 ) {
//				System.out.println("중복예약불가");
//			}else if(rsvAble == 0) {
				int result = ReservationDAO.getInstance().selectMeetingRoom(rsv);
				if(result > 0) {
					System.out.println("예약성공");
				}else {
					System.out.println("예약실패");
				}
			}
//	}
	
	// 예약내역확인 1인 1개밖에 안 됨
	public void getReservation() {
		Reservation rsv = ReservationDAO.getInstance().getReservation(MemberService.memberInfo.getMemberId());
		if(rsv == null) {
			System.out.println("예약내역없음");
		}else {
			System.out.println(rsv.getRoomNo()+" 회의실 : "+rsv.getDay()+"요일 : " + rsv.getTime());
		}
	}
	

	//어차피 예약수정이 이전 예약취소 후 재예약이라면 필요없음
//	public void updateRerevation() {
//		Reservation rsv = new Reservation();
//		System.out.println("이전예약취소완료");
//		System.out.println("재예약====");
//		System.out.println("회의실> ");
//		int roomNo = Integer.parseInt(sc.nextLine());
//		System.out.println("요일 선택 1. 월 | 2. 화 | 3. 수 | 4. 목 | 5. 금");
//		System.out.println("요일> ");
//		String day = sc.nextLine();
//			if(day.equals("1")) {
//				day = "월";
//			}else if(day.equals("2")) {
//				day = "화";
//			}else if(day.equals("3")) {
//				day = "수";
//			}else if(day.equals("4")) {
//				day = "목";
//			}else if(day.equals("5")) {
//				day = "금";
//			}
//		System.out.println("시간 선택 1. 09:00~10:30 | 2. 10:30~12:00 | 3. 13:00~14:30 | 4. 14:30~16:00 | 5. 16:00~17:30 | 6. 17:30~19:00");
//		System.out.println("시간> ");
//		String time = sc.nextLine();
//			if(time.equals("1")) {
//				time = "09:00~10:30";
//			}else if(time.equals("2")) {
//				time = "10:30~12:00";
//			}else if(time.equals("3")) {
//				time = "13:00~14:30";
//			}else if(time.equals("4")) {
//				time = "14:30~16:00";
//			}else if(time.equals("5")) {
//				time = "16:00~17:30";
//			}else if(time.equals("6")) {
//				time = "17:30~19:00";
//			}
//		
//		rsv.setMemberId(MemberService.memberInfo.getMemberId());
//		rsv.setRoomNo(roomNo);
//		rsv.setDay(day);
//		rsv.setTime(time);
//		
//		int result = ReservationDAO.getInstance().selectMeetingRoom(rsv);
//		if(result > 0) {
//			System.out.println("예약수정성공");
//		}else {
//			System.out.println("예약수정실패");
//		}	
//	}
	
	// 예약취소
	public void deleteRerevation() {
		Reservation rsv = new Reservation();
		 rsv.setMemberId(MemberService.memberInfo.getMemberId());
		 int result = ReservationDAO.getInstance().deleteRerevation(rsv);
		 if(result > 0) {
			 System.out.println("예약내역삭제");
		 }else {
			 System.out.println("삭제실패");
		 }
	}
	
}
