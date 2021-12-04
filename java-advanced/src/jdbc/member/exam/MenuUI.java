package jdbc.member.exam;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO mdao = new MemberDAOImpl();
	public void insertMenu(){
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		
		//���⿡�� MemberDTO�� �޼ҵ带 ȣ���ϼ���
		MemberDTO user = new MemberDTO(id, pass, name, addr, deptno);
		int res = mdao.insert(user);
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
		int res = mdao.update(id, addr);
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
		int res = mdao.delete(id);
		if(res > 0)
			System.out.println("DELETE success!");
		else
			System.out.println("DELETE fail!");
	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		
		//���⿡�� MemberDTO�� �޼ҵ带 ȣ���ϼ���
		
	}
	
	
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		
		//���⿡�� MemberDTO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		mdao.select();
	}
}


















