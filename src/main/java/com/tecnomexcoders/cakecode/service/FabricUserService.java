package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.UserDTO;
import com.tecnomexcoders.cakecode.model.User;

@Service
public class FabricUserService {
	
	public User crearUser(UserDTO userDTO) {
		return new User(userDTO);
	}
	
	public UserDTO crearUserDTO(User user) {
		return new UserDTO(user);
	}
	
	public List<UserDTO>crearUsersDTO(List<User>listUsers){
		List<UserDTO>listUsersDTO = new ArrayList<>();
		listUsers.stream().forEach(user->listUsersDTO.add(crearUserDTO(user)));
		return listUsersDTO;
	}
	
	
	

}
