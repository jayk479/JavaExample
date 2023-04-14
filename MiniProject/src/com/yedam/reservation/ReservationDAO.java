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
	
	public List<Reservation> showRooms1(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 1 AND DAY = '월'ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	public List<Reservation> showRooms2(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 1 AND DAY = '화' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showRooms3(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 1 AND DAY = '수' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showRooms4(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 1 AND DAY = '목' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showRooms5(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 1 AND DAY = '금' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showRooms6(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 2 AND DAY = '월' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showRooms7(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 2 AND DAY = '화' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showRooms8(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 2 AND DAY = '수' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showRooms9(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 2 AND DAY = '목' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showRooms10(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 2 AND DAY = '금' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showRooms11(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 3 AND DAY = '월' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	public List<Reservation> showRooms12(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 3 AND DAY = '화' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	public List<Reservation> showRooms13(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 3 AND DAY = '수' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	public List<Reservation> showRooms14(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 3 AND DAY = '목' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	public List<Reservation> showRooms15(){
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 3 AND DAY = '금' ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				rsv.setRsvMm(rs.getString("RSV_MM"));
				
				list.add(rsv);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public List<Reservation> showMeetingRooms1() {
		List<Reservation> list = new ArrayList<>();
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 1 ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rsv.getRoomNo());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				
				list.add(rsv);
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
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 2 AND RSV_ABLE = 0 ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				
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
			String sql = "SELECT * FROM MEETINGROOM WHERE ROOM_NO = 3 AND RSV_ABLE = 0 ORDER BY RENT_NO";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				rsv = new Reservation();
				rsv.setRoomNo(rs.getInt("ROOM_NO"));
				rsv.setDay(rs.getString("DAY"));
				rsv.setTime(rs.getString("TIME"));
				rsv.setRsvAble(rs.getInt("RSV_ABLE"));
				rsv.setRentNo(rs.getInt("RENT_NO"));
				
				list.add(rsv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
//	public List<Reservation> showMeetingRooms2() {
//		List<Reservation> list = new ArrayList<>();
//		Reservation rsv = null;
//		try {
//			conn();
//			String sql = "select DISTINCT rsv_day, rsv_time from reservation where room_id = 2 and rsv_able = 0";
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				rsv = new Reservation();
//				rsv.setRoomNo(rs.getInt("ROOM_ID"));
//				rsv.setDay(rs.getString("RSV_DAY"));
//				rsv.setTime(rs.getString("RSV_TIME"));
//				list.add(rsv);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			disconn();
//		}
//		return list;
//	}
//	
//	public List<Reservation> showMeetingRooms3() {
//		List<Reservation> list = new ArrayList<>();
//		Reservation rsv = null;
//		try {
//			conn();
//			String sql = "select * from reservation where room_id = 3 and rsv_able = 0";
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				rsv = new Reservation();
//				rsv.setRoomNo(rs.getInt("ROOM_ID"));
//				rsv.setDay(rs.getString("RSV_DAY"));
//				rsv.setTime(rs.getString("RSV_TIME"));
//				list.add(rsv);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			disconn();
//		}
//		return list;
//	}
	public int selectMeetingRoom(Reservation rsv) {
		int result = 0;
		//int rsvAble = 0;
		try {
			conn();
		
//			String sql = "SELECT * FROM MEETINGROOM WHERE RSV_ABLE = 1";
//			pstmt = conn.prepareStatement(sql);
		
//			rs = pstmt.executeQuery();
//			if(rs.next()) {
//				rsvAble = rs.getInt("RSV_ABLE");
//			}
//			if(rsvAble == 0) {
				String sql2 = "UPDATE MEETINGROOM SET RSV_ABLE = 1, RSV_MM = '●', MEMBER_ID = ? WHERE ROOM_NO = ? AND DAY = ? AND TIME = ? ";
				pstmt = conn.prepareStatement(sql2);

				pstmt.setInt(1, rsv.getMemberId());
				pstmt.setInt(2, rsv.getRoomNo());
				pstmt.setString(3, rsv.getDay());
				pstmt.setString(4, rsv.getTime());
				//pstmt.setInt(rsvAble, rsv.getRsvAble());
				
				result = pstmt.executeUpdate();
	//		}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	public Reservation getReservation(int memberId) {
		Reservation rsv = null;
		try {
			conn();
			String sql = "SELECT * FROM MEETINGROOM WHERE MEMBER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, memberId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				rsv = new Reservation();	
				rsv.setRoomNo(rs.getInt("room_NO"));
				rsv.setDay(rs.getString("day"));
				rsv.setTime(rs.getString("time"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			disconn();
		}
		return rsv;
	}

//	public int updateRerevation(Reservation rsv) {
//		int result = 0;
//		try {
//			conn();
//			String sql = "UPDATE MEETINGROOM SET RSV_ABLE = 0, MEMBER_ID = NULL WHERE MEMBER_ID = ?";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, rsv.getMemberId());
//			
//			result = pstmt.executeUpdate();
//				if(result > 0) {
//					String sql2 = "UPDATE MEETINGROOM SET MEMBER_ID = ?, RSV_ABLE = 1 WHERE ROOM_NO = ? AND DAY = ? AND TIME = ?";
//					pstmt = conn.prepareStatement(sql2);
//					pstmt.setInt(1, rsv.getMemberId());
//					pstmt.setInt(2, rsv.getRoomNo());
//					pstmt.setString(3, rsv.getDay());
//					pstmt.setString(4, rsv.getTime());
//					
//					result = pstmt.executeUpdate();
//				}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			disconn();
//		}
//		
//		return result;
//	}
	
	public int deleteRerevation(Reservation rsv) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE MEETINGROOM SET RSV_ABLE = 0, RSV_MM = '○', MEMBER_ID = NULL WHERE MEMBER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rsv.getMemberId());
			
			result = pstmt.executeUpdate();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
}
