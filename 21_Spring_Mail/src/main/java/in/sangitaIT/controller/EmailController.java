package in.sangitaIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController {
	
	 @Autowired
	  private JavaMailSender javaMailSender;
	 @GetMapping("/email")
	 @ResponseBody
	 public String sendEmail() {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo("sethasangita33@gmail.com");
	        message.setSubject("Welcome to Sangita Tech");
	        message.setText("Reaad to work in Tech Company");
	        javaMailSender.send(message);
	        return "Email sent succesefully";
	    }
	 

}
