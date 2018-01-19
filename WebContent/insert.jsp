<%@page import="javax.websocket.SendResult"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="com.javaex.dao.EmaillistDao" %>
    <%@ page import="EmaillistVo.EmaillistVo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

request.setCharacterEncoding("utf-8");
String lastName = request.getParameter("lastName");
String firstName = request.getParameter("firstName");
String email = request.getParameter("email");

EmaillistVo vo = new EmaillistVo(1, lastName, firstName, email);
EmaillistDao dao = new EmaillistDao();
dao.insert(vo);

response.sendRedirect("list.jsp");
%>
</body>
</html>