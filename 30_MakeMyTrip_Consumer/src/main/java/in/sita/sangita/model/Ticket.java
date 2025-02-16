package in.sita.sangita.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
	
	private Integer id;
	private String ticketStatus;
	private Integer trainNum;
	private String name;
	private String email;
	private String dob;
	private String gender;
	private Date doj;
	private String source;
	private String destination;

}
