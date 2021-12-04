package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");		//한글 인코딩
		response.setContentType("text/html;charset=euc-kr");
		
		//1. 요청 정보 추출
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String method = request.getParameter("method");
		
		PrintWriter pw = response.getWriter();
		
		/*//2. 비지니스 로직
		double result = 0;
		switch(method) {
			case "+" :
				result = (int)(num1 + num2);
				break;
			case "-" :
				result = (int)(num1 - num2);
				break;
			case "*" :
				result = (int)(num1 * num2);
				break;
			case "/" :
				result = ((double)num1 / num2);
				break;
		}*/
		
		//2. 비지니스 메소드 호출
		CalcLogic logic = new CalcLogic();
		int result = logic.calc(num1,  method,  num2);
		
		System.out.println(num1 + " " + method + " " + num2 + " = " + result);
		
		pw.print("<html>");
		pw.print("<body>");
		pw.print("결과 : num1의 " + num1 + "과 num2의 " + num2 + "을 연산한 결과는 " + result + "입니다.");
		pw.print("</body>");
		pw.print("</html>");
	}
}
