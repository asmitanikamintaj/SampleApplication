package com.example.SimpleWebApplication.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SimpleWebApplication.Common.Status;
import com.example.SimpleWebApplication.Entity.Contact;
import com.example.SimpleWebApplication.Repository.ContactRepository;


@Service
public class ContactServiceImpl implements contactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public List<Contact> getContacts() {
		  System.out.println("We are in ContactServiceImpl ");
		List<Contact> contacts = contactRepository.findAll();
		if(!contacts.isEmpty())
			  System.out.println("contacts list is not empty");
		else {
			System.out.println("contacts list is empty");
			contacts = new ArrayList<Contact>();
		}
		
		return contacts;
	}

	@Override
	public Contact addContact(Contact contact) {
		contact = contactRepository.save(contact);
		return contact;
	}

	@Override
	public void deleteContact(int deleteId) {
		Optional<Contact> contacts = contactRepository.findById(deleteId);
		if(contacts.isPresent()) {
			System.out.println("Object is found");
			Contact contact = contacts.get();
			contact.setStatus(Status.INACTIVE.toString());
			contactRepository.save(contact);
			//contactRepository.delete(contacts.get());
			//System.out.println("Object Deleted");
		}else {
			System.out.println("Object not found");
		}
		
		
	}

	@Override
	public Contact findContact(int editId) {
		Optional<Contact> contacts = contactRepository.findById(editId);
		Contact contact = null;
		if(contacts.isPresent()) {
			System.out.println("Object is found");
			contact = contacts.get();
					
		}else {
			System.out.println("Object not found");
			contact = new Contact();
		}
		return contact;
		
	}

}
