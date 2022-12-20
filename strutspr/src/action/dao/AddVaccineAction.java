package action.dao;

import java.sql.*;


import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class AddVaccineAction {

	private String vaccname,age,disease,description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVaccname() {
		return vaccname;
	}

	public void setVaccname(String vaccname) {
		this.vaccname = vaccname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	
	
	
	public String execute()
	{ 
		Connection con=null;
		String res=null;
		try
		{
			con=ConnectionAction.getCon();
			PreparedStatement pst=con.prepareStatement("insert into vacc_info values(?,?,?,?)");
			pst.setString(1,vaccname);
			pst.setString(2,age);
			pst.setString(3,description);
			pst.setString(4,disease);
			int i=pst.executeUpdate();
			pst.close();
			if(i>0)
			{
				res="success";
				HttpSession sess=ServletActionContext.getRequest().getSession();
				sess.setAttribute("add_vacc","Vaccine is added successfully");
			}
			else
			{
				res="exception";
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
