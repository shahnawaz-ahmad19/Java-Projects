 package max;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object o, Errors e) {
		User u=(User)o;
		if (u.getUid().length()<5) {
			e.rejectValue("uid", "l.uid");
			
		}
		
	}

}
