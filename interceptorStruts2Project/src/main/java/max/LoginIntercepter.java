package max;

import com.opensymphony.xwork2.ActionInvocation; 
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginIntercepter implements Interceptor  {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		 ValueStack stack=ai.getStack();
		 String un=stack.findString("uName");
		 String pass=stack.findString("pass");
		 stack.setValue("uName", "SUCCESS");
		 
		 if (!un.equalsIgnoreCase(pass)) {
			 return ai.invoke();	
		}
		 return "fail";
	}

}
