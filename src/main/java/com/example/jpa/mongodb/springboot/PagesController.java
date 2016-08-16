package com.example.jpa.mongodb.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

	@RequestMapping("/user-form")
	public String userPage() {
		return "user.html";
	}
	
}
