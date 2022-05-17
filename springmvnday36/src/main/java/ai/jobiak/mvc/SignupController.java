package ai.jobiak.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignupController {
	
	@Autowired
	SignupDAO signup;
	
	public SignupController(SignupDAO signup) {
		this.signup=signup;
	}
	@RequestMapping(value="signup",method=RequestMethod.POST)
	public String doSignup(User user,ModelMap map) {
		
		map.put("fname",user.getFname());
		map.put("mobile", user.getMobile());
		map.put("email",user.getEmail());
		return "user";
	}
	
	

}

