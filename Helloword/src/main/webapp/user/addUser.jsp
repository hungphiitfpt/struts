<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/Helloword/view-user.do" method="post">
		<p>Tên</p> <input name="name" type="text" />
		<p>Tuổi</p> <input name="age" type="number" />
		
		<input value="Thêm" type="submit">
	</form>
	
	<html:form action="/view-user.do" method="post">
		<p>Tên</p>
		<html:text property="name" name="user"></html:text>
		<p>Tuổi</p>
		<html:text property="age" name="user"></html:text>
		<html:submit>Thêm người dùng</html:submit>
	</html:form>
</body>
</html>