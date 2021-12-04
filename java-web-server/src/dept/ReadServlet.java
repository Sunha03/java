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
		request.setCharacterEncoding("euc-kr");		//���ڵ�(post ��Ŀ����� �����)
		response.setContentType("text/html;charset=euc-kr");
		String info = request.getParameter("info");
		System.out.println("�ѱ��������� : " + info);
		
		//1. ��û�������� - Ŭ���̾�Ʈ�� ���� �� �±׿� �Է��� ������ �ʿ信 ���� �ѱ� �Ķ���� ����
		String deptNo = request.getParameter("deptNo");
		
		//2. �����Ͻ� �޼ҵ� ȣ�� - DeptDAO Ŭ������ �޼ҵ� �߰� & ȣ��
		DeptDAOImpl daoImpl = new DeptDAOImpl();
		DeptDTO dept = daoImpl.readDept(deptNo);
		
		request.setAttribute("dept", dept);
		RequestDispatcher rd = request.getRequestDispatcher("/dept/dept_read.jsp");
		rd.forward(request, response);
	}

}
