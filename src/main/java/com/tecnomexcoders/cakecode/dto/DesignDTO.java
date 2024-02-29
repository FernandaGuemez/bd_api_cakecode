package com.tecnomexcoders.cakecode.dto;

import com.tecnomexcoders.cakecode.model.Design;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DesignDTO {
	private Integer id;
	private String designImage;
	private String description;
	
	public DesignDTO(Design design){
		this.id = design.getId();
		this.designImage = design.getDesignImage();
		this.description = design.getDescription();
		
	}
}
