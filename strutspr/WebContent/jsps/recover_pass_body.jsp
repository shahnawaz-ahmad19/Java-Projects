<%@ taglib uri="/struts-tags" prefix="s"%>

<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <body>
    <br><br><br><br><br><br><br>
    <% 
    String msg=(String)request.getAttribute("pass");
    if(msg.equals("no"))
    {
    %>
    
    <center>
    <form style="width: 1300">
    <font size="4" color="red">
                  Sorry , No record is found on the given details.
    <br>
    <a href="forgotDispatch">Try again</a>
   
    </font>
    </form>
    </center>
    <%
    }
    else
    {
    %>
    <div style="margin-left:320px;">
    <font size="5" color="green">
    <s:property value="#request.pass"/>.
    </font>
	</div>
    <jsp:include page="../jsps/login_body.jsp"/>
<%}
%>

  </body>
</html>
