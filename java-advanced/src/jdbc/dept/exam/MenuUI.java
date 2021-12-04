package jdbc.dept.exam;

import java.time.Instant;
import java.util.*;
import java.util.Date;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	DeptDAO mdao = new DeptDAOImpl();
	public void insertMenu(){
		System.out.println("*******부서등록********");
		System.out.print("부서 번호 :");
		int deptno = key.nextInt();
		System.out.print("부서 이름 :");
		String dname = key.next();
		System.out.print("지역 코드 :");
		String loc_code = key.next();
		
		//여기에서 MemberDTO의 메소드를 호출하세요
		DeptDTO dept = new DeptDTO(deptno, dname, loc_code);
		int res = mdao.insert(dept);
		if(res > 0)
			System.out.println("INSERT success!");
		else
			System.out.println("INSERT fail!");
	}
	public void updateMenu(){
		System.out.println("*******부서수정********");
		System.out.print("수정할 부서 번호 :");
		int deptno = key.nextInt();
		System.out.print("부서 이름 :");
		String dname = key.next();
		System.out.print("지역 코드 :");
		String loc_code = key.next();
		
		//여기에서 MemberDTO의 메소드를 호출하세요
		DeptDTO dept = new DeptDTO(deptno, dname, loc_code);
		int res = mdao.update(dept);
		if(res > 0)
			System.out.println("UPDATE success!");
		else
			System.out.println("UPDATE fail!");
	}
	public void deleteMenu(){
		System.out.println("*******부서삭제********");
		System.out.print("삭제할 부서 번호 :");
		int deptno = key.nextInt();
		
		//여기에서 MemberDTO의 메소드를 호출하세요
		int res = mdao.delete(deptno);
		if(res > 0)
			System.out.println("DELETE success!");
		else
			System.out.println("DELETE fail!");
	}
	
	public void getDeptInfoMenu() {
		System.out.println("*******부서정보조회********");
		System.out.print("조회할 부서 번호 :");
		int deptno = key.nextInt();
		
		//여기에서 MemberDTO의 메소드를 호출하세요
		DeptDTO dept = mdao.getDeptInfo(deptno);
		if(dept != null)
			System.out.println("getDeptInfo success!");
		else
			System.out.println("getDeptInfo fail!");
	}
	
	public void getDeptListMenu(){
		System.out.println("*******모든 부서 목록********");
		
		ArrayList<DeptDTO> dept = mdao.getDeptList();
		if(dept != null)
			System.out.println("getDeptList success!");
		else
			System.out.println("getDeptList fail!");
	}
	
	
	public void getMemberListMenu(){
		System.out.println("*******부서별 사원 목록********");
		System.out.print("조회할 부서 번호 :");
		int deptno = key.nextInt();
		
		ArrayList<EmpDTO> emp = mdao.getMemberList(deptno);
		if(emp != null)
			System.out.println("getMemberList success!");
		else
			System.out.println("getMemberList fail!");
	}
}