package basic.java;

import java.sql.*;
import java.util.Scanner;

public class preparedInsertTest {
	
	public static void main(String[] args) {
		preparedInsertTest obj = new preparedInsertTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================ �Խù� ȣ�� ================");
		System.out.print("ID�� �Է��ϼ��� : ");
		String id = sc.nextLine();
		System.out.print("Title�� �Է��ϼ��� : ");
		String title = sc.nextLine();
		System.out.print("Content�� �Է��ϼ��� : ");
		String content = sc.nextLine();
		
		obj.insert(id, title, content);
	}
	
	public void insert(String id, String title, String content) {
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		//String url = "jdbc:oracle:thin:@70.12.115.65:1521:xe";
		String user = "scott";
		String password = "tiger";
		//String sql = "INSERT INTO tb_board VALUES(board_seq.nextval, '" + id +"', '" + title + "', '" + content + "', sysdate, 0)";
		String sql = "INSERT INTO tb_board VALUES(board_seq.nextval, ?, ?, ?, sysdate, 0)";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			
			//1.PreparedStatement ����
			ptmt = con.prepareStatement(sql);

			//2. '?'�� �� ����
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			int res = ptmt.executeUpdate();
			System.out.println("Insert ����!");
		}
		catch(ClassNotFoundException e) {
			System.out.println("ERROR! " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {		//Exception�� �߻��ϰų� �߻����� �ʰų� ������ ������ ��ɹ� ����
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
