package basic.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();

			//String sql = "DELETE tb_board WHERE boardnum=5";
			//int res = stmt.executeUpdate(sql);
			
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE tb_board ");
			sql.append("WHERE boardnum = 1");
			int res = stmt.executeUpdate(sql.toString());
			System.out.println("1개 행이 삭제됐습니다.");
		}
		catch(ClassNotFoundException e) {
			System.out.println("ERROR! " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		}
	}

}
