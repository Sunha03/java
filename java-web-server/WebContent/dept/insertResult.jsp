<%@page import="dept.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h1>응답 페이지</h1>
	<%
		int result = (int)request.getAttribute("insertResult");
	%>
	<h2><%= result %>개 행 삽입 성공!!!!!!!!</h2>
</body>
</html>