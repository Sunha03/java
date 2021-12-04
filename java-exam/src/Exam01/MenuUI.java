package Exam01;

import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO customer = new CustomerDAO();
	public void insertMenu(){
		System.out.println("*******�����********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		
		//���⿡�� MemberDTO�� �޼ҵ带 ȣ���ϼ���
		CustomerDTO cust = new CustomerDTO(id, pass, name, addr);
		int res = customer.insert(cust);
		if(res > 0)
			System.out.println("INSERT success!");
		else
			System.out.println("INSERT fail!");
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		
		//���⿡�� MemberDTO�� �޼ҵ带 ȣ���ϼ���
		int res = customer.update(id, addr);
		if(res > 0)
			System.out.println("UPDATE success!");
		else
			System.out.println("UPDATE fail!");
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		
		//���⿡�� MemberDTO�� �޼ҵ带 ȣ���ϼ���
		int res = customer.delete(id);
		if(res > 0)
			System.out.println("DELETE success!");
		else
			System.out.println("DELETE fail!");
	}

}
