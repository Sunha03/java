package jdbc.member.exam;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO mdao = new MemberDAOImpl();
	public void insertMenu(){
		System.out.println("*******사원등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("부서번호:");
		String deptno = key.next();
		
		//여기에서 MemberDTO의 메소드를 호출하세요
		MemberDTO user = new MemberDTO(id, pass, name, addr, deptno);
		int res = mdao.insert(user);
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
		int res = mdao.update(id, addr);
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
		int res = mdao.delete(id);
		if(res > 0)
			System.out.println("DELETE success!");
		else
			System.out.println("DELETE fail!");
	}
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		
		//여기에서 MemberDTO의 메소드를 호출하세요
		
	}
	
	
	public void selectMenu(){
		System.out.println("*******사원조회********");
		
		//여기에서 MemberDTO의 메소드를 호출하세요 - 전체사원조회
		mdao.select();
	}
}


















