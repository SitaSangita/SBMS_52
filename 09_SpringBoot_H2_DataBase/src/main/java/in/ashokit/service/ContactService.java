package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repo.ContactRepo;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepo contactRepo;
	
	public void saveContact() {
		Contact c=new Contact();
		c.setName("Sita");
		c.setEmail("sita@gmail.com");
		c.setPhno(462345836);
		System.out.println("Before Save ::"+c);
		Contact contact = contactRepo.save(c);
		System.out.println("After save ::"+contact);
	}

}
