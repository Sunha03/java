package basic.java;

import java.sql.*;
import java.util.Scanner;

public class preparedDeleteTest {

	public static void main(String[] args) {
		preparedDeleteTest obj = new preparedDeleteTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================ �Խù� ���� ================");
		System.out.print("������ Boardnum�� �Է��ϼ��� : ");
		int boardnum = sc.nextInt();
		
		obj.delete(boardnum);
	}

	public void delete(int boardnum) {
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "DELETE tb_board WHERE boardnum=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);

			ptmt.setInt(1, boardnum);
			
			int res = ptmt.executeUpdate();
			System.out.println("1�� ���� �����ƽ��ϴ�.");
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
