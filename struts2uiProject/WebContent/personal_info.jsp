<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Struts 2 UI Tags</title >
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" href="mystyle.css" type="text/css" />
<s:head theme="simple"/>
</head>
<body>
<h2 align="center">Enter Personal Information</h2>
<table align="center" width="600" >
<tr>
<td bgcolor="#fbefd9" align="center" >


<s:actionerror/>

<s:form action="personalAction" method ="post" name="personalform" cssStyle="color:#7a3d3d">  

  <s:textfield name="username" label="User Name" size="15" cssClass="fieldtext"   />
  
  <s:password name="password" label="Password" size="15" cssClass="fieldtext"/>
  <s:textfield name="fullname" label="Name" size="25" cssClass="fieldtext"/>
  <s:datetimepicker name="dob" label="DOB" adjustWeeks="true" displayFormat="dd MMMM, yyyy"></s:datetimepicker>
 <s:textarea name="address" label="Address" rows="4" cols="20" cssClass="fieldtext"/>  
  <s:doubleselect name="country"
   list="{'UP','BH'}" doubleName="State"
    doubleList="top=='UP'? {'Agra','Buland'} :{'patna','Hatna'}" cssClass="fieldtext">
    
    </s:doubleselect>
  
  
  
	  <s:select name ="ass" list="{'a','b','c'}" label="select Item" ></s:select>
  
  <s:radio name="mstatus" label="Marital Status" list="{'M','F','O'}"></s:radio>
  
  <s:checkboxlist name="skill" label="Your Interest" list="{'Programming', 'Testing', 'Research','Web Designing'}"/>
  
  <s:submit value="Submit" align="center"/>


  
</s:form>
<s:a href="index.jsp">Back</s:a>
</td>
</tr>
</table>
</body>
</html>
