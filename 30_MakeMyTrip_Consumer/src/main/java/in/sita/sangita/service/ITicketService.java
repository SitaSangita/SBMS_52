package in.sita.sangita.service;

import java.util.List;

import in.sita.sangita.model.BookTicket;
import in.sita.sangita.model.Ticket;



public interface ITicketService {
	public List<Ticket> fetchTickets();

}
