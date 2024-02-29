package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.Toppings2DTO;
import com.tecnomexcoders.cakecode.model.Toppings2;

@Service
public class FabricToppings2Service {

	public Toppings2 createToppings2 (Toppings2DTO toppings2DTO) {
		return new Toppings2(toppings2DTO);
	}
	
	public Toppings2DTO createToppings2DTO(Toppings2 toppings2) {
		return new Toppings2DTO(toppings2);
	}
	public List<Toppings2DTO> createToppings2sDTO(List<Toppings2> toppings2s){
		List<Toppings2DTO> toppings2sDTO = new ArrayList<>();
		toppings2s.forEach(toppings2 -> toppings2sDTO.add(new Toppings2DTO(toppings2)));
	return toppings2sDTO;
	}
	
}
