package max;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	public boolean update(String phone, int eid, String add)
	{
		try {
			Connection con= ConUtility.getConnn();
		     PreparedStatement	ps = con.prepareStatement("UPDATE emp SET phone = ?, add = ? WHERE eid = ?");
		     ps.setString(1, phone);
		     ps.setString(2, add);
		     ps.setInt(3, eid);
		       int i = ps.executeUpdate();
		       if(i>0)
		      {
		    	return true;
		      }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	
	
	public boolean insert(int uid, String name, String add, String phone)
	{
		
		 try {
			 Connection con= ConUtility.getConnn();
		     PreparedStatement	ps = con.prepareStatement("insert into emp values(?, ?, ?, ?)");//Create the statement object
		ps.setInt(1, uid);
		ps.setString(2, name);
		ps.setString(3, add);
		ps.setString(4, phone);
		
		   int i = ps.executeUpdate();//Execute the query. agar i = 0 aaya to data insert ni hoga aur agar 1 aagya to insert ho gaya
		   if(i>0)
			   return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public  Emp getViewDetail(int eid)
	{
		 Emp e = new Emp();
		try {
			 Connection con= ConUtility.getConnn();
			 PreparedStatement ps = con.prepareStatement("SELECT * FROM emp WHERE eid = ?");// it is secure. prepared statement se dynamic query fire hoti h. ye pre compiled hota hai
			 ps.setInt(1, eid);
			 
//			 Statement	s	= con.createStatement();// Its is insecure. statement se static query fire hoti hai
//			 ResultSet rs =s.executeQuery("SELECT * FROM emp WHERE eid ="+eid+"");
			 
			 
		     ResultSet	rs = ps.executeQuery();// Select k case me executeQuery use krna hai and update and insert k case me executeUpdate use krna hai.
			 while(rs.next())
			 {
//				int id = rs.getInt("eid");
//				String n = rs.getString("name");
//				String add = rs.getString("add");
//			String p = (rs.getString("phone") == null || rs.getString("phone").length()==10? "0000000" : rs.getString("phone"));
				
				e.setEid(rs.getInt("eid"));
				e.setName(rs.getString("name"));
				e.setAdd(rs.getString("add"));
				String p = (rs.getString("phone") == null || rs.getString("phone").length()==10? "0000000" : rs.getString("phone"));
				e.setPhone(p);
//				return id+" , "+n+" , "+add+" , "+p;
			 }
		     
		     
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return e;
		
	}
	
	public List<Emp> getViewDetail()
	{
//		Emp e = new Emp();
		List<Emp> l = new ArrayList<Emp>();
		try {
			 Connection con= ConUtility.getConnn();
			 PreparedStatement ps = con.prepareStatement("SELECT * FROM emp");// it is secure. prepared statement se dynamic query fire hoti h. ye pre compiled hota hai
		     ResultSet	rs = ps.executeQuery();// Select k case me executeQuery use krna hai and update and insert k case me executeUpdate use krna hai.
			 while(rs.next())
			 {
				 Emp e = new Emp();
				e.setEid(rs.getInt("eid"));
				e.setName(rs.getString("name"));
				e.setAdd(rs.getString("add"));
				String p = (rs.getString("phone") == null )? "0000000" : rs.getString("phone");
				e.setPhone(p);
				l.add(e);

			 }
		     
		     
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return l;
	}

}
