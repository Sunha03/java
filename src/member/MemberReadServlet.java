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
		request.setCharacterEncoding("euc-kr");		//인코딩
		response.setContentType("text/html;charset=euc-kr");
		
		//1. 요청정보추출 - 클라이언트가 직접 폼 태그에 입력한 데이터 필요에 의해 넘긴 파라미터 추출
		String id = request.getParameter("id");
		
		//2. 비지니스 메소드 호출 - DeptDAO 클래스에 메소드 추가 & 호출
		MemberDAO dao = new MemberDAO();
		MemberDTO member = dao.readMember(id);
		
		request.setAttribute("member", member);
		RequestDispatcher rd = request.getRequestDispatcher("/member/member_read.jsp");
		rd.forward(request, response);
	}
}
