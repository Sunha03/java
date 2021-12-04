package basic.java;

import java.sql.*;
import java.util.Scanner;

public class preparedInsertTest {
	
	public static void main(String[] args) {
		preparedInsertTest obj = new preparedInsertTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================ 게시물 호출 ================");
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("Title을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("Content를 입력하세요 : ");
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
			
			//1.PreparedStatement 생성
			ptmt = con.prepareStatement(sql);

			//2. '?'에 값 전달
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			int res = ptmt.executeUpdate();
			System.out.println("Insert 성공!");
		}
		catch(ClassNotFoundException e) {
			System.out.println("ERROR! " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {		//Exception이 발생하거나 발생하지 않거나 무조건 실행할 명령문 정의
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
