package action.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class UpdateProfileAction {

	private String username,fathername,mothername;
	private String res; 
	Connection con=null;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}


	private String mob; 
	private String email; 
	private String pass;
	private String repass; 
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRepass() {
		return repass;
	}
	public void setRepass(String repass) {
		this.repass = repass;
	}
	public void setPass(String pass)
	{
	this.pass=pass;
	}
	public String getPass()
	{
	return pass;
	}

	public String execute()
	{
		System.out.println(username);
		System.out.println(pass);
		System.out.println(repass);
		System.out.println(mob);
		System.out.println(mothername);
		System.out.println(fathername);
		System.out.println(email);
		System.out.println(address);
	try
	{
		con=ConnectionAction.getCon();
		PreparedStatement pst=con.prepareStatement("update login_vacc set password=?,repassword=?,mob=?,email=?,father_name=?,mother_name=?,address=? where username=?");
		pst.setString(8,username);
		pst.setString(1,pass);
		pst.setString(2,repass);
		pst.setString(3,mob);
		pst.setString(4,email);
		pst.setString(5,fathername);
		pst.setString(6,mothername);
		pst.setString(7,address);
		
		int i=pst.executeUpdate();
		pst.close();
		if(i>0)
		{	
			HttpSession sess=ServletActionContext.getRequest().getSession();
			sess.setAttribute("updateprofile","Profile is updated successfully");
			return "success";
		}
		else
		{
			res="exception";
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
		res="exception";
	}
	return res;
	}

	
}
