package com.tecnomexcoders.cakecode.dto;

import com.tecnomexcoders.cakecode.model.Toppings2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Toppings2DTO {
	private Integer id;
	private String toppingImage;
	private String description;

	public Toppings2DTO(Toppings2 toppings2) {
		super();
		this.id = toppings2.getId();
		this.toppingImage = toppings2.getToppingImage();
		this.description = toppings2.getDescription();
	}
}
