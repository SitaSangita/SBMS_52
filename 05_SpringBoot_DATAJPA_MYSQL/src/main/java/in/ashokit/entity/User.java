package in.ashokit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="User_Tbl")

public class User {
	
	@Id
	@Column(name="User_Id")
	private Integer id;
	private String name;
	private String gender;
	private String country;
	
	@CreationTimestamp //populated record creation date
	@Column(updatable =false)
	private LocalDateTime createDate;
	
	@UpdateTimestamp // populated record update date
	@Column(insertable =false)
	private LocalDateTime updateDate;

}
