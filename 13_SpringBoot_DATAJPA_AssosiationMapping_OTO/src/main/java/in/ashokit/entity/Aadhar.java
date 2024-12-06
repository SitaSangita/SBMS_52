package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
//child class table
public class Aadhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long aadharId;
	private String address;
	private Long phoneNo;
	private Long aadharNum;
	
	@OneToOne
	@JoinColumn(name="person_id")
	private Person person;

}
