package in.sangitaIT.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	@GetMapping("/welcome")
	public String getWelcome() {
		String msg="Welcome to RestAPI......";
		return msg;
	}
	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg(){
		String msg="Welcome tp SpringBoot Rest API.....!!";
		return new ResponseEntity<>(msg,HttpStatus.ACCEPTED);
	}

}
