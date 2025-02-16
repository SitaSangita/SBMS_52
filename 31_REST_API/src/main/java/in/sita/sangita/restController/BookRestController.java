package in.sita.sangita.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sita.sangita.model.Book;

@RestController
public class BookRestController {

	@GetMapping("/book")
	public ResponseEntity<Book> getBook() {

		Book b = new Book();
		b.setId(101);
		b.setbName("java");
		b.setAuthor("John");
		return new ResponseEntity<Book>(b, HttpStatus.OK);
	}
}
