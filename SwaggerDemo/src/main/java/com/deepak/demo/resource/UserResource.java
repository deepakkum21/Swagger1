package com.deepak.demo.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.demo.modal.User;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

	@GetMapping
	public List<User> getUsers() {
		return Arrays.asList(new User("Deepak", 70000D), new User("John", 80000D));
	}
	
	@PostMapping
	public User getUser(@RequestBody String userName) {
		return new User(userName, 90000D);
	}

}
