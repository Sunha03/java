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
		request.setCharacterEncoding("EUC-KR");		//�ѱ� ���ڵ�
		response.setContentType("text/html;charset=euc-kr");
		
		//1. ��û ���� ����
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String method = request.getParameter("method");
		
		PrintWriter pw = response.getWriter();
		
		/*//2. �����Ͻ� ����
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
		
		//2. �����Ͻ� �޼ҵ� ȣ��
		CalcLogic logic = new CalcLogic();
		int result = logic.calc(num1,  method,  num2);
		
		System.out.println(num1 + " " + method + " " + num2 + " = " + result);
		
		pw.print("<html>");
		pw.print("<body>");
		pw.print("��� : num1�� " + num1 + "�� num2�� " + num2 + "�� ������ ����� " + result + "�Դϴ�.");
		pw.print("</body>");
		pw.print("</html>");
	}
}
