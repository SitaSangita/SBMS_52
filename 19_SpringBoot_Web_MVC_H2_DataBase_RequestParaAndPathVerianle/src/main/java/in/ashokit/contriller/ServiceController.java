package in.ashokit.contriller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ServiceController {
	@GetMapping("/")
	public String greetMsg(@RequestParam("name") String name) {
		return name+", Hii Contriller";
	}
	@GetMapping("/welcome/{name}")
	public String welcomeMsg(@PathVariable("name") String name) {
		return name+ " , Welcome to Path Variable";
	}

}
