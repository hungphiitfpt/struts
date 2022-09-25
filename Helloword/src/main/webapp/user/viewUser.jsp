<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE struts-config PUBLIC 
"-//Apache Software Foundation//DTD Struts Configuration 1.3//EN" 
"http://jakarta.apache.org/struts/dtds/struts-config_1_3.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <bean:write name="u" property="id"/>
<bean:write name="u" property="name" />
<bean:write name="u" property="age" format="#####" /> --%>

<bean:write name="us" property="id"/>
<bean:write name="us" property="name" />
<bean:write name="us" property="age" format="#####" />
</body>
</html>