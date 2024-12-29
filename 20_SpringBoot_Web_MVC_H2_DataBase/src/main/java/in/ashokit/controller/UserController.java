package in.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.User;
import in.ashokit.service.UserService;
import jakarta.validation.Valid;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String getUserFrom(Model model) {
		User userForm=new User();
		//userForm.setName("Sita");
		model.addAttribute("user", userForm);
		return "index";
	}
	@PostMapping("/user")
	public String  handleSubmit(@Valid User user , BindingResult result, 
			  Model model) {
				
		if(result.hasErrors()) {
		return "index";
		}
		boolean savedUser = userService.saveUser(user);
		if(savedUser) {
			model.addAttribute("smsg","Successfully saved user");
		}
		else {
			model.addAttribute("emsg","Saved Faild");
		}
		return "index";
	}
	
	@GetMapping("/users")
	public String getUsers(Model model) {
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("users", allUsers);
		return "users";
	}
	@GetMapping("/edit-user")
	public String editUserById(Model model,
			@RequestParam("id") Integer id) {
		User userById = userService.getUserById(id);

		model.addAttribute("user", userById);
	
		return "index";
	}
	
	@GetMapping("/delete-user")
	public String deleteUser(@RequestParam("id") Integer id,Model model) {
		boolean deleteUserById = userService.deleteUserById(id);
		if(deleteUserById) {
			model.addAttribute("smsg","user deleted");
			List<User> list = userService.getAllUsers();
			model.addAttribute("users", list);
		}
		else {
			model.addAttribute("emsg", "user not deleted");
		}
		return "users";
		
	}
}
