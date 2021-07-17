package com.lucasnscr.studyneo4j.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasnscr.studyneo4j.domain.User;
import com.lucasnscr.studyneo4j.service.UserService;

@RestController
@RequestMapping("/rest/neo4j/user")
public class UserResource {

	private UserService userService;
	
	public UserResource(UserService userService) {
		this.userService = userService;
	}

    @GetMapping
    public Collection<User> getAll() {
        return userService.getAll();
    }

}
