package in.sita.sangita.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/greet")
	public String greetMsg() {
		String name=null;
		return name+"Good Morning";
	}
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String name=null;
		return "Welcome to Rest Controller";
		
	}

}
