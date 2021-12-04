package jdbc.member.exam;

import java.sql.*;

public class DBUtil {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 : " + e.getMessage());
		}
	}
	
	public static Connection getConnection() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch(SQLException e) {
			System.out.println("DBMS 연결 실패 : " + e.getMessage());
		}
		
		return con;
	}
	
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
			if(con != null)
				con.close();
		} catch(SQLException e) {
			System.out.println("Close 실패 : " + e.getMessage());
		}
	}
}
