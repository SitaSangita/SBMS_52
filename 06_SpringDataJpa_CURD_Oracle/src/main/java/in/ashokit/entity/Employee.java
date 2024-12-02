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
@Table(name="Emp_tbl")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer id;
	private String name;
	private String location;
	private double salary;
	
	@CreationTimestamp
	@Column(updatable =false)
	private LocalDateTime createTime;
	
	@UpdateTimestamp
	@Column(insertable =false)
	private LocalDateTime updateTime;
}
