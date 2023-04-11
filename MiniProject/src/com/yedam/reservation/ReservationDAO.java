package com.yedam.reservation;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class ReservationDAO extends DAO{
	
	private static ReservationDAO reservationDao = new ReservationDAO();
	
	private ReservationDAO() {
		
	}
	
	public static ReservationDAO getInstance() {
		return reservationDao;
	}
	
	public List<Reservation> getReservationList() {
		List<Reservation> list = new ArrayList<>();
		Reservation reservation = null;
		try {
			conn();
			String sql = "SELECT * FROM RSV";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				reservation = new Reservation();
				reservation.setRoomNo(rs.getInt("room_no"));
				reservation.setYoil(rs.getString("yoil"));
				reservation.setTime(rs.getString("time"));
				list.add(reservation);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return list;
	}
	

}
