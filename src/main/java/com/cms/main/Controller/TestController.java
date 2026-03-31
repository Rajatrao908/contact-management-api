package com.cms.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.main.model.Contact;

@RestController
public class TestController {

	@GetMapping("/getString")
	public String getString() {
		return "This Controller is working";
	}

}
