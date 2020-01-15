package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException {
		//1. 요청 정보 추출
		req.setCharacterEncoding("euc-kr");			//한글 인코딩
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String[] method = req.getParameterValues("method");
		
		switch(method[0]) {
			case "+" :
				System.out.println(num1 + " " + method[0] + " " + num2 + " = " + (int)(num1 + num2));
				break;
			case "-" :
				System.out.println(num1 + " " + method[0] + " " + num2 + " = " + (int)(num1 - num2));
				break;
			case "*" :
				System.out.println(num1 + " " + method[0] + " " + num2 + " = " + (int)(num1 * num2));
				break;
			case "/" :
				System.out.println(num1 + " " + method[0] + " " + num2 + " = " + ((double)num1 / num2));
				break;
		}
	}
}
