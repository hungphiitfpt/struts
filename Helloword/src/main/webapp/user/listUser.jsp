<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<logic:empty name="userList">
		không có người dùng nào hết
	</logic:empty>
	
	<logic:notEmpty name="userList">
		<table>
			<tr>
				<th>id</th>
				<th>Tên</th>
				<th>Tuôi</th>
			</tr>
			<logic:iterate id="user"name="userList">
					<tr>
						<td><bean:write name="u" property="id"/></td>
						<td><bean:write name="u" property="age"/></td>
						<td><bean:write name="u" property="name"/></td>
						<td>
						 
						<html:link page="/edit-userhtml" " paramName="id" ></html:link></td>
						<html:link page="/delete-userhtml" " paramName="id" ></html:link></td>
						<html:link page=views-userhtml" " paramName="id" ></html:link></td>
					</tr>
			</logic:iterate>
		</table>
	</logic:notEmpty>
</body>
</html>