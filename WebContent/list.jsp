<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.javaex.dao.EmaillistDao" %>
    <%@ page import="EmaillistVo.EmaillistVo" %>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>메일 리스트에 가입되었습니다</h3>

<%EmaillistDao dao = new EmaillistDao();
 List<EmaillistVo> voL = new ArrayList<EmaillistVo>();
 
 voL=dao.getListAll();
 
 for(EmaillistVo vo :voL ){
 	
	//out.print(vo.getLastName()+vo.getFirstname()+vo.getEmail()+"<br>");
	
 
%>

<table border=1>
<tr>
<td>last name</td>
<td><%=vo.getLastName() %></td>
</tr>
<tr>
<td>first name</td>
<td><%=vo.getFirstname() %></td>
</tr>
<tr>
<td>email address</td>
<td><%=vo.getEmail() %></td>
</tr>


</table>
<%} %>

<a href="form.jsp">입력 바로가기</a>


</body>
</html>