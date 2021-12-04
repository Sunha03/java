package basic.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class closeTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		//String url = "jdbc:oracle:thin:@70.12.115.65:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "SELECT * FROM tb_board";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();

			int res = stmt.executeUpdate(sql);
			//Select�� ����
			rs = stmt.executeQuery(sql);
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
		} finally {		//Exception�� �߻��ϰų� �߻����� �ʰų� ������ ������ ��ɹ� ����
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

}
