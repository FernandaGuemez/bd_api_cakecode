package com.tecnomexcoders.cakecode.dto;

import com.tecnomexcoders.cakecode.model.Toppings1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Toppings1DTO {
	private Integer id;
	private String toppingImage;
	private String description;
	
	
	
	
	public Toppings1DTO(Toppings1 toppings1) {
		
		this.id = toppings1.getId();
		this.toppingImage = toppings1.getToppingImage();
		this.description = toppings1.getDescription();
	}
	
	

}
