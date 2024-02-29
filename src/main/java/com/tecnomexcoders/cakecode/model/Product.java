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
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "products_id")
	private Integer id;
	
	@Column(length = 45)	
	private String flavor;
	
	@Column(length = 45)
	private String type;
	
	private Integer price;
	private Integer stock;
	
	@Column(length = 150)
	private String description;
	
	@Column(name = "image", length = 150)
	private String productsImg;
	
	@Column(length = 45)
	private String size;
	
	@Column(length = 45)
	private String name;
	
	
	@ManyToOne
    @JoinColumn(name = "fk_adminuser_id")
    private AdminUser adminUser;
		

}
