package Exam01;

import java.sql.*;

public class CustomerDAO {
	
	public int insert(CustomerDTO customer) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "INSERT INTO customer VALUES(?, ?, ?, sysdate, 1000, ?)";
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, customer.getId());
			ptmt.setString(2, customer.getPass());
			ptmt.setString(3, customer.getName());
			ptmt.setString(4, customer.getAddr());
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("INSERT 실패 : " + e.getMessage());
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}
	
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "UPDATE customer SET addr=? WHERE id=?";
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, addr);
			ptmt.setString(2, id);
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("UPDATE 실패 : " + e.getMessage());
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}
	
	public int delete(String id) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "DELETE FROM customer WHERE id=?";
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("DELETE 실패 : " + e.getMessage());
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}
}
