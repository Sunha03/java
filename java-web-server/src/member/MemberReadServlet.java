package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.DeptDAOImpl;
import dept.DeptDTO;

@WebServlet(description = "memRead", urlPatterns = { "/member/read.do" })
public class MemberReadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");		//���ڵ�
		response.setContentType("text/html;charset=euc-kr");
		
		//1. ��û�������� - Ŭ���̾�Ʈ�� ���� �� �±׿� �Է��� ������ �ʿ信 ���� �ѱ� �Ķ���� ����
		String id = request.getParameter("id");
		
		//2. �����Ͻ� �޼ҵ� ȣ�� - DeptDAO Ŭ������ �޼ҵ� �߰� & ȣ��
		MemberDAO dao = new MemberDAO();
		MemberDTO member = dao.readMember(id);
		
		request.setAttribute("member", member);
		RequestDispatcher rd = request.getRequestDispatcher("/member/member_read.jsp");
		rd.forward(request, response);
	}
}
