package jdbc.board.exam;

import java.util.Scanner;

public class boardDAOTest {

	public static void main(String[] args) {
		boardDAOImpl obj = new boardDAOImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================ �Խù� ȣ�� ================");
		System.out.print("ID�� �Է��ϼ��� : ");
		String id = sc.nextLine();
		System.out.print("Title�� �Է��ϼ��� : ");
		String title = sc.nextLine();
		System.out.print("Content�� �Է��ϼ��� : ");
		String content = sc.nextLine();
		
		BoardDTO dto = new BoardDTO(id, title, content);
		obj.insert(dto);
		obj.delete(21);
		obj.update("son", 26);
		obj.select();
	}

}
