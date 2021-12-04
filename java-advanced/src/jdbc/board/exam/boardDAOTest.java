package jdbc.board.exam;

import java.util.Scanner;

public class boardDAOTest {

	public static void main(String[] args) {
		boardDAOImpl obj = new boardDAOImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================ 게시물 호출 ================");
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("Title을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("Content를 입력하세요 : ");
		String content = sc.nextLine();
		
		BoardDTO dto = new BoardDTO(id, title, content);
		obj.insert(dto);
		obj.delete(21);
		obj.update("son", 26);
		obj.select();
	}

}
