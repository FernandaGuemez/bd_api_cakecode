package com.tecnomexcoders.cakecode.model;

import com.tecnomexcoders.cakecode.dto.FlavorDTO;

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
@Table(name = "flavor")
public class Flavor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flavor_id")
	private Integer id;
	
	@Column(length = 100)	
	private String flavor;

	public Flavor(FlavorDTO flavorDTO) {
		super();
		this.id = flavorDTO.getId();
		this.flavor = flavorDTO.getFlavor();
	}
	
	

}
