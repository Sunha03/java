package Exam01;

import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO customer = new CustomerDAO();
	public void insertMenu(){
		System.out.println("*******고객등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		
		//여기에서 MemberDTO의 메소드를 호출하세요
		CustomerDTO cust = new CustomerDTO(id, pass, name, addr);
		int res = customer.insert(cust);
		if(res > 0)
			System.out.println("INSERT success!");
		else
			System.out.println("INSERT fail!");
	}
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		
		//여기에서 MemberDTO의 메소드를 호출하세요
		int res = customer.update(id, addr);
		if(res > 0)
			System.out.println("UPDATE success!");
		else
			System.out.println("UPDATE fail!");
	}
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("아이디:");
		String id = key.next();
		
		//여기에서 MemberDTO의 메소드를 호출하세요
		int res = customer.delete(id);
		if(res > 0)
			System.out.println("DELETE success!");
		else
			System.out.println("DELETE fail!");
	}

}
