package com.tecnomexcoders.cakecode.dto;


import com.tecnomexcoders.cakecode.model.Product;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class ProductDTO {
	private Integer id;
	private String flavor;
	private String type;
	private Integer price;
	private Integer stock;
	private String description;
	private String productsImg;
	private String size;
	private String name;
	
	
	public ProductDTO(Product product) {
		this.id = product.getId();
		this.flavor = product.getFlavor();
		this.type = product.getType();
		this.price = product.getPrice();
		this.stock = product.getStock();
		this.description = product.getDescription();
		this.productsImg = product.getProductsImg();
		this.size = product.getSize();
		this.name = product.getName();
	
	}
}