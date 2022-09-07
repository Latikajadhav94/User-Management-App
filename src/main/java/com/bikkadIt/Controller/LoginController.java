package com.bikkadIt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.Binding.LoginForm;
import com.bikkadIt.Service.UserServiceI;

@RestController
public class LoginController {

	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping("/login")
	public ResponseEntity<String> loginCheck(@RequestBody  LoginForm loginForm) {
		
		String loginCheck = userServiceI.loginCheck(loginForm);
		
		return new ResponseEntity<String>(loginCheck,HttpStatus.OK);
		
	}
} 
