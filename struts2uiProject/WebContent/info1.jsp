<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><html>
<head>
<title>Struts2 UI Tags</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" href="mystyle.css" type="text/css" />
</head>
<body>
<h2>Welcome! <s:property value="username" /></h2>
<table cellspacing="5" bgcolor="#fdf5ea">
<tr>
<td colspan="2" bgcolor="#fbefd9" height="25" align="center">Login Details</td>
</tr>
<tr>
<td>User Name</td>
<td><s:property value="username"/></td>
</tr>
<tr>
<td>Password</td>
<td><s:property value="password"/></td>
</tr>
<tr>
<td colspan="2" height="25" bgcolor="#fbefd9" align="center">Personal Details</td>
</tr>
<tr>
<td bgcolor="#fbefd9" height="25">Name</td>
<td><s:property value="fullname"/></td>
</tr>
<tr>
<td bgcolor="#fbefd9" height="25">Date of Birth</td>
<td><s:property value="dob"/></td>
</tr>
<tr>
<td bgcolor="#fbefd9" >Address</td>
<td>
<s:property value="address" /><br>
<s:property value="city" />, <s:property value="country" />
</td>
</tr>
<tr>
<td bgcolor="#fbefd9" height="25">Language(s)</td>
<td><s:property value="language" /></td>
</tr>
<tr>
<td bgcolor="#fbefd9" height="25">Marital Status</td>
<td><s:property value="mstatus" /></td>
</tr>
<tr>
<td bgcolor="#fbefd9" height="25">Skills</td>
<td><s:property value="skill" /></td>
</tr>
</table>  
<s:a href="index.jsp">Back</s:a>
</body>
</html>
