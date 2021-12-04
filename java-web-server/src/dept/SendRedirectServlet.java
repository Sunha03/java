package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doPost ����");
		
		request.setCharacterEncoding("EUC-KR");		//�ѱ� ���ڵ�
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>sendRedirectȭ��</h1>");
		
		
		//1. ������ �����ϱ�
		DeptDTO dept = new DeptDTO("001", "IT�μ�", "", "", "");
		request.setAttribute("mydata", dept);
		System.out.println("SendRedirectServlet ���� �Ϸ�");
		
		//2. ��û ������ - sendRedirect
		response.sendRedirect("/serverweb/jspbasic/subPage.jsp");
	}

}
