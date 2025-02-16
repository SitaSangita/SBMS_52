package in.sita.sangita.interf;

import java.util.List;

import in.sita.sangita.entity.Customer;

public interface CustomerServiceInterface {
	public String upsert(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer getById(Integer cId);

	public String deleteById(Integer cId);

}
