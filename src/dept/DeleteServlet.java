package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "delete", urlPatterns = { "/dept/delete.do" })
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");			//한글 인코딩
		response.setContentType("text/html;charset=euc-kr");
		
		//1. 요청 정보 추출
		String deptNo = request.getParameter("deptno");
		
		//2. 비즈니스 메소드 호출
		DeptDAOImpl daoImpl = new DeptDAOImpl();
		int result = daoImpl.delete(deptNo);
		
		//3. 요청 재지정
		response.sendRedirect("/serverweb/dept/list.do");
		
		PrintWriter pw = response.getWriter();
		
		if(result > 0)
			System.out.println("DELETE success!");
		else if(result == 0)
			System.out.println("DELETE fail..");
	}
}
