package com.example.service;

import java.util.List;

import com.example.model.Contact;

public interface ContactService {
	

	public String saveContactDetails(Contact contact);
	
	public List<Contact> getAllDetails();
	
	public Contact getContactByid(Integer contactId);
	
	public String updateContact(Contact contact);
	
	public String deleteContactById(Integer contactId);
	
	
	


}
