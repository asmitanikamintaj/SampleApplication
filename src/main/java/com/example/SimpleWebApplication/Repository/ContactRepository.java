package com.example.SimpleWebApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SimpleWebApplication.Entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	List<Contact> findAll();

}
