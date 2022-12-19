<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <s:head />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>

	<s:form action="login">
	<s:textfield name="uname" label="User Name"/>
	<s:password name="pass" label="User Pass "/>
	<s:submit value="login"/>
	</s:form>
    </body>
</html>