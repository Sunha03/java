package basic.java;

import java.sql.*;

public class selectTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		//String url = "jdbc:oracle:thin:@70.12.115.65:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "SELECT * FROM tb_board";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();

			int res = stmt.executeUpdate(sql);
			//Select문 실행
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("ResultSet : " + rs);
			//ResultSet에 레코드가 존재하는 동안 반복문 실행
			while(rs.next()) {			//레코드를 조회하기 위해서는 레코드가 1개라도 반드시 커서를 이동시켜야 함
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" 
						+ rs.getString(3) + "\t" + rs.getString("content") + "\t"
						+ rs.getString(5) + "\t" + rs.getString(6));
			}
		}
		catch(ClassNotFoundException e) {
			System.out.println("ERROR! " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		}
	}

}
