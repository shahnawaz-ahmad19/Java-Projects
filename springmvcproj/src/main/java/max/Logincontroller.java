package max;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class Logincontroller {
	@Autowired
	User user;
	@Autowired
	UserValidation userValidation;
@RequestMapping(value="log", method=RequestMethod.GET)
	public ModelAndView loginUser()
	{
		return new ModelAndView("login", "india", user);
	}

@RequestMapping(value="lg", method=RequestMethod.POST)
public String getLoginDetail(@ModelAttribute("india")User user, BindingResult br, ModelMap m)
{
	userValidation.validate(user, br);
	if (br.hasErrors()) {
		return "login";	
	}
	m.addAttribute("u", user);
	return "S";
}

}
