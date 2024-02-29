package com.tecnomexcoders.cakecode.dto;

import com.tecnomexcoders.cakecode.model.Flavor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FlavorDTO {
	private Integer id;
	private String flavor;
	public FlavorDTO(Flavor flavor) {
		super();
		this.id = flavor.getId();
		this.flavor = flavor.getFlavor();
	}
	
	

}

