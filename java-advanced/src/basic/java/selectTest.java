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
			//Select�� ����
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("ResultSet : " + rs);
			//ResultSet�� ���ڵ尡 �����ϴ� ���� �ݺ��� ����
			while(rs.next()) {			//���ڵ带 ��ȸ�ϱ� ���ؼ��� ���ڵ尡 1���� �ݵ�� Ŀ���� �̵����Ѿ� ��
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
