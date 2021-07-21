package com.blurdel.todo.web.service;

import org.springframework.stereotype.Service;


@Service
public class LoginService {

	public boolean validateUser(String user, String pass) {
		return user.equalsIgnoreCase("user") && pass.equalsIgnoreCase("pass");
	}
}
