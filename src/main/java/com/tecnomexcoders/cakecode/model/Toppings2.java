package com.tecnomexcoders.cakecode.model;

import com.tecnomexcoders.cakecode.dto.Toppings2DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="toppings2")
public class Toppings2 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="toppings2_id")
	private Integer id;
	
	@Column(name="topping_img",length=150)
	private String toppingImage;
	
	@Column(length=45)
	private String description;

	public Toppings2(Toppings2DTO toppings2DTO) {
		
		this.id = toppings2DTO.getId();
		this.toppingImage = toppings2DTO.getToppingImage();
		this.description = toppings2DTO.getDescription();
	}
	
	
	
}
