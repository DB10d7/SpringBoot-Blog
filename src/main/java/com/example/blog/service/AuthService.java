package com.example.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.blog.dto.RegisterRequest;
import com.example.blog.model.User;
import com.example.blog.repository.UserRepository;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void signup(RegisterRequest registerRequest) {
		User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(encodePassword(registerRequest.getPassword()));
		userRepository.save(user);
	}
	private String encodePassword(String password) {
		return passwordEncoder.encode(password);
	}
	
	
	
	
	
}