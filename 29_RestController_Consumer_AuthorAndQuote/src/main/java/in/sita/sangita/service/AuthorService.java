package in.sita.sangita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.sita.sangita.model.Author;
import lombok.Data;
@Data
@Service
public class AuthorService {

		@Autowired
	   RestTemplate restTemplate;
	  public List<Author> fetchQuotes() {
	        String apiUrl = "https://dummyjson.com/quotes";
	     QuoteResponse rest = restTemplate.getForObject(apiUrl,QuoteResponse.class );

	       
	        return rest !=null ? rest.getQuotes() :null;
	    }
}
@Data
class QuoteResponse{
	private List<Author> quotes;
	
}