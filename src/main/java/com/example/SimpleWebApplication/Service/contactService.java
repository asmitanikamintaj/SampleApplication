package com.example.SimpleWebApplication.Service;

import java.util.List;

import com.example.SimpleWebApplication.Entity.Contact;

public interface contactService {
	
	public List<Contact> getContacts();

	public Contact addContact(Contact contact);

	public void deleteContact(int deleteId);

	public Contact findContact(int editId);

}
