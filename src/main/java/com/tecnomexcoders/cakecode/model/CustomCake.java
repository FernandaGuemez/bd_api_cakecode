package com.tecnomexcoders.cakecode.model;

import com.tecnomexcoders.cakecode.dto.CustomCakeDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="customcake")
public class CustomCake {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	@Column(name="customcake_id")
	private Integer id;
	@Column(name="card",length=150)
	private String card;
	
	@ManyToOne
	@JoinColumn(name="fk_size_id")
	private Size size;
	@ManyToOne
	@JoinColumn(name="fk_flavor_id")
	private Flavor flavor;
	@ManyToOne
	@JoinColumn(name="fk_toppings1_id")
	private Toppings1 toppings1;
	@ManyToOne
	@JoinColumn(name="fk_toppings2_id")
	private Toppings2 toppings2;
	@ManyToOne
	@JoinColumn(name="fk_topper_id")
	private Topper topper;
	@ManyToOne
	@JoinColumn(name="fk_design_id")
	private Design design;
	
	public CustomCake(CustomCakeDTO customCakeDTO) {
		
		this.id = customCakeDTO.getId();
		this.card = customCakeDTO.getCard();
		this.size = new Size(customCakeDTO.getSizeDTO());
		this.flavor = new Flavor(customCakeDTO.getFlavorDTO());
		this.toppings1 = new Toppings1(customCakeDTO.getToppings1DTO());
		this.toppings2 = new Toppings2(customCakeDTO.getToppings2DTO());
		this.topper = new Topper(customCakeDTO.getTopperDTO());
		this.design = new Design(customCakeDTO.getDesignDTO());
	}
	
	
	
	
	
	
}
