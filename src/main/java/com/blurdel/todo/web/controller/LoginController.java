package com.blurdel.todo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.blurdel.todo.web.service.LoginService;


@Controller
@SessionAttributes("username")
public class LoginController {

	@Autowired
	LoginService service;
	
	
	@GetMapping(value="/")
	public String showLogin(Model model) {
		return "/login";
	}
	
	@PostMapping(value="/login")
	public String showWelcome(Model model, @RequestParam String username, @RequestParam String password) {
		
		boolean isValid = service.validateUser(username, password);
		
		if (!isValid) {
			model.addAttribute("errorMessage", "Incorrect username/password");
			return "login";
		}
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		return "welcome";		
	}
}
