package in.ashokit.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ORDER_DTL")
public class Product {
	@Id
	@Column(name="ORDER_ID")
	@GenericGenerator(name="PRODUCT_ID" ,strategy="in.ashokit.generator.OrderIdGenerator")
	@GeneratedValue(generator = "PRODUCT_ID")
	private String orderById;
	
	@Column(name="ORDER_BY")
	private String oderByName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="OREDER_PLACED_DT")
	private Date orderPlaceDate;

}
