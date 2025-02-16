package in.sita.sangita.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.sita.sangita.model.Author;
import in.sita.sangita.service.AuthorService;


@Controller
public class AuthorController {
	

    @Autowired
    private AuthorService authorService;

    @GetMapping("/")
    public String getQuotes(Model model) {
    	List<Author> listAuthor=authorService.fetchQuotes();
    	model.addAttribute("author", listAuthor);
    	return "author";
    }

}
