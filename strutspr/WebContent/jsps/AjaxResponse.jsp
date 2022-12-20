<%
String res=(String)request.getAttribute("check");
if(res.equals("exist"))
out.println(res);
%>