package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.User;
import in.ashokit.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String getUserFrom(Model model) {
		User userForm=new User();
		model.addAttribute("user", userForm);
		return "index";
	}
	
	@PostMapping("/user")
	public String addUser(User user,Model model) {
		boolean saveUser = userService.saveUser(user);
		if(saveUser) {
			model.addAttribute("smsg", "User Saved");
		}
		else {
			model.addAttribute("emsg", "Record not inserted");
		}
		
		return "index";
		
	}
	
	@GetMapping("/users")
	public String getUsers(Model model) {
		List<User> allUsers = userService.findAllUser();
		model.addAttribute("users", allUsers);
		return "user";
	}
}
