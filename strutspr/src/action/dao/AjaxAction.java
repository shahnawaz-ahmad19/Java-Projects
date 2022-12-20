package action.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.struts2.ServletActionContext;

public class AjaxAction {
String res="success";
	public String execute()
	{
		try
		{
			String nm=(String)ServletActionContext.getServletContext().getAttribute("check");
			Connection con=ConnectionAction.getCon();
		    Statement stmt=con.createStatement();
		    ResultSet rs=stmt.executeQuery("select * from login_vacc where username='"+nm+"'");
			if(rs.next())
			{	
				ServletActionContext.getRequest().setAttribute("check","exist");
			}else
			{
				ServletActionContext.getRequest().setAttribute("check","notexist");
			}
		}
		catch(Exception e)
		{	
			res="exception";
			System.out.println(e);
		}
		return res;
	}
}
