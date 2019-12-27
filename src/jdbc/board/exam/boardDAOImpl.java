package jdbc.board.exam;

import java.sql.*;

import basic.java.preparedInsertTest;

//tb_board 테이블을 액세스하는 기능이 정의된 클래스
public class boardDAOImpl implements BoardDAO {

	//public int insert(String id, String title, String content) {
	public int insert(BoardDTO board) {
		String sql = "INSERT INTO tb_board VALUES(board_seq.nextval, ?, ?, ?, sysdate, 0)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;		//메소드 실행 결과가 저장될 변수
		
		try {
			con = DBUtil.getConnect();
			
			//1.PreparedStatement 생성
			ptmt = con.prepareStatement(sql);

			//2. '?'에 값 전달
			ptmt.setString(1, board.getId());
			ptmt.setString(2, board.getTitle());
			ptmt.setString(3, board.getContent());
			result = ptmt.executeUpdate();
		}
		catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {		//Exception이 발생하거나 발생하지 않거나 무조건 실행할 명령문 정의
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
			//Select문 실행
			rs = ptmt.executeQuery();
			//ResultSet에 레코드가 존재하는 동안 반복문 실행
			while(rs.next()) {			//레코드를 조회하기 위해서는 레코드가 1개라도 반드시 커서를 이동시켜야 함
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
