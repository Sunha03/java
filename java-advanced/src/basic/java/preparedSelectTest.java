package basic.java;

import java.sql.*;
import java.util.Scanner;

public class preparedSelectTest {

	public static void main(String[] args) {
		preparedSelectTest obj = new preparedSelectTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================ �Խù� ���� ================");
		
		obj.select();
	}
	
	public void select() {
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		//String url = "jdbc:oracle:thin:@70.12.115.65:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "SELECT * FROM tb_board";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);

			int res = ptmt.executeUpdate();
			//Select�� ����
			ResultSet rs = ptmt.executeQuery();
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
