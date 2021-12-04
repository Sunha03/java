package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mypost02", urlPatterns = { "/mypost02.do" })
public class PostFormServlet02 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");		//한글 인코딩
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter pw = response.getWriter();		//(일반적인)출력 스트림 받기
		
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] item = request.getParameterValues("item");
		
		//응답 내용 생성
		pw.print("<html>");
		pw.print("<head>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<h1> 고객 정보 </h1>");
		pw.print("<h3> 아이디 : " + userId + "</h3>");
		pw.print("<h3> 이름 : " + userName + "</h3>");
		pw.print("<h3> Favorite </h3>");
		for(String data : item)
			pw.print(data + " ");
		pw.print("</body>");
		pw.print("</html>");
	}
}
