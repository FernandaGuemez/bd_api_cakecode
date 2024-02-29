package com.tecnomexcoders.cakecode.dto;

import com.tecnomexcoders.cakecode.model.Topper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TopperDTO {
	private Integer id;
	private String topperImage;
	private String description;

	public TopperDTO(Topper topper) {
		this.id = topper.getId();
		this.topperImage = topper.getTopperImage();
		this.description = topper.getDescription();
	}


}
