package com.example.Services;

import org.springframework.stereotype.Service;

import com.example.Model.User;
import com.example.repository.UserRepository;

import javax.transaction.Transactional;


@Service
@Transactional
public class UserService {

	private final UserRepository userRepository;
	
	public UserService (UserRepository userRepository) {
		
		this.userRepository= userRepository;
	}
	
	public void saveMyUser(User user ) {
		
		userRepository.save(user);
	}

	
}
