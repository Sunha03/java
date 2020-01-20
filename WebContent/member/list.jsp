<%@page import="member.MemberDTO"%>
<%@page import="dept.DeptDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<MemberDTO> memList = (ArrayList<MemberDTO>)request.getAttribute("memberList");
		int size = memList.size();
	%>
	
	<table border="1">
		<tr>
			<th>부서 코드</th>
			<th>성명</th>
			<th>사번</th>
			<th>패스워드</th>
			<th>주소</th>
			<th>포인트</th>
			<th>주소</th>
		</tr>
		<%
			for(int i=0;i<memList.size();i++) {
		%>
		<tr>
			<td><%= memList.get(i).getDeptno() %></td>
			<td><%= memList.get(i).getName() %></td>
			<td><a href="/serverweb/member/read.do?id=<%=memList.get(i).getId()%>"><%= memList.get(i).getId() %></td>
			<td><%= memList.get(i).getPass() %></td>
			<td><%= memList.get(i).getAddr() %></td>
			<td><%= memList.get(i).getPoint() %></td>
			<td><%= memList.get(i).getAddr() %></td>
			<td><a href="/serverweb/member/delete.do?id=<%=memList.get(i).getId()%>">삭제</td>
		</tr>
		<% } %>
	</table>
	
</body>
</html>