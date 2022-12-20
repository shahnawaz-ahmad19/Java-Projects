package action.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.struts2.ServletActionContext;

public class VaccinfoAction 
{
	public static void getVaccInfo()
	{
		try
		{
				Connection con=null;
				con=ConnectionAction.getCon();
				PreparedStatement pst=con.prepareStatement("select * from vacc_info");
				ResultSet rs=pst.executeQuery();
				ServletActionContext.getRequest().setAttribute("rs",rs);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
