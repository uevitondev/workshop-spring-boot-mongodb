package com.uevitondev.workshopmongo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uevitondev.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {

		User maria = new User("1", "Maria Silva", "maria@gmail.com");
		User joao = new User("2", "Joao Silva", "joao@gmail.com");

		List<User> list = new ArrayList<User>();
		list.add(maria);
		list.add(joao);

		return ResponseEntity.ok().body(list);
	}
}
