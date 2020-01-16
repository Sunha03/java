package dept;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "deptinsert", urlPatterns = { "/deptinsert.do" })
public class DeptServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doPost 실행");
		
		request.setCharacterEncoding("EUC-KR");		//한글 인코딩
		response.setContentType("text/html;charset=euc-kr");
		
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		
		System.out.println("부서 번호 : " + deptNo + ", 부서명 : " + deptName + ", 위치 : " + loc + ", 전화번호 : " + tel + ", 관리자 : " + mgr);
		
		DeptDTO dept = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		
		DeptDAOImpl daoImpl = new DeptDAOImpl();
		int result = daoImpl.insert(dept);
		
		if(result == 1)
			System.out.println("INSERT success!");
		else if(result == 0)
			System.out.println("INSERT fail..");
	}

}
