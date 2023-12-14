package com.proxiad.moviecatalog.service.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.proxiad.moviecatalog.dto.login.UserDTO;
import com.proxiad.moviecatalog.entity.login.User;
import com.proxiad.moviecatalog.repository.login.UserRepository;
import com.proxiad.moviecatalog.service.login.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public String addUser(UserDTO userDTO) {
		User user = new User(userDTO.getUserId(), userDTO.getUserName(), userDTO.getEmail(),
				passwordEncoder.encode(userDTO.getPassword()));
		
		userRepository.save(user);
	
		return user.getUserName();
	}

}
