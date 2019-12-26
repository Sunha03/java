package jdbc.board.exam;

import java.sql.*;

//DBMS에 접근하는 중복된 작업을 정의하는 클래스
public class DBUtil {
	//드라이버 로딩은 클래스가 로딩될 때, 같이 로딩되도록 처리
	//> static{} 안의 명령문은 클래스가 로딩될 때 한 번만 실행되는 코드
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("ERROR! " + e.getMessage());
		}
	}
	
	//2. 커넥션하기 - DBMS와 접속 후에 접속정보를 저장하고 있는 Connection을 리턴
	public static Connection getConnect() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@70.12.226.157:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			System.out.println("DBMS 연결 실패 " + e.getMessage());
		}
		
		return con;
	}
}
