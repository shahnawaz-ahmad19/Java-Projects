package action.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.apache.struts2.ServletActionContext.*;

public class ViewChildInfoAction {
	String res;
	public String execute()
	{
	try
	{
			Connection con=null;
			con=ConnectionAction.getCon();
			PreparedStatement pst=con.prepareStatement("select * from child_vacc where username=?");
			pst.setString(1,(String)getRequest().getSession().getAttribute("name"));
			ResultSet rs=pst.executeQuery();
			getRequest().setAttribute("rs",rs);
			return "success";
	}
	catch(Exception e)
	{
		res="exception";
		System.out.println(e);
	}
	return res;
}
}