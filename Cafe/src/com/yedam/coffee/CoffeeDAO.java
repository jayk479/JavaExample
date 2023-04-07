package com.yedam.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CoffeeDAO extends DAO{
	
	private static CoffeeDAO coffeeDao = null;
	
	private CoffeeDAO() {
		
	}
	
	public static CoffeeDAO getInstance() {
		if(coffeeDao == null) {
			coffeeDao = new CoffeeDAO();
		}
		return coffeeDao;
	}
	
	public List<Coffee> getCoffeeList(){
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		
		try {
			conn();
			String sql = "SELECT COFFEE_MENU, COFFEE_PRICE FROM COFFEE";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return list;
	}
	
	public Coffee getMenu(String coffeeMene) {
		Coffee coffee = null;
		try {
			conn();
			String sql = "SELECT * FROM COFFEE WHERE COFFEE_MENU = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMene);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				coffee = new Coffee();
				
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return coffee;
	}
	
	public int coffeeAdd(Coffee coffee) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO COFFEE VALUES (?, ?, ?, 0)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, coffee.getCoffeeMenu());
			pstmt.setInt(2, coffee.getCoffeePrice());
			pstmt.setString(3, coffee.getCoffeeExplain());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	public int coffeeDelete(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM COFFEE WHERE coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);
			result = pstmt.executeUpdate();
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	public int updateSales(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql = "update coffee set coffee_sales = +1 where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}

	public List<Coffee> getCount() {
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		try {
			conn();
			String sql = "SELECT coffee_menu, coffee_sales, (coffee_sales*coffee_price)\r\n"
					+ "from coffee";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coff"
						+ "ee_menu"));
				coffee.setCoffeeSales(rs.getInt("coffee_sales"));
				coffee.setCoffeePrice(rs.getInt("(coffee_sales*coffee_price)"));
				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
	return list;	
	}
}
