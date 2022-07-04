package com.uevitondev.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uevitondev.workshopmongo.domain.User;
import com.uevitondev.workshopmongo.dto.UserDTO;
import com.uevitondev.workshopmongo.repository.UserRepository;
import com.uevitondev.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public User insertUser(User obj) {
		return userRepository.insert(obj);
	}

	public void deleteUser(String id) {
		findById(id);
		userRepository.deleteById(id);

	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());

	}

}
