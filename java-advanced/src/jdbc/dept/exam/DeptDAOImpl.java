package jdbc.dept.exam;

import java.util.*;
import java.sql.*;

public class DeptDAOImpl implements DeptDAO {

	@Override
	public int insert(DeptDTO dept) {
		String sql="INSERT INTO dept VALUES(?, ?, ?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, dept.getDeptno());
			ptmt.setString(2, dept.getDname());
			ptmt.setString(3, dept.getLoc_code());
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("Insert ERROR : " + e.getMessage());
		}
		
		return result;
	}

	@Override
	public DeptDTO getDeptInfo(int deptno) {
		String sql="SELECT * FROM dept WHERE deptno=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		DeptDTO dept = null;
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, deptno);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				dept = new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
				System.out.println(dept.getDeptno() + "/t" + dept.getDname() + "/t" + dept.getLoc_code());
			}
		} catch(SQLException e) {
			System.out.println("getDeptInfo ERROR : " + e.getMessage());
		}
		
		return dept;
	}

	@Override
	public int update(DeptDTO dept) {
		String sql="UPDATE dept SET dname=?, loc_code=? WHERE deptno=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dept.getDname());
			ptmt.setString(2, dept.getLoc_code());
			ptmt.setInt(3, dept.getDeptno());
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("Update ERROR : " + e.getMessage());
		}
		
		return result;
	}

	@Override
	public int delete(int deptno) {
		String sql="DELETE dept WHERE deptno=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, deptno);
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("Delete ERROR : " + e.getMessage());
		}
		
		return result;
	}

	@Override
	public ArrayList<DeptDTO> getDeptList() {
		String sql="SELECT * FROM dept";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				DeptDTO dept = new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
				list.add(dept);
				System.out.println(dept.getDeptno() + "/t" + dept.getDname() + "/t" + dept.getLoc_code());
			}
		} catch(SQLException e) {
			System.out.println("getDeptInfo ERROR : " + e.getMessage());
		}
		
		return list;
	}

	@Override
	public ArrayList<EmpDTO> getMemberList(int deptno) {
		String sql="SELECT ename FROM emp WHERE deptno=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, deptno);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				EmpDTO emp = new EmpDTO(rs.getString(1));
				list.add(emp);
				
				System.out.println(emp.getEname());
			}
		} catch(SQLException e) {
			System.out.println("getMemberList ERROR : " + e.getMessage());
		}
		
		return list;
	}

}
