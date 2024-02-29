package com.tecnomexcoders.cakecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.Toppings2DTO;
import com.tecnomexcoders.cakecode.repository.Toppings2Repository;

@Service
public class Toppings2Service {

	@Autowired
	private Toppings2Repository toppings2Repository;
	
	@Autowired
	private FabricToppings2Service fabricToppings2Service;
	
	// guarda un toping2
	
	public Toppings2DTO save(Toppings2DTO toppings2DTO) {
		return fabricToppings2Service
				.createToppings2DTO(toppings2Repository.save(fabricToppings2Service.createToppings2(toppings2DTO)));
	}
	
	//final toping2
	public List<Toppings2DTO> findAll(){
		return fabricToppings2Service.createToppings2sDTO(toppings2Repository.findAll());
		
	}
	
	//final topings2 by id
	public Toppings2DTO findById(Integer id) {
		return fabricToppings2Service.createToppings2DTO(toppings2Repository.findById(id).get());
	}
	
	//delete topings by id
	public void delete (Integer id) {
		toppings2Repository.deleteById(id);
		
	}
	
}
