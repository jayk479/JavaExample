package com.yedam.account;

import com.yedam.common.DAO;
import com.yedam.customer.CustomerService;

public class AccountDAO extends DAO{
	
	private static AccountDAO accountDao = null;
	
	private AccountDAO() {
		
	}
	
	public static AccountDAO getInstance() {
		if(accountDao == null) {
			accountDao = new AccountDAO();
		}
		
		return accountDao;
	}
	
	// 계좌개설 - insert
	public int accountAdd(Account account) {
		int result = 0;
		try {
			conn();
			//시퀀스도사용가능ㅇㅇ
			String sql = "INSERT INTO ACCOUNT VALUES (?, ?, ?, sysdate)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, account.getAccountId());
			pstmt.setInt(2, account.getCustomerId());
			pstmt.setInt(3, account.getBalance());
			
			result = pstmt.executeUpdate();
//			
//			// sql 하나 더
//			if(result == 1) {
//				String sql2 = "UPDATE CUSTOMER SET ACCOUNT_ID = ? WHERE CUSTOMER_ID = ?";
//				pstmt = conn.prepareStatement(sql2);
//				System.out.println(account.getAccountId());
//				pstmt.setInt(1, account.getAccountId());
//				pstmt.setInt(2, account.getCustomerId());
//				
//				int result2 = pstmt.executeUpdate();
//				
//				if(result2 == 1) {
//					System.out.println("고객계좌등록완료");
//				}else {
//					System.out.println("고객계좌등록실패");
//				}	
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
	// 계좌해지 - update, delete
	// 계좌 당장 삭제x -> 3개월뒤삭제 or 해지한 히스토리 관리
	// update -> column 활성화/사용유무 만들어서 Y, N, L
	// 휴면계좌
	
	public int accountDelete(int accountId) {
		int result = 0;
		
		try {
			conn();
			String sql = "DELETE FROM ACCOUNT WHERE ACCOUNT_ID = ?";
			//쿼리문 자신 없을 땐 DBDEV에서 써보고 복붙하는 게 나음ㅇㅇ
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, accountId);
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return result;
	}
	
	public Account getAccount() {
		Account account = null;
		try {
			conn();
			String sql = "SELECT C.CUSTOMER_ID, C.CUSTOMER_NAME, A.ACCOUNT_ID, A.BALANCE, A.CREDATE\r\n"
					+ "FROM CUSTOMER C JOIN ACCOUNT A \r\n"
					+ "ON(C.CUSTOMER_ID = A.CUSTOMER_ID)\r\n"
					+ "WHERE C.CUSTOMER_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, CustomerService.customerInfo.getCustomerId());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				account = new Account();
				account.setCustomerId(rs.getInt("customer_id"));
				account.setCustomerName(rs.getString("customer_name"));
				account.setAccountId(rs.getInt("account_id"));
				account.setBalance(rs.getInt("balance"));
				account.setCredate(rs.getDate("credate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return account;
	}
	
	
	//입출금
	public int updateMoney (Account account, int cmd) {
		int result = 0;
		int balance = 0;
		
		try {
			conn();
			String sql = "SELECT BALANCE FROM ACCOUNT WHERE ACCOUNT_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, account.getAccountId());
		
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				balance = rs.getInt("balance");
			}
			if(cmd == 1) {
				//입금
				// balance =  현재잔고
				// 현재잔고 + 입금금액 = 통장잔고
				// account.getBalance() + balance
				
				//account.setBalance(balance + account.getBalance());
				//					통장잔고		입금금액
				String sql2 = "UPDATE ACCOUNT SET BALANCE = BALANCE+? WHERE ACCOUNT_ID = ?";
				pstmt = conn.prepareStatement(sql2);
				
				pstmt.setInt(1, account.getBalance());
				pstmt.setInt(2, account.getAccountId());
				
				result = pstmt.executeUpdate();
				
			}else if(cmd == 2) {
				// 출금
				if(balance - account.getBalance() >= 0) {
					String sql2 = "UPDATE ACCOUNT SET BALANCE = BALANCE-? WHERE ACCOUNT_ID = ?";
					pstmt = conn.prepareStatement(sql2);
					
					pstmt.setInt(1, account.getBalance());
					pstmt.setInt(2, account.getAccountId());
					
					result = pstmt.executeUpdate();
				}else {
					System.out.println("잔고보다 출금액이 많습니다.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
	
	
}
