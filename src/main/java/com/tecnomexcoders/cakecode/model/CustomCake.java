package com.tecnomexcoders.cakecode.model;

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
	
	
	
}
