package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Contact;
import com.example.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;

	public String saveContactDetails(Contact contact) {
		contact = repo.save(contact);
		if (contact.getContactId()!= null) {
			return "contact saved";
		} else {
			return "contact not saved";
		}
	}

	public List<Contact> getAllDetails() {
		return repo.findAll();
	}

	public Contact getContactByid(Integer contactId) {
		Optional<Contact> findById = repo.findById(contactId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		if (contact.getContactId()!= null) {
			repo.save(contact);
			return "Updated sucess";
		} else {
			return "Contact is not found";
		}
	}

	@Override
	public String deleteContactById(Integer contactId) {
		if (repo.existsById(contactId)) {
			repo.deleteById(contactId);
			return "record is deleted";
		} else {
			return "record not found";
		}

	}

	
}
