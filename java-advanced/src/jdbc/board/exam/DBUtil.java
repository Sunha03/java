package jdbc.board.exam;

import java.sql.*;

//DBMS�� �����ϴ� �ߺ��� �۾��� �����ϴ� Ŭ����
public class DBUtil {
	//����̹� �ε��� Ŭ������ �ε��� ��, ���� �ε��ǵ��� ó��
	//> static{} ���� ��ɹ��� Ŭ������ �ε��� �� �� ���� ����Ǵ� �ڵ�
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("ERROR! " + e.getMessage());
		}
	}
	
	//2. Ŀ�ؼ��ϱ� - DBMS�� ���� �Ŀ� ���������� �����ϰ� �ִ� Connection�� ����
	public static Connection getConnect() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			System.out.println("DBMS ���� ���� " + e.getMessage());
		}
		
		return con;
	}
	
	//3. �ڿ� �ݳ� - ResultSet, Statement, Connection ��ü ����� ����
	//			  > ������ ��ü�� ������ �� �ֵ��� �޼ҵ带 �����ص� ��
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
			if(con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
