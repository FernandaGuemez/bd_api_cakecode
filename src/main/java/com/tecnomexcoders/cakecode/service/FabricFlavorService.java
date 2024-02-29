package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.tecnomexcoders.cakecode.dto.FlavorDTO;

import com.tecnomexcoders.cakecode.model.Flavor;

@Service
public class FabricFlavorService {

	public Flavor createFlavor(FlavorDTO flavorDTO) {
		return new Flavor(flavorDTO);
	}
	
	public FlavorDTO createFlavorDTO(Flavor flavor) {
		return new FlavorDTO(flavor);
	}
	
	public List<FlavorDTO> createFlavorDTO(List<Flavor> listFlavors){
		List<FlavorDTO> listFlavorsDTO = new ArrayList<>();
		listFlavors.stream().forEach(flavor-> listFlavorsDTO.add(createFlavorDTO(flavor)));
		return listFlavorsDTO;
	}
}
