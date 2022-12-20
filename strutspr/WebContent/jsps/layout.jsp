<!DOCTYPE html>
<%@ page import ="java.util.*" %>
<%@page session="true"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>

<%
response.setHeader( "Pragma", "no-cache" );// HTTP 1.0.
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
/* response.setDateHeader("Last-Modified", (new java.util.Date()));  // Proxies. */
response.setDateHeader("Expires", 0); //prevents caching at the proxy server  
%>
<!--      response.setDateHeader("Last-Modified", (new Date()).getTime() ); --> 

	<!--[if lt IE 9]>
	     <script src="../jQuery/html5shiv.js"></script>
	<![endif]-->

     <meta http-equiv="X-UA-Compatible" content="IE=Edge" />
 
     <meta http-equiv="Expires" content=<%= new java.util.Date() %>>
     <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
     <meta http-equiv="pragma" content="no-cache"> 
 
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
     <meta name="GENERATOR" content="Rational Software Architect for WebSphere Software">
     <title>Vaccination Scheduler</title>
     
     <META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
     <meta http-equiv="Cache-control" content="no-cache">
     <meta name="language" content="EN-US">
     <meta name="doc-type" content="Public">
     
    
 	 <script>
             
     	function call(actionName)
	    {
	       document.forms[0].target="_self";
	       document.forms[0].action=actionName;
	       document.forms[0].submit();
	    }
	       
       	function callL5D(actionName,transType) 
       	{
	       document.getElementById("transType").value=transType;
	       document.forms[0].target="_self";
	       document.forms[0].action=actionName;
	       document.forms[0].submit();
       	}
    	window.onbeforeunload= function() { }   
		window.history.forward(1);
     </script>
    </head>
<body>
	<div style="height: 100%;width: 100%;">
    <tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="body"  />
	<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>
