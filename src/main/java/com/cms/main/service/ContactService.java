package com.cms.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.main.Repository.ContactRepository;
import com.cms.main.model.Contact;

@Service
public class ContactService {

	@Autowired
	private ContactRepository repo;

	public Contact create(Contact contact) {
		return repo.save(contact);
	}

	public List<Contact> getAll() {
		return repo.findAll();
	}

	public Contact getById(Long id) {
		return repo.findById(id).orElseThrow();
	}

	public Contact update(Long id, Contact updated) {
		Contact contact = getById(id);
		contact.setFirstName(updated.getFirstName());
		contact.setLastName(updated.getLastName());
		contact.setEmail(updated.getEmail());
		contact.setPhoneNumber(updated.getPhoneNumber());
		return repo.save(contact);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<Contact> search(String keyword) {
		return repo.search(keyword);
	}

}
