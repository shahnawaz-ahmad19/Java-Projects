package action.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class ViewProfileAction {
	Connection con=null;
	String res=null;
	public String execute()
	{
		try
		{
		HttpSession sess=ServletActionContext.getRequest().getSession();
		String user=(String)sess.getAttribute("name");
			
		con=ConnectionAction.getCon();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from login_vacc where username='"+user+"'");
		sess.setAttribute("viewProfile",rs);
		res="success";
		}catch(Exception e)
		{
			System.out.println(e);
			res="exception";
		}
		
		
		
		
		return res;
	}
	
}
