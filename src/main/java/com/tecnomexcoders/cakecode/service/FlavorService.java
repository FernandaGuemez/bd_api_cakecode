package com.tecnomexcoders.cakecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.FlavorDTO;
import com.tecnomexcoders.cakecode.repository.FlavorRepository;

@Service
public class FlavorService {

	@Autowired
	private FlavorRepository flavorRepository;
	
	@Autowired
	private FabricFlavorService fabricFlavorService;
	
	//Guardar flavor
	public FlavorDTO save(FlavorDTO flavorDTO) {
		return fabricFlavorService
				.createFlavorDTO(flavorRepository.save(fabricFlavorService.createFlavor(flavorDTO)));
	}
	
	//find all flavors
	public List<FlavorDTO> findAll(){
		return fabricFlavorService
				.createFlavorDTO(flavorRepository.findAll());
	}
	
	//find by id
	public FlavorDTO findById(Integer id) {
		return fabricFlavorService
				.createFlavorDTO(flavorRepository.findById(id).get());
	}
	
	//Delete flavor by id
	public void delete(Integer id) {
		flavorRepository.deleteById(id);
	}
	
}
