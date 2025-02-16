package in.sita.sangita.model;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Data;
@Data
@Service
public class BookTicket {

	public List<Ticket> bookTicket;
}
