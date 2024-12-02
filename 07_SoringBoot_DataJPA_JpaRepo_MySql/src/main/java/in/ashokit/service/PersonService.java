package in.ashokit.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Person;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
	public void getQBEPerson(String country ,String gender) {
		Person p=new Person();
		if(country!=null) {
			p.setCountry(country);
		}
		if(gender!=null) {
			p.setGender(gender);
		}
		Example<Person> all = Example.of(p);
		List<Person> list = personRepo.findAll(all);
		list.forEach(System.out::println);
	}
	public void paginationByPersonRecord() {
		int pagesize=3;
		int pageno=1;
		PageRequest pageRequest = 
				PageRequest.of(pageno-1, pagesize);
		Page<Person> all = personRepo.findAll(pageRequest);
		all.forEach(System.out::println);
	}
	
	public void sortPersonByDescending() {
		
		Sort sort=Sort.by("age").descending();
		//List<Person> all = personRepo.findAll(sort);
		//all.forEach(System.out::println);
		
		Sort ascending = Sort.by("name").ascending();
		List<Person> list = personRepo.findAll(ascending);
		list.forEach(System.out::println);
		
	}
	public void savePerson() {
		Person p1=new Person(1,28,"Sita","Female","Bharat");
		Person p2=new Person(2,40,"Gita","Female","Bharat");
		Person p3=new Person(3,20,"Millon","Male","USA");
		Person p4=new Person(4,22,"Smith","Male","Bharat");
		Person p5=new Person(5,38,"Luna","Male","Japan");
		Person p6=new Person(6,50,"Kita","Female","Canada");
		Person p7=new Person(7,32,"Sunita","Female","Bharat");
		Person p8=new Person(8,45,"Jhon","Male","UK");
		Person p9=new Person(9,34,"Smith","Male","USA");
		List<Person> all = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9);
		personRepo.saveAll(all);
	}
	
	

}
