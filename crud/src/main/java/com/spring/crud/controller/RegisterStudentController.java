package com.spring.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.crud.entity.Student;
import com.spring.crud.service.IstudentService;

@Controller
public class RegisterStudentController {

	@Autowired
	private IstudentService is;
	
	@GetMapping("/home")
	public String getHomePage() {
		
		return "Home";
	}
	
	@GetMapping("/register")
	public String getRegisterPage() {
		
		return "Register";
	}
	
	
	@PostMapping("/success")
	public String getRegisterPage(Model m,@ModelAttribute("student") Student std) {
		
		Integer id = is.addStudent(std);
		
		m.addAttribute("sid", id);
		
		return "Home";
	}
	
}
