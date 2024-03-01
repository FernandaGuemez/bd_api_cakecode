package com.tecnomexcoders.cakecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.UserDTO;
import com.tecnomexcoders.cakecode.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private FabricUserService fabricUserService;

	@Autowired
	private UserRepository userRepository;

	// save user
	public UserDTO save(UserDTO userDTO) {
		return fabricUserService
				.crearUserDTO(userRepository.save(fabricUserService.crearUser(userDTO)));
	}

	// Nos devuelve todos los users
	public List<UserDTO> findAll() {
		return fabricUserService.crearUsersDTO(userRepository.findAll());
	}

	// Encontrar por ID
	public UserDTO findById(Integer id) {
		return fabricUserService.crearUserDTO(userRepository.findById(id).get());
	}

	// Delete
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
	}
}
