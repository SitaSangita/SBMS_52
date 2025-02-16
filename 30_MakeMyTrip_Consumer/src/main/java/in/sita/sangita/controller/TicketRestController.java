package in.sita.sangita.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.sita.sangita.model.BookTicket;
import in.sita.sangita.model.Ticket;
import in.sita.sangita.service.ITicketService;

@Controller
public class TicketRestController {
	@Autowired
	private ITicketService iTicketService;
	
	@GetMapping(value="/ticket" ,consumes ={"application/json", "application/text"} , produces = "application/json")
	public String getAllTickets(Model model) {
		List<Ticket> tickets = iTicketService.fetchTickets();
		Model attribute = model.addAttribute("ticket", tickets);
		return "ticket";
	}
	@GetMapping("/")
	public String getAllTicket(Model model) {
	    List<Ticket> tickets = List.of(new Ticket(1, "Confirmed", 12345, "John Doe", "john@example.com", "1990-01-01", "Male", new Date(), "Source", "Destination"));
	    model.addAttribute("ticket", tickets);
	    return "ticket";
	}

}
