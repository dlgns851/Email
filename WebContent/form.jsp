<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>메일 리스트 가입</h3>

메일 리스트에 가입하려면,
아래 항목을 기입하고 submit 버튼을 클릭하세요


<form action="insert.jsp">


last name(성):<input type="text" name="lastName"> <br>
first name(이름):<input type="text" name="firstName"><br>
email address:<input type="text" name="email"><br>
<input type="submit" value="등록">

</form>
</body>
</html>