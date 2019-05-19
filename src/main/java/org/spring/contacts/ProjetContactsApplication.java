package org.spring.contacts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.spring.contacts.dao.ContactRepository;
import org.spring.contacts.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetContactsApplication implements CommandLineRunner{

	@Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetContactsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		Contact c1 = contactRepository.save(
				new Contact("ahcene", "ben", df.parse("1994-04-10"),
						"ahcene@gmail.com",(long)0605, "ahcene.jpg"));
		Contact c2 = contactRepository.save(
				new Contact("contact1", "contact1", df.parse("1994-04-10"),
						"contact1@gmail.com",(long)0605, "contact1.jpg"));
		Contact c3 = contactRepository.save(
				new Contact("contact2", "ben", df.parse("1994-04-10"),
						"contact2@gmail.com",(long)0605, "contact2.jpg"));
	
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
		*/
	}
	

}

