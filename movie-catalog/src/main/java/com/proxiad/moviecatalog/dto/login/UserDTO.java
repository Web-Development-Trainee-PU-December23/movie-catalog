package com.proxiad.moviecatalog.dto.login;

import lombok.Data;

public @Data class UserDTO {
	private int userId;

	private String userName;

	private String password;
	
	private String email; 
}
