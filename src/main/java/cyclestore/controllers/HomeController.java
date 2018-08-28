package cyclestore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cyclestore.entities.User;
import cyclestore.repositories.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping( {"/", "/home"} )
	public String homepage() {
		
		
		
		return "home";
	}

}
