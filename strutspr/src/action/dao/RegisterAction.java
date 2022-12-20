package action.dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
public class RegisterAction
{
private String username,fathername,mothername;
private String res; 

private String mob; 
private String email; 
private String pass;
private String repass; 
private String address;
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
	PreparedStatement pst=con.prepareStatement("insert into login_vacc values(?,?,?,?,?,?,?,?,?,?)");
	pst.setString(1,username);
	pst.setString(2,pass);
	pst.setString(3,repass);
	pst.setString(4,mob);
	pst.setString(5,email);
	pst.setInt(6,1);
	ResultSet rs=con.createStatement().executeQuery("select * from login_vacc");
	int member_no=1;
	while(rs.next())
	{
	member_no++;
	}
	pst.setInt(7,member_no);
	pst.setString(8,fathername);
	pst.setString(9,mothername);
	pst.setString(10,address);
	
	ServletContext ctx=ServletActionContext.getServletContext();
	ctx.setAttribute("tcounter",member_no);
	int i=pst.executeUpdate();
	pst.close();
	if(i>0)
	{
		res="success";
			
		 
		 File source = new File(ServletActionContext.getServletContext().getRealPath("")+"/UserProfile/user.jpg");
	     File dest = new File(ServletActionContext.getServletContext().getRealPath("")+"/UserProfile/"+username+".jpg");
	     System.out.println(source);
	     System.out.println(dest);
		
	     try{
			 InputStream is = null;
			    OutputStream os = null;
			    try {
			        is = new FileInputStream(source);
			        os = new FileOutputStream(dest);
			        byte[] buffer = new byte[1024];
			        int length;
			        while ((length = is.read(buffer)) > 0) {
			            os.write(buffer, 0, length);
			        
			    }
			        }catch(Exception exception){
		        	exception.printStackTrace();
		        }
		        
			        finally {
			        is.close();
			        os.close();
			    }
		}catch(Exception exception){
			exception.printStackTrace();
		}

		
		
		return "succ";
		//System.out.println("success");
	}
	else
	{
		return "fail";
		//System.out.println("fail");
	}
}
catch(Exception e)
{
	System.out.println(e);
	res="exception";
}
return null;
}

}

