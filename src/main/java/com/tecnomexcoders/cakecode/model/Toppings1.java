package com.tecnomexcoders.cakecode.model;


import com.tecnomexcoders.cakecode.dto.Toppings1DTO;

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
@Table(name = "toppings1")

public class Toppings1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "toppings1_id")
	private Integer id;

	@Column(name = "topping_img", length = 150)
	private String toppingImage;


	@Column(length = 45)
	private String description;


	public Toppings1(Toppings1DTO toppings1DTO) {
		this.id = toppings1DTO.getId();
		this.toppingImage = toppings1DTO.getToppingImage();
		this.description = toppings1DTO.getDescription();
	}
}
