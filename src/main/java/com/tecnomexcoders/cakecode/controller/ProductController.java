package com.tecnomexcoders.cakecode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnomexcoders.cakecode.dto.ProductDTO;
import com.tecnomexcoders.cakecode.service.ProductService;

@RestController
@RequestMapping("api/v1/ecommerce/products")
@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/save")
	public ResponseEntity<ProductDTO> save(@RequestBody ProductDTO productDTO) {
		return new ResponseEntity<>(productService.save(productDTO), HttpStatus.CREATED);
	}

	@GetMapping()
	public ResponseEntity<List<ProductDTO>> findAll() {
		return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProductDTO> findById(@PathVariable Integer id) {
		try {
			return new ResponseEntity<>(productService.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		try {
			productService.findById(id);
			productService.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
