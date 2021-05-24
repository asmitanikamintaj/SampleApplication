package com.example.SimpleWebApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.SimpleWebApplication.Common.Status;
import com.example.SimpleWebApplication.Entity.Contact;
import com.example.SimpleWebApplication.Service.contactService;

@Controller
public class ContactsController {
	
	@Autowired
	private contactService contactService;

	@RequestMapping("/")
	public ModelAndView getContacts() {
		System.out.println(" In getContacts "); 
		List<Contact> contacts = contactService.getContacts();
		ModelAndView modelandView = new ModelAndView();
		modelandView.addObject("contacts", contacts);
		modelandView.setViewName("contacts");
		return  modelandView ;		 
	}
	
	
	
	@RequestMapping("/add")
	public String  addContact(@ModelAttribute("contact") Contact contact,RedirectAttributes redir) {
		contact.setStatus(Status.ACTIVE.toString());
		System.out.println("In addContact "+contact.toString());
		contact = contactService.addContact(contact);		
		System.out.println(" contact saved"); 
		return "redirect:/";
		
	}
		
	@RequestMapping("/contactForm")
	public String contactForm(Model model) {
		System.out.println("contact form is going to open");		
		Contact contact =  new Contact();
	    model.addAttribute("contact", contact);	   
	    return "contact_form";
	}

	@RequestMapping("/edit/{id}")
	public String  editContact(@PathVariable("id") String id,Model model) {		
		System.out.println("In edit id is :"+id);	
		int editId = Integer.parseInt(id);
		Contact contact = contactService.findContact(editId);
		System.out.println(" contact edit"); 
		 model.addAttribute("contact", contact);	   
		return "contact_edit_form";
		
	}
	
	@RequestMapping("/delete/{id}")
	public String  deleteContact(@PathVariable("id") String id,RedirectAttributes redir) {		
		System.out.println("In delete, id is :"+id);
		int deleteId = Integer.parseInt(id);
		contactService.deleteContact(deleteId);
		System.out.println(" contact deleted"); 
		return "redirect:/";
		
	}
	
	
}
