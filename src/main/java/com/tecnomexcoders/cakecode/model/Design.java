package com.tecnomexcoders.cakecode.model;

import com.tecnomexcoders.cakecode.dto.DesignDTO;
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
@Table(name = "design")
public class Design {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "design_id")
	private Integer id;
	@Column(name = "design_img", length = 150)
	private String designImage;
	@Column(length = 45)
	private String description;

	public Design(DesignDTO designDTO) {
		this.id = designDTO.getId();
		this.designImage = designDTO.getDesignImage();
		this.description = designDTO.getDescription();
	}



}
