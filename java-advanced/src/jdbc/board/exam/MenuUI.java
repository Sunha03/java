package jdbc.board.exam;

import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new boardDAOImpl();
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
	
		
		//���⿡�� boardDAO�� �޼ҵ带 ȣ���ϼ���
		BoardDTO dto = new BoardDTO(id, title, content);
		int result = dao.insert(dto);
		//��� ó��
		if(result > 0) {
			System.out.println("�Խù� ��� ����!");
		}
		else {
			System.out.println("�Խù� ��� ����..");
		}
	}
	public void updateMenu(){
		System.out.println("*******�Խñۼ���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�Խñ۹�ȣ:");
		int boardNum = key.nextInt();
		
		//���⿡�� boardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(id,  boardNum);
		//��� ó��
		if(result > 0) {
			System.out.println("�Խù� ���� ����!");
		}
		else {
			System.out.println("�Խù� ���� ����..");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("�Խñ۹�ȣ:");
		int boardNum = key.nextInt();
		//���⿡�� boardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(boardNum);
		//��� ó��
		if(result > 0) {
			System.out.println("�Խù� ���� ����!");
		}
		else {
			System.out.println("�Խù� ���� ����..");
		}
	}
	public void searchMenu(){
		System.out.println("*******�Խñ۰˻�********");
		System.out.print("����:");
		String title = key.next();
		//���⿡�� boardDAO�� �޼ҵ带 ȣ���ϼ���
		
	}
	
	
	public void selectMenu(){
		System.out.println("*******�Խñ���ȸ********");
		//���⿡�� boardDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		dao.select();
		//��� ó��
		/*if(result > 0) {
			System.out.println("�Խù� ��ȸ ����!");
		}
		else {
			System.out.println("�Խù� ��ȸ ����..");
		}*/
	}
}


















