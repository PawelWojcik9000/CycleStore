package cyclestore.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cyclestore.entities.User;
import cyclestore.entities.UserRole;
import cyclestore.repositories.UserRepository;
import cyclestore.repositories.UserRolesRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserRolesRepository userRoleRepository;
	
	@GetMapping("/add")
	public String showAdduserForm(Model model) {
		model.addAttribute("user", new User());
		return "adduser";
	}
	@PostMapping("/add")
	public String processAdduser(@Valid User user, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "adduser";
		} else {
			user.setEnabled(true);
			userRepository.save(user);
			UserRole userRole = new UserRole();
			userRole.setRole("ROLE_USER");
			userRole.setUserId(user.getUserId());
			userRoleRepository.save(userRole);
			return "redirect:/home";
		}
	}
	
	

}
