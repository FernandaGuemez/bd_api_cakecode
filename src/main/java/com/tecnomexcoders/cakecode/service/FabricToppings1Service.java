package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.Toppings1DTO;
import com.tecnomexcoders.cakecode.model.Toppings1;

@Service
public class FabricToppings1Service {
	public Toppings1 createToppings1(Toppings1DTO toppings1DTO) {
		return new Toppings1(toppings1DTO);
	}
	
	public Toppings1DTO createToppings1DTO(Toppings1 toppings1) {
		return new Toppings1DTO(toppings1);
	}
	
	public List<Toppings1DTO> createToppings1DTO(List<Toppings1> listToppings1){
		List<Toppings1DTO> listToppings1DTO = new ArrayList<>();
		listToppings1.stream().forEach(toppings1-> listToppings1DTO.add(createToppings1DTO(toppings1)));
		return listToppings1DTO;
	}

}
