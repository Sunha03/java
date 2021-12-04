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

@WebServlet(description = "memberInsert", urlPatterns = { "/member/insert.do" })
public class MemberInsertServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");		//한글 인코딩
		response.setContentType("text/html;charset=euc-kr");
		
		String deptno = request.getParameter("deptno");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String addr = request.getParameter("addr");
		int point = Integer.parseInt(request.getParameter("point"));
		String grade = request.getParameter("grade");
				
		MemberDTO member= new MemberDTO(deptno, name, id, pass, addr, grade, point);
		
		MemberDAO dao = new MemberDAO();
		int result = dao.insert(member);
		
		request.setAttribute("insertResult", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("/member/insertResult.jsp");
		rd.forward(request, response);
	}

}
