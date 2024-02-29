package com.tecnomexcoders.cakecode.service;

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
}
