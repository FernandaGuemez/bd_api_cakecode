package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.ProductDTO;
import com.tecnomexcoders.cakecode.model.Product;

@Service
public class FabricProductService {
	
	public Product createProduct(ProductDTO productDTO) {
		return new Product(productDTO);
	}

	public ProductDTO createProductDTO(Product product) {
		return new ProductDTO(product);
	}
public List<ProductDTO> createProductsDTO(List<Product> products) {
	List<ProductDTO> productsDTO = new ArrayList<>();
	products.stream().forEach(product -> productsDTO.add(new ProductDTO(product)));
return productsDTO;
}
}
