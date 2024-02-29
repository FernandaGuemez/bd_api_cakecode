package com.tecnomexcoders.cakecode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.AdminUserDTO;
import com.tecnomexcoders.cakecode.dto.ProductDTO;
import com.tecnomexcoders.cakecode.dto.SizeDTO;
import com.tecnomexcoders.cakecode.repository.AdminUserRepository;
import com.tecnomexcoders.cakecode.repository.ProductRepository;
import com.tecnomexcoders.cakecode.repository.Toppings2Repository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private FabricProductService fabricProductService;
	@Autowired
    private FabricAdminUserService fabricAdminUserService;
    @Autowired
    private AdminUserRepository adminUserRepository;
	
	//Guarda un product
	public ProductDTO save(ProductDTO productDTO) {
		 AdminUserDTO adminUserDTO = fabricAdminUserService
	                .createAdminUserDTO(adminUserRepository.findById(productDTO.getAdminuser_id()).get());
		 productDTO.setAdminUserDTO(adminUserDTO);
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
