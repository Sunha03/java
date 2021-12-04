package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");		//�ѱ� ���ڵ�
		response.setContentType("text/html;charset=euc-kr");
		
		DeptDAOImpl daoImpl = new DeptDAOImpl();
		ArrayList<DeptDTO> deptList = new ArrayList<DeptDTO>();
		deptList = daoImpl.getDeptList();
		
		request.setAttribute("deptList", deptList);
		RequestDispatcher rd = request.getRequestDispatcher("/dept/list.jsp");
		rd.forward(request, response);
		
		//PrintWriter pw = response.getWriter();
		
		/*pw.print("<table>");
		pw.print("<tr>");
		pw.print("<th>�μ� ��ȣ</th>");
		pw.print("<th>�μ� �̸�</th>");
		pw.print("<th>�μ� ��ġ</th>");
		pw.print("<th>��ȭ ��ȣ</th>");
		pw.print("<th>�����</th>");
		pw.print("</tr>");
		for(int i=0;i<deptList.size();i++) {
			pw.print("<tr>");
			pw.print("<td>" + deptList.get(i).getDeptNo() + "</td>");
			pw.print("<td>" + deptList.get(i).getDeptName() + "</td>");
			pw.print("<td>" + deptList.get(i).getLoc() + "</td>");
			pw.print("<td>" + deptList.get(i).getTel() + "</td>");
			pw.print("<td>" + deptList.get(i).getMgr() + "</td><br/>");
			pw.print("</tr>");
		}
		pw.print("</table>");*/
		
		
		//pw.print(deptList);
		/*pw.print("<h1>�μ� ��� ����</h1>");
		pw.print("<hr/>");
		pw.print("<table border='1' width='500px'");
		pw.print("<tr>");
		pw.print("<th>�μ� ��ȣ</th><th>�μ� �̸�</th><th>�μ� ��ġ</th>");
		pw.print("<th>��ȭ ��ȣ</th><th>�����</th><th>����</th>");
		pw.print("</tr>");
		for(int i=0;i<deptList.size();i++) {
			pw.print("<tr>");
			pw.print("<td>" + deptList.get(i).getDeptNo() + "</td>");
			pw.print("<td>" + deptList.get(i).getDeptName() + "</td>");
			pw.print("<td>" + deptList.get(i).getLoc() + "</td>");
			pw.print("<td>" + deptList.get(i).getTel() + "</td>");
			pw.print("<td>" + deptList.get(i).getMgr() + "</td>");
			pw.print("<td><a href='/serverweb/dept/delete.do?deptno="
					+ deptList.get(i).getDeptNo() +"&info=test'>����</a></td>");
			pw.print("</tr>");
		}
		pw.print("</table>");*/
	}
}
