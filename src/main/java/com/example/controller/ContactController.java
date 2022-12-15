
package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Contact;
import com.example.service.ContactService;

@RestController
public class ContactController {
	
		@Autowired
		private ContactService service;
		
		@PostMapping("/contact")
		public String getContactDetails(@RequestBody Contact entity) {
			  String status=service.saveContactDetails(entity);
			  return status;
		}
		
		@GetMapping("/contacts")
		public List<Contact> getAllContactDetails(){
			return service.getAllDetails();
		}
		
		@GetMapping("/contact/{id}")
		public Contact getContactById(@PathVariable Integer id) {
			return service.getContactByid(id);
			
		}
		@PutMapping("/contact")
		public String updateContactDetails(@RequestBody Contact contact) {
			return service.updateContact(contact);
		}
		
		@DeleteMapping("/contact/{id}")
		public String removeContactById(@PathVariable Integer id) {
			 return service.deleteContactById(id);
		}
	 
	}



