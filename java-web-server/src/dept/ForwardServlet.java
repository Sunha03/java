package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "forward", urlPatterns = { "/forward.do" })
public class ForwardServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doGet 실행");
		
		request.setCharacterEncoding("EUC-KR");		//한글 인코딩
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>Forward 화면</h1>");
		
		
		//1. 데이터 공유하기
		DeptDTO dept = new DeptDTO("001", "IT부서", "", "", "");
		request.setAttribute("mydata", dept);
		System.out.println("ForwardServlet 실행 완료");
		
		//2. 요청 재지정 - forward
		RequestDispatcher rd = request.getRequestDispatcher("/jspbasic/subPage.jsp");
		rd.forward(request, response);
	}

}
