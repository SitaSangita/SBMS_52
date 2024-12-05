package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.db1.entity.Customer;
import in.ashokit.db1.repo.CustomerRepo;
import in.ashokit.db2.entity.Bank;
import in.ashokit.db2.repo.BankRepo;

@Service
public class ServiceProvider {
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private BankRepo bankRepo;
	public Customer saveCustomer(Customer customer) {
		/*
		 * Customer c=new Customer(); c.setName("Sangita"); c.setBankName("SBI");
		 * c.setLocation("HYD"); c.setAccountNo(1452367l); Customer save =
		 * customerRepo.save(c);
		 * 
		 */	
		return  customer;
		}
	public Bank saveBank(Bank bank) {
		/*
		 * Bank b=new Bank(); b.setBankName("SBI"); b.setLocation("HYD"); Bank save =
		 * bankRepo.save(b);
		 */
		return bank;
	}
	public void saveCustomerDeatil() {
		Customer c=new Customer(); 
		c.setName("Sita"); 
		c.setBankName("SBI");
		  c.setLocation("HYD");
		  c.setAccountNo(14523456l); 
		  Customer save =
		  customerRepo.save(c);
	}
	public void saveBankDetails() {
		Bank b=new Bank();
		b.setId(102);
		b.setBankName("SBI"); 
		b.setLocation("HYD");
		Bank save =
				  bankRepo.save(b);

	}

}
