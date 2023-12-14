package com.proxiad.moviecatalog.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proxiad.moviecatalog.dto.login.UserDTO;
import com.proxiad.moviecatalog.service.login.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
	@Autowired UserService userService;
	
	@PostMapping("/save")
	public String saveUser(@RequestBody UserDTO userDTO) {
		String id = userService.addUser(userDTO);
		
		return id;
	}
}
