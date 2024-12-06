package in.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Aadhar;
import in.ashokit.entity.Person;
import in.ashokit.repo.AadharRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonAadharDetails {
	@Autowired
	private PersonRepo personRepo;
	@Autowired
	private AadharRepo aadharRepo;
	
	public void savePersonAadharDeatails() {
		Person p=new Person();
		p.setGender("Female");
		p.setPersonName("Smitha");
		
		Person person = personRepo.save(p);
		Aadhar a=new Aadhar();
		a.setAddress("TG");
		a.setPhoneNo(9752847l);
		a.setAadharNum(4526547892156l);
		a.setPerson(person);
		aadharRepo.save(a);
		
	}
	public void getPersonAddresDetails() {
		//personRepo.findById(3);
		Optional<Aadhar> byId = aadharRepo.findById(2);
		System.out.println(byId.getClass().getName());
	}
	public void deletePersonAadharDetails() {
		aadharRepo.deleteById(3);
		//personRepo.deleteById(3);
	}

}
