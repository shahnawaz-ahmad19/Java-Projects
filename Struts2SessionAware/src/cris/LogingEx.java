package cris;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LogingEx extends ActionSupport implements ModelDriven<User>{	
	private static final long serialVersionUID = 1L;
	User u=new User();
		




	public String execute()   
	{	
		
		System.out.println("in action "+u.getStuname());
		
		/*session.put("a",u.getStuname());
		session.put("b", u.getCountry());
		session.put("c",u.getStumarks());
		session.put("d",u.getStumarks());
		request.put("t", u.getStuname().toUpperCase());*/
		return "succ";
	}
	
	@Override
	public User getModel() {
		
		return u;
	}
	
	
	
	
}
