package in.sita.sangita.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.sita.sangita.model.BookTicket;
import in.sita.sangita.model.Ticket;
import lombok.Data;
@Service
@Data
public class TicketServiceImpl implements ITicketService {

	
	@Override
	public List<Ticket> fetchTickets() {
		RestTemplate restTemplate=new RestTemplate();
	    String apiUrl = "https://www.classes.ashokit.in/tickets";
	    BookTicket list= restTemplate.getForObject(apiUrl, BookTicket.class);
	    return list != null ?list.getBookTicket(): null;
	}

}
