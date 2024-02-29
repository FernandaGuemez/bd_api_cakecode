package com.tecnomexcoders.cakecode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.ProductDTO;
import com.tecnomexcoders.cakecode.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private FabricProductService fabricProductService;
	
	//Guarda un product
	public ProductDTO save(ProductDTO productDTO) {
		return fabricProductService
				.createProductDTO(productRepository.save(fabricProductService.createProduct(productDTO)));
		
	}
	
	//final product
	public List<ProductDTO> findAll(){
		return fabricProductService.createProductsDTO(productRepository.findAll());
	}
	
	//final product by id
	public ProductDTO findById(Integer id) {
		return fabricProductService.createProductDTO(productRepository.findById(id).get());
	}
// delete product by id
	public void delete (Integer id) {
		productRepository.deleteById(id);
	}
}
