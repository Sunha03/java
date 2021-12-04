package jdbc.dept.exam;

import java.sql.*;
import java.util.*;

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
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch(SQLException e) {
			System.out.println("CLOSE ERROR : " + e.getMessage());
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
		}
		catch(SQLException e) {
			System.out.println("CLOSE ERROR : " + e.getMessage());
		}
		
	}
}
