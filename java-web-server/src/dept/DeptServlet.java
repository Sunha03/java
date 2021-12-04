package dept;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "deptinsert", urlPatterns = { "/deptinsert.do" })
public class DeptServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doPost ����");
		
		request.setCharacterEncoding("EUC-KR");		//�ѱ� ���ڵ�
		response.setContentType("text/html;charset=euc-kr");
		
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		
		System.out.println("�μ� ��ȣ : " + deptNo + ", �μ��� : " + deptName + ", ��ġ : " + loc + ", ��ȭ��ȣ : " + tel + ", ������ : " + mgr);
		
		DeptDTO dept = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		
		DeptDAOImpl daoImpl = new DeptDAOImpl();
		int result = daoImpl.insert(dept);
		
		/*if(result == 1)
			System.out.println("INSERT success!");
		else if(result == 0)
			System.out.println("INSERT fail..");*/
		
		//����ȭ������ ��û ������
		//response.sendRedirect("/serverweb/dept/insertResult.html");
		
		//3. ������ ����
		request.setAttribute("insertResult", result);
		
		//4. ����ȭ������ ��û ������
		RequestDispatcher rd = request.getRequestDispatcher("/dept/insertResult.jsp");
		rd.forward(request, response);
		
	}

}
