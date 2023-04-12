package com.yedam.reservation;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.member.MemberService;

public class ReservationDAO extends DAO{
	
	private static ReservationDAO reservationDao = new ReservationDAO();
	
	private ReservationDAO() {
		
	}
	
	public static ReservationDAO getInstance() {
		return reservationDao;
	}
	
	public List<Reservation> showMeetingRooms1() {
		List<Reservation> list = new ArrayList<>();
		Reservation reservation = null;
		try {
			conn();
			String sql = "select * from reservation where room_id = 1 and rsv_able = 0";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				reservation = new Reservation();
				reservation.setRoomId(rs.getInt("ROOM_ID"));
				reservation.setRsvDay(rs.getString("RSV_DAY"));
				reservation.setRsvTime(rs.getString("RSV_TIME"));
				list.add(reservation);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	public List<Reservation> showMeetingRooms2() {
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "select DISTINCT rsv_day, rsv_time from reservation where room_id = 2 and rsv_able = 0";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomId(rs.getInt("ROOM_ID"));
				rsv.setRsvDay(rs.getString("RSV_DAY"));
				rsv.setRsvTime(rs.getString("RSV_TIME"));
				list.add(rsv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showMeetingRooms3() {
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "select * from reservation where room_id = 3 and rsv_able = 0";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomId(rs.getInt("ROOM_ID"));
				rsv.setRsvDay(rs.getString("RSV_DAY"));
				rsv.setRsvTime(rs.getString("RSV_TIME"));
				list.add(rsv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	public int selectMeetingRoom(Reservation rsv) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE RESERVATION SET MEMBER_NAME = ?, RSV_ABLE = 1 WHERE ROOM_ID = ? AND RSV_DAY = ? AND RSV_TIME = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, rsv.getMemberName());
			pstmt.setInt(2, rsv.getRoomId());
			pstmt.setString(3, rsv.getRsvDay());
			pstmt.setString(4, rsv.getRsvTime());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	public Reservation getReservation(String memberName) {
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM RESERVATION WHERE MEMBER_NAME = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberName);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				rsv = new Reservation();	
				rsv.setRoomId(rs.getInt("room_id"));
				rsv.setRsvDay(rs.getString("rsv_day"));
				rsv.setRsvTime(rs.getString("rsv_time"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			disconn();
		}
		return rsv;
	}
	
	public int updateRerevation(Reservation rsv) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE RESERVATION SET RSV_ABLE = 0, MEMBER_NAME = NULL WHERE MEMBER_NAME = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, rsv.getMemberName());
			
			result = pstmt.executeUpdate();
				if(result > 0) {
					String sql2 = "UPDATE RESERVATION SET MEMBER_NAME = ?, RSV_ABLE = 1 WHERE ROOM_ID = ? AND RSV_DAY = ? AND RSV_TIME = ?";
					pstmt = conn.prepareStatement(sql2);
					pstmt.setString(1, rsv.getMemberName());
					pstmt.setInt(2, rsv.getRoomId());
					pstmt.setString(3, rsv.getRsvDay());
					pstmt.setString(4, rsv.getRsvTime());
					
					result = pstmt.executeUpdate();
				}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
	
	public int deleteRerevation(Reservation rsv) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE RESERVATION SET RSV_ABLE = 0, MEMBER_NAME = NULL WHERE MEMBER_NAME = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, rsv.getMemberName());
			
			result = pstmt.executeUpdate();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
}
