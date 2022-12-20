package action.dao;

import java.sql.*;

import org.apache.struts2.ServletActionContext;

public class GenerateChildId {
	Connection con;
	String res;
	public String execute()
	{
	try
	{
		con=ConnectionAction.getCon();
		ResultSet rs=con.createStatement().executeQuery("select * from child_vacc");
		int ch_id=100;
		while(rs.next())
		{
		ch_id++;
		}
		res="success";
		ServletActionContext.getRequest().setAttribute("ch_id",ch_id);
	}catch(Exception e)
	{
		res="exception";
		System.out.println(e);
	}
	return res;
	}
}