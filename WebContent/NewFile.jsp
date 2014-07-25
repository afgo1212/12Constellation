<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="te
xt/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.print("<html><body><form action = \"Constellation_content\" method=\"Get\">");
		out.print("月：<input type = text name = m></br>");
		out.print("日：<input type = text name = d></br>");
		out.print("<input type = submit value = 送出>");
		out.print("</form></body></html>");
%>
</body>
</html>