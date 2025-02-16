package in.sita.sangita.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/welcome/{name}")
	public String getWelcome(@PathVariable("name") String name) {
		return name+ " "+"Welcome to RestController";
	}

	@GetMapping(value="/greet/{name}" , produces = "plain/text")
	public String greetMsg(@RequestParam("name") String name) {
		return "Good Evening :"+name;
	}
	@GetMapping(value = "/msg/{name}")
	public ResponseEntity<String> getMsg(@PathVariable("name")  String name){
		 String msg=name +":   Welcome to Rest World Where we no need to write UI part of code";
		return  new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
