package com.tecnomexcoders.cakecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.Toppings1DTO;
import com.tecnomexcoders.cakecode.repository.Toppings1Repository;

@Service
public class Toppings1Service {

	@Autowired
	private Toppings1Repository toppings1Repository;
	
	@Autowired
	private FabricToppings1Service fabricToppings1Service;
	
	//Guardar topping1
	public Toppings1DTO save(Toppings1DTO toppings1DTO) {
		return fabricToppings1Service
				.createToppings1DTO(toppings1Repository
				.save(fabricToppings1Service.createToppings1(toppings1DTO)));
	}
	
	//find all toppings
	public List<Toppings1DTO> findAll(){
		return fabricToppings1Service
				.createToppings1DTO(toppings1Repository.findAll());
	}
	
	//find id
	public Toppings1DTO findById(Integer Id) {
		return fabricToppings1Service
				.createToppings1DTO(toppings1Repository.findById(Id).get());
	}
	
	//Delete topping by id
	public void deleteById(Integer id) {
		toppings1Repository.deleteById(id);
	}
}
