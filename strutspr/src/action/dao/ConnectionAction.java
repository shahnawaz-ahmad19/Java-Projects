package action.dao;
import java.sql.*;
import java.util.*;
import java.io.*;

import listener.db.CtxListener;
public class ConnectionAction
{
static Connection con=null;
 public static void CreateCon(String path) 
{
try
{   Properties p=new Properties();
	p.load(new FileInputStream(CtxListener.getPath()+"/propertiesFile/db.properties"));
	
	String driver=p.getProperty("driver");
	String url=p.getProperty("url");
	String uname=p.getProperty("uname");
	String pwd=p.getProperty("pass");
	System.out.println(driver);
	Class.forName(driver);
	con=DriverManager.getConnection(url,uname,pwd);
}
catch(Exception e)
{
System.out.println(e);
}
}
public static Connection getCon()
{
return con;
}
}








