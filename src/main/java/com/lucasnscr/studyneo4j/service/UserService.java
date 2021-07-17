package com.lucasnscr.studyneo4j.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.lucasnscr.studyneo4j.domain.User;
import com.lucasnscr.studyneo4j.domain.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public Collection<User> getAll() {
		Collection<User> allUsers = userRepository.getAllUsers();
		return allUsers;
	}
}