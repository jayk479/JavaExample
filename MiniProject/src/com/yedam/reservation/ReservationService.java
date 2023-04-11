package com.yedam.reservation;

import java.util.List;

public class ReservationService {
	
	public void getReservationList() {
		List<Reservation> list =  ReservationDAO.getInstance().getReservationList();
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i).getYoil());
			for (int j = 0; j < 3; j++) {
				System.out.print(list.get(j).getTime()+"\t");
			}
			
		}
	
	}
}
