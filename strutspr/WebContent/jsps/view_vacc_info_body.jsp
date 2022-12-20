<%@ taglib uri="/struts-tags" prefix="s"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Untitled Page</title>
<meta name="generator" content="WYSIWYG Web Builder - http://www.wysiwygwebbuilder.com">
<style type="text/css">
body
{
   background-color: #E6E6FA;
   color: #000000;
}
</style>
</head>
<body>

<div style="margin: 0pt; padding: 0pt; position: absolute;top:140px;left:2px;">
    
   <b> Welcome:</b>
   <font style="font-size: 15px;" color="pink">
    <s:property value="#session.name"/>
    </font> | <font color="blue"><a href="homeDispatch">SignOut</a></font>
    </div>
<div id="wb_TextArt1" style="margin: 0pt; padding: 0pt; position: absolute; left: 1px; top: 176px; width: 189px; height: 38px; text-align: center; z-index: 1;">
<img src="images/img0008.png" id="TextArt1" alt="Member Zone" title="Member Zone" style="border-width: 0pt; width: 217px; height: 36px; left: 0px; top: 0px;"></div>

<div style="position:absolute;left:100px;top:220px;width:800px;height:300px;border:1px #C0C0C0 solid;background-color:#E3E4FA;font-family:Arial;font-size:13px;z-index:1;overflow:auto;scroll:auto;border-color: brown">
<s:property value="delete_vacc"/>
<table bordercolor="brown" cellspacing="0" border="" style="border-width:0.5px ">
<tr>
<td align="center" width="50" style="font-size:18px;"><b><font color="gray">Age</font></b></td>
<td align="center" width="100" style="font-size:18px;"><b><font color="gray">Vaccine</font></b></td>
<td align="center" width="600" style="font-size:18px;"><b><font color="gray">Description</font></b></td>
<td align="center" width="150" style="font-size:18px;"><b><font color="gray">Disease</font></b></td>
<td align="center" width="100" style="font-size:18px;"><b><font color="gray">Delete Info</font></b></td>

</tr>

<%
String data[]=new String[4];
ResultSet rs=(ResultSet)request.getAttribute("rs");
if(rs!=null)
{
 while(rs.next())
  {
 	 %>
    <tr>
<%      for(int col=1; col<5; col++) {
		 data[col-1]=rs.getString(col);
		 %>
        <td align="center"><font style="height:150px;font-size:12px" color=""><%=data[col-1]%></font></td>
        
        <% } 
        
        %>
        <td align="center"><font style="height:150px;font-size:12px" color=""><s:url action="deleteVacc" var="deleteLink">
  <s:param name="age"><%=data[0]%></s:param>
   <s:param name="vaccine"><%=data[1]%></s:param>
    <s:param name="description"><%=data[2]%></s:param>
    <s:param name="disease"><%=data[3]%></s:param>
</s:url>
<a href="${deleteLink}">Delete</a></font>

</td>
    </tr>
<% }

} %>
</table>
</div>
</body>




</html>