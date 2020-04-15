package com.beginnersbug.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation used to mention a class as Controller class
@RestController
public class StudentController {

	// To Retrieve we can use Get method
	@GetMapping("/name")
	public String getName() {
		return "BeginnersBug";
	}

}
