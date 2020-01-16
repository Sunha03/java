package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");		//한글 인코딩
		response.setContentType("text/html;charset=euc-kr");
		
		DeptDAOImpl daoImpl = new DeptDAOImpl();
		ArrayList<DeptDTO> deptList = new ArrayList<DeptDTO>();
		deptList = daoImpl.getDeptList();
		
		PrintWriter pw = response.getWriter();
		
		/*pw.print("<table>");
		pw.print("<tr>");
		pw.print("<th>부서 번호</th>");
		pw.print("<th>부서 이름</th>");
		pw.print("<th>부서 위치</th>");
		pw.print("<th>전화 번호</th>");
		pw.print("<th>담당자</th>");
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
		pw.print("<h1>부서 목록 보기</h1>");
		pw.print("<hr/>");
		pw.print("<table border='1' width='500px'");
		pw.print("<tr>");
		pw.print("<th>부서 번호</th><th>부서 이름</th><th>부서 위치</th>");
		pw.print("<th>전화 번호</th><th>담당자</th><th>삭제</th>");
		pw.print("</tr>");
		for(int i=0;i<deptList.size();i++) {
			pw.print("<tr>");
			pw.print("<td>" + deptList.get(i).getDeptNo() + "</td>");
			pw.print("<td>" + deptList.get(i).getDeptName() + "</td>");
			pw.print("<td>" + deptList.get(i).getLoc() + "</td>");
			pw.print("<td>" + deptList.get(i).getTel() + "</td>");
			pw.print("<td>" + deptList.get(i).getMgr() + "</td>");
			pw.print("<td><a href='/serverweb/dept/delete.do?deptno="
					+ deptList.get(i).getDeptNo() +"&info=test'>삭제</a></td>");
			pw.print("</tr>");
		}
		pw.print("</table>");
	}
}
