package in.sita.sangita.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import in.sita.sangita.entity.Customer;
import in.sita.sangita.interf.CustomerServiceInterface;
import in.sita.sangita.repo.CustomerRepo;
@Service
public class CustomerServiceImpl implements CustomerServiceInterface {

	@Autowired
	private CustomerRepo customerRepo;
	@Override
	public String upsert(Customer customer) {
		customerRepo.save(customer);
		return "success";
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> all = customerRepo.findAll();
		return all;
	}

	@Override
	public Customer getById(Integer cId) {

		Optional<Customer> byId = 
				customerRepo.findById(cId);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Override
	public String deleteById(Integer cId) {
		if(customerRepo.existsById(cId)) {
			customerRepo.deleteById(cId);
			return "delete success";
		}
		else {
			return "Not found id";
		}
		
	}

}
