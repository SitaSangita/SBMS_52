package in.sita.sangita.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sita.sangita.binding.UserDTO;

@RestController
public class UserRestController {
	
	@GetMapping
	public String getUser(UserDTO user) {
		
		
		return null;
	}

}
