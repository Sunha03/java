package jdbc.member.exam;

import java.sql.*;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public int insert(MemberDTO user) {
		String sql = "INSERT INTO member VALUES(?, ?, ?, ?, ?, sysdate, 1000)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, user.getId());
			ptmt.setString(2, user.getPass());
			ptmt.setString(3, user.getName());
			ptmt.setString(4, user.getAddr());
			ptmt.setString(5, user.getDeptno());
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("INSERT ERROR : " + e.getMessage());
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}

	@Override
	public int update(String id, String addr) {
		String sql = "UPDATE member SET addr=? WHERE id=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, addr);
			ptmt.setString(2, id);
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("UPDATE ERROR : " + e.getMessage());
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}

	@Override
	public int delete(String id) {
		String sql = "DELETE FROM member WHERE id=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("DELETE ERROR : " + e.getMessage());
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}

	@Override
	public void select() {
		String sql = "SELECT * FROM member";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getDate(6) + "\t"
						+ rs.getInt(7));
			}
		} catch(SQLException e) {
			System.out.println("SELECT ERROR : " + e.getMessage());
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		
	}

}
