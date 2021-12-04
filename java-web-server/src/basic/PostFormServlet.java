package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");			//한글 인코딩
		
		String id = req.getParameter("userId");
		String name = req.getParameter("userName");
		String pass = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] item = req.getParameterValues("item");
	
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("패스워드 : " + pass);
		System.out.println("성별 : " + gender);
		System.out.println("직업 : " + job);
		
		System.out.print("Favorites : ");
		for(int i=0;i<item.length;i++)
			System.out.print(item[i] + " ");

	}
}
