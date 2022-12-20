<%
String s=request.getParameter("name");
System.out.println("---"+s);
application.setAttribute("check",s);
response.sendRedirect("check");
 %>