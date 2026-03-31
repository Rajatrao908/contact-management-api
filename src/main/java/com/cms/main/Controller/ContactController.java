package com.cms.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cms.main.model.Contact;
import com.cms.main.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

	@Autowired
	private ContactService service;

	@PostMapping
	public ResponseEntity<Contact> create(@RequestBody Contact contact) {
		return ResponseEntity.ok(service.create(contact));
	}

	@GetMapping
	public List<Contact> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Contact getById(@PathVariable Long id) {
		return service.getById(id);
	}

	@PutMapping("/{id}")
	public Contact update(@PathVariable Long id, @RequestBody Contact contact) {
		return service.update(id, contact);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@GetMapping("/search")
	public List<Contact> search(@RequestParam String keyword) {
		return service.search(keyword);
	}

}
