package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class DeptDAOImpl implements DeptDAO {
	
	@Override
	public int insert(DeptDTO dept) {
		String sql = "INSERT INTO mydept VALUES(?, ?, ?, ?, ?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, dept.getDeptNo());
			ptmt.setString(2, dept.getDeptName());
			ptmt.setString(3, dept.getLoc());
			ptmt.setString(4, dept.getTel());
			ptmt.setString(5, dept.getMgr());
			
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}

	@Override
	public ArrayList<DeptDTO> getDeptList() {
		//System.out.println("getDeptListȣ�� > ���� �Ķ���� ���");  //�����
		
		String sql = "SELECT * FROM mydept";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		ArrayList<DeptDTO> deptList = new ArrayList<DeptDTO>();
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				DeptDTO dept = new DeptDTO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4), rs.getString(5));
				deptList.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		return deptList;
	}

	@Override
	public int delete(String deptNo) {
		String sql = "DELETE FROM mydept WHERE deptno=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptNo);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}

	@Override
	public DeptDTO readDept(String deptNo) {
		String sql = "SELECT * FROM mydept WHERE deptNo=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		DeptDTO dept = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptNo);
			rs = ptmt.executeQuery();
			
			//���ڵ尡 1�� - DTO ���ڵ�� ��ȯ
			//���ڵ尡 ���� �� - DTO�� ���ڵ带 ��ȯ + ArrayList�� add
			if(rs.next()) {
				dept = new DeptDTO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4), rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		System.out.println(dept.getDeptNo() + " " + dept.getDeptName() + " ");
		
		return dept;
	}
}
