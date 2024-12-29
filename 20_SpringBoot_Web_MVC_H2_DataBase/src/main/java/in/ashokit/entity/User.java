package in.ashokit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="User-tbl")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Name is mandatory")
	private String name;
	@NotEmpty(message = "Email is mandatory")
	private String email;
	@NotNull(message = "PhoneNo is mandatory")
	private Long phno;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime createDT;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDateTime updateDT;

}
