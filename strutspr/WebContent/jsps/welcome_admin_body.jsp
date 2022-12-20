<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
	</head>
  <body>
  <div style="margin: 0pt; padding: 0pt; position: absolute;top:140px;left:2px;">
    
    Welcome:
   <font style="font-size: 15px;" color="pink">
    <s:property value="#session.name"/>
    </font> | <font color="blue"><a href="homeDispatch">SignOut</a></font>
 
 </div>
 <br>
    </body>
    
  <jsp:include page="../htmls/admin_body.html"/>
  
</html>
