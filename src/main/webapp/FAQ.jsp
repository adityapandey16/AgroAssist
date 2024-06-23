<%@page import="community.model.community"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >

<form action="CommunityServletController" method="get">
	
		<table border="2" align="center" bgcolor="gray">
			<h1  align="center">Frequently Asked Questions</h1>
			<tr>
				<td>Question Id:</td>
				<td><input type="number" name="questionId">
				<td>Question</td>
				<td><input type="text" name="question"></td>
			</tr>
			<tr>
				<td>Answer Id:</td>
				<td><input type="number" name="AnswerId">
				<td>Answer</td>
				<td><input type="text" name="Answer"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
		</table>
	</form>

	<%!
		
	community c = null;
			
		%>

	<%
	if (!session.isNew()) {
		c = (community) session.getAttribute("communityData");
		
	%>

	<h1>Community</h1>
	<table>

		<tr>
			<td><%=c.getQuestion()%></td>
		</tr>
		<tr>
			<td><%=c.getAnswer()%></td>
		</tr>
	</table>
	<%
		}
		%>

</body>
</html>
