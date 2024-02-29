package com.tecnomexcoders.cakecode.dto;

import com.tecnomexcoders.cakecode.model.CustomCake;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomCakeDTO {

	private Integer id;
	private String card;
	private FlavorDTO flavorDTO;
	private SizeDTO sizeDTO;
	private TopperDTO topperDTO;
	private Toppings1DTO toppings1DTO;
	private Toppings2DTO toppings2DTO;
	private DesignDTO designDTO;
	private Integer flavor_id;
	private Integer size_id;
	private Integer topper_id;
	private Integer toppings1_id;
	private Integer toppings2_id;
	private Integer design_id;


	public CustomCakeDTO(CustomCake customCake) {
		
		this.id = customCake.getId();
		this.card = customCake.getCard();
		this.flavorDTO = new FlavorDTO(customCake.getFlavor());
		this.sizeDTO = new SizeDTO(customCake.getSize());
		this.topperDTO = new TopperDTO(customCake.getTopper());
		this.toppings1DTO = new Toppings1DTO(customCake.getToppings1());
		this.toppings2DTO = new Toppings2DTO(customCake.getToppings2());
		this.designDTO = new DesignDTO(customCake.getDesign());

	}

	


}
