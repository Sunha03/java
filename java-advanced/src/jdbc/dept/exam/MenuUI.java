package jdbc.dept.exam;

import java.time.Instant;
import java.util.*;
import java.util.Date;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	DeptDAO mdao = new DeptDAOImpl();
	public void insertMenu(){
		System.out.println("*******�μ����********");
		System.out.print("�μ� ��ȣ :");
		int deptno = key.nextInt();
		System.out.print("�μ� �̸� :");
		String dname = key.next();
		System.out.print("���� �ڵ� :");
		String loc_code = key.next();
		
		//���⿡�� MemberDTO�� �޼ҵ带 ȣ���ϼ���
		DeptDTO dept = new DeptDTO(deptno, dname, loc_code);
		int res = mdao.insert(dept);
		if(res > 0)
			System.out.println("INSERT success!");
		else
			System.out.println("INSERT fail!");
	}
	public void updateMenu(){
		System.out.println("*******�μ�����********");
		System.out.print("������ �μ� ��ȣ :");
		int deptno = key.nextInt();
		System.out.print("�μ� �̸� :");
		String dname = key.next();
		System.out.print("���� �ڵ� :");
		String loc_code = key.next();
		
		//���⿡�� MemberDTO�� �޼ҵ带 ȣ���ϼ���
		DeptDTO dept = new DeptDTO(deptno, dname, loc_code);
		int res = mdao.update(dept);
		if(res > 0)
			System.out.println("UPDATE success!");
		else
			System.out.println("UPDATE fail!");
	}
	public void deleteMenu(){
		System.out.println("*******�μ�����********");
		System.out.print("������ �μ� ��ȣ :");
		int deptno = key.nextInt();
		
		//���⿡�� MemberDTO�� �޼ҵ带 ȣ���ϼ���
		int res = mdao.delete(deptno);
		if(res > 0)
			System.out.println("DELETE success!");
		else
			System.out.println("DELETE fail!");
	}
	
	public void getDeptInfoMenu() {
		System.out.println("*******�μ�������ȸ********");
		System.out.print("��ȸ�� �μ� ��ȣ :");
		int deptno = key.nextInt();
		
		//���⿡�� MemberDTO�� �޼ҵ带 ȣ���ϼ���
		DeptDTO dept = mdao.getDeptInfo(deptno);
		if(dept != null)
			System.out.println("getDeptInfo success!");
		else
			System.out.println("getDeptInfo fail!");
	}
	
	public void getDeptListMenu(){
		System.out.println("*******��� �μ� ���********");
		
		ArrayList<DeptDTO> dept = mdao.getDeptList();
		if(dept != null)
			System.out.println("getDeptList success!");
		else
			System.out.println("getDeptList fail!");
	}
	
	
	public void getMemberListMenu(){
		System.out.println("*******�μ��� ��� ���********");
		System.out.print("��ȸ�� �μ� ��ȣ :");
		int deptno = key.nextInt();
		
		ArrayList<EmpDTO> emp = mdao.getMemberList(deptno);
		if(emp != null)
			System.out.println("getMemberList success!");
		else
			System.out.println("getMemberList fail!");
	}
}