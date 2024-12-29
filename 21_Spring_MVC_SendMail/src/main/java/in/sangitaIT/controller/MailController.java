package in.sangitaIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sangitaIT.entity.Email;
import in.sangitaIT.interf.EmailSeviceIntef;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MailController {

    private final EmailSeviceIntef emailSeviceIntef;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("email", new Email());  // Use "email" instead of "emailSeviceIntef"
        return "form";  // Make sure the Thymeleaf template name matches
    }
    @GetMapping("/home")
    public String showHome(Model model) {
        model.addAttribute("email", new Email());  // Use "email" instead of "emailSeviceIntef"
        return "home";  // Make sure the Thymeleaf template name matches
    }

    @PostMapping("/sendMail")
    public String sendMail(@ModelAttribute Email email, Model model) {
        try {
            emailSeviceIntef.sendEmail(email);
            model.addAttribute("success", "Email sent successfully!");
        } catch (MessagingException e) {
            model.addAttribute("error", "Failed to send email. Please try again.");
        }
        return "form";  // Return to the same form view after submission
    }
}
