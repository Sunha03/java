package dept;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "deptread", urlPatterns = { "/dept/read.do" })
public class ReadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");		//인코딩(post 방식에서만 적용됨)
		response.setContentType("text/html;charset=euc-kr");
		String info = request.getParameter("info");
		System.out.println("한글정보추출 : " + info);
		
		//1. 요청정보추출 - 클라이언트가 직접 폼 태그에 입력한 데이터 필요에 의해 넘긴 파라미터 추출
		String deptNo = request.getParameter("deptNo");
		
		//2. 비지니스 메소드 호출 - DeptDAO 클래스에 메소드 추가 & 호출
		DeptDAOImpl daoImpl = new DeptDAOImpl();
		DeptDTO dept = daoImpl.readDept(deptNo);
		
		request.setAttribute("dept", dept);
		RequestDispatcher rd = request.getRequestDispatcher("/dept/dept_read.jsp");
		rd.forward(request, response);
	}

}
