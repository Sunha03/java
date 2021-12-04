package basic.java;

import java.sql.*;
import java.util.Scanner;

public class preparedUpdateText {

	public static void main(String[] args) {
		preparedUpdateText obj = new preparedUpdateText();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================ 게시물 수정 ================");
		System.out.print("수정할 ID 값을 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("수정할 Boardnum을 입력하세요 : ");
		int boardnum = sc.nextInt();

		obj.update(id, boardnum);
	}
	
	public void update(String id, int boardnum) {
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "UPDATE tb_board SET id=? WHERE boardnum=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, id);
			ptmt.setInt(2, boardnum);
			
			int res = ptmt.executeUpdate();
			System.out.println("수정 성공!" + res);
		}
		catch(ClassNotFoundException e) {
			System.out.println("ERROR! " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {
			try {
				if(ptmt != null)
					ptmt.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
