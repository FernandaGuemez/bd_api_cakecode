package com.tecnomexcoders.cakecode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CustomCake {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	@Column(name="customcake_id")
	private Integer id;
	@Column(name="card",length=150)
	private String card;
	
	
}
