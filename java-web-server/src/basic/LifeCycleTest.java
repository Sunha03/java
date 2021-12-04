package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTest extends HttpServlet {
	public LifeCycleTest() {
		System.out.println("서블릿 객체 생성...");
	}
	
	public void init() {
		System.out.println("서블릿 객체의 초기화 init()...");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		System.out.println("클라이언트의 요청 처리 service()???... " + req.getMethod());
		
		//부모의 service를 오버라이딩했기 때문에 부모 service의 doGet, doPost 없어짐
		//> doGet, doPost 호출 안됨
		if(req.getMethod().equals("GET")) {				//요청 방식이 Get > doGet 호출
			doGet(req, res);
		} else if(req.getMethod().equals("POST")) {		//요청 방식이 Post > doPost 호출
			doPost(req, res);
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("doGet()...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("doPost()...");
	}

	public void destroy() {
		System.out.println("서블릿 객체 소멸 destroy()...");
	}
}
