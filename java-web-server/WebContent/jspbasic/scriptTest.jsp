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
	<h2>1. ��ũ��Ʈ�� : �ڹ� �ڵ� ���� ����</h2>
	<!-- html�ּ� > Ŭ���̾�Ʈ�� ���� (O) -->
	<%-- JSP �ּ� > Ŭ���̾�Ʈ�� ���� (X) --%>
	<%
		// java �ּ� > Ŭ���̾�Ʈ�� ���� (X)
		/* java �ּ� > Ŭ���̾�Ʈ�� ����(X)
		*/
		String str = new String("java");
		out.print("<h3>���ڿ� ���� : " + str.length() + "</h3>");
		Random rand = null;
		ArrayList list = null;
		DeptDTO dept = null;
	%>
	<h2>�߰� �۾�</h2>
	<%
		int num = 100;
	%>
	<h2>2. ����</h2>
	<!-- �̷��� �Ⱦ� -->
	<%! int num = 10000; %>
	<%! public void test() {
			System.out.println("test");
	} %>
	<h2>3. ǥ����</h2>
	<h4><%= 10000 %></h4>
	<h4><%= 10.5 %></h4>
	<h4><%= "���ڿ��� ���� : " + str.length() %></h4>
	<h4><%= new Date().toString() %></h4>
	<h4><%= 100/3 %></h4>
	<h4><%= str.charAt(0) %></h4>
</body>
</html>