package basic.java;

import java.sql.*;

public class UpdateTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "UPDATE tb_board SET id='kang' WHERE boardnum=2";
			int res = stmt.executeUpdate(sql);
			System.out.println("수정 성공!" + res);
		}
		catch(ClassNotFoundException e) {
			System.out.println("ERROR! " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		}
	}

}
