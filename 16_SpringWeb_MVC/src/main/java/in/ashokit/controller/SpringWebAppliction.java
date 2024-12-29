package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringWebAppliction {
	@GetMapping("/welcome")
	public  ModelAndView getWelCome() {
		ModelAndView mav=new ModelAndView();
		//inside ModelAndView we store data in key and value as map
		mav.addObject("msg", "Hii Welcome to Spring Web MVC Where  you can devlope C2B and B2B application");
		//set view name
		mav.setViewName("index");
		return mav;
	}

}
