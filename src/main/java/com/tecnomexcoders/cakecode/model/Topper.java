package com.tecnomexcoders.cakecode.model;

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
@Table(name="topper")
public class Topper {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="topper_id")
	private Integer id;
	
	@Column(name="topper", length=150)
	private String topperImage;
	
	@Column(length=45)
	private String description;

	
	
}