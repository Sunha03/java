package jdbc.board.exam;

import java.sql.*;

import basic.java.preparedInsertTest;

//tb_board ���̺��� �׼����ϴ� ����� ���ǵ� Ŭ����
public class boardDAOImpl implements BoardDAO {

	//public int insert(String id, String title, String content) {
	public int insert(BoardDTO board) {
		String sql = "INSERT INTO tb_board VALUES(board_seq.nextval, ?, ?, ?, sysdate, 0)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;		//�޼ҵ� ���� ����� ����� ����
		
		try {
			con = DBUtil.getConnect();
			
			//1.PreparedStatement ����
			ptmt = con.prepareStatement(sql);

			//2. '?'�� �� ����
			ptmt.setString(1, board.getId());
			ptmt.setString(2, board.getTitle());
			ptmt.setString(3, board.getContent());
			result = ptmt.executeUpdate();
		}
		catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {		//Exception�� �߻��ϰų� �߻����� �ʰų� ������ ������ ��ɹ� ����
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}
	
	public int update(String id, int boardnum) {
		String sql = "UPDATE tb_board SET id=? WHERE boardnum=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, id);
			ptmt.setInt(2, boardnum);
			
			result = ptmt.executeUpdate();
		}
		catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}
	
	public int delete(int boardnum) {
		String sql = "DELETE tb_board WHERE boardnum=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			ptmt.setInt(1, boardnum);
			
			result = ptmt.executeUpdate();
		}
		catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}

	public void select() {
		String sql = "SELECT * FROM tb_board";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			int res = ptmt.executeUpdate();
			//Select�� ����
			rs = ptmt.executeQuery();
			//ResultSet�� ���ڵ尡 �����ϴ� ���� �ݺ��� ����
			while(rs.next()) {			//���ڵ带 ��ȸ�ϱ� ���ؼ��� ���ڵ尡 1���� �ݵ�� Ŀ���� �̵����Ѿ� ��
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" 
						+ rs.getString(3) + "\t" + rs.getString("content") + "\t"
						+ rs.getString(5) + "\t" + rs.getString(6));
			}
		}
		catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {
			DBUtil.close(null, ptmt, con);
		}
	}
}
