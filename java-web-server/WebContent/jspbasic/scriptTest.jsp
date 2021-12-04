<%@page import="javax.xml.crypto.Data"%>
<%@page import="dept.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    import="java.util.Random, java.util.ArrayList, java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h2>1. 스크립트릿 : 자바 코드 정의 가능</h2>
	<!-- html주석 > 클라이언트에 전송 (O) -->
	<%-- JSP 주석 > 클라이언트에 전송 (X) --%>
	<%
		// java 주석 > 클라이언트에 전송 (X)
		/* java 주석 > 클라이언트에 전송(X)
		*/
		String str = new String("java");
		out.print("<h3>문자열 길이 : " + str.length() + "</h3>");
		Random rand = null;
		ArrayList list = null;
		DeptDTO dept = null;
	%>
	<h2>중간 작업</h2>
	<%
		int num = 100;
	%>
	<h2>2. 선언문</h2>
	<!-- 이렇게 안씀 -->
	<%! int num = 10000; %>
	<%! public void test() {
			System.out.println("test");
	} %>
	<h2>3. 표현식</h2>
	<h4><%= 10000 %></h4>
	<h4><%= 10.5 %></h4>
	<h4><%= "문자열의 길이 : " + str.length() %></h4>
	<h4><%= new Date().toString() %></h4>
	<h4><%= 100/3 %></h4>
	<h4><%= str.charAt(0) %></h4>
</body>
</html>