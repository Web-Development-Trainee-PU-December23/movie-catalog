package com.proxiad.moviecatalog.entity.login;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "user")
public @Data class User {
	@Id
	@Column(name = "userId", length = 20)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@Column(name = "userName", length = 250)
	private String userName;

	@Column(name = "password", length = 250)
	private String password;
	
	@Column(name = "email", length = 250)
	private String email; 
	
	public User(int userId, String userName, String password, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
}
