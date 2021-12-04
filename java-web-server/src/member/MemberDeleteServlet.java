package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.DeptDAOImpl;

@WebServlet(description = "memDel", urlPatterns = { "/member/delete.do" })
public class MemberDeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");			//�ѱ� ���ڵ�
		response.setContentType("text/html;charset=euc-kr");
		
		//1. ��û ���� ����
		String id = request.getParameter("id");
		
		//2. ����Ͻ� �޼ҵ� ȣ��
		MemberDAO dao = new MemberDAO();
		int result = dao.delete(id);
		
		//3. ��û ������
		response.sendRedirect("/serverweb/member/list.do");
		
		if(result > 0)
			System.out.println("DELETE success!");
		else if(result == 0)
			System.out.println("DELETE fail..");
	}
}
