package in.sita.sangita.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sita.sangita.entity.Customer;
import in.sita.sangita.interf.CustomerServiceInterface;

@RestController
public class CustomerRestController {
	@Autowired
	private CustomerServiceInterface  customerServiceInterface;
	
	@PostMapping("/customer")
	public ResponseEntity<String> createCustomer(@RequestBody Customer customer){
		 String status=customerServiceInterface.upsert(customer);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") Integer cId){
		 Customer status=customerServiceInterface.getById(cId);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		 List<Customer> list = 
				 customerServiceInterface.getAllCustomer();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@PutMapping("/customer")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer){
		 String upsert = customerServiceInterface.upsert(customer);
		return new ResponseEntity<>(upsert,HttpStatus.OK);
	}
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable Integer cId){
		 Customer status=customerServiceInterface.getById(cId);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
}