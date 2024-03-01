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
import com.tecnomexcoders.cakecode.dto.Toppings2DTO;
import com.tecnomexcoders.cakecode.service.Toppings2Service;

@RestController
@RequestMapping("api/v1/ecommerce/toppings2")
@CrossOrigin(origins = "*")
public class Toppings2Controller {

	@Autowired
	private Toppings2Service toppings2Service;

	@PostMapping("/save")
	public ResponseEntity<Toppings2DTO> save(@RequestBody Toppings2DTO toppings2DTO) {
		return new ResponseEntity<>(toppings2Service.save(toppings2DTO), HttpStatus.CREATED);
	}

	@GetMapping()
	public ResponseEntity<List<Toppings2DTO>> findAll() {
		return new ResponseEntity<>(toppings2Service.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Toppings2DTO> findById(@PathVariable Integer id) {
		try {
			return new ResponseEntity<>(toppings2Service.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		try {
			toppings2Service.findById(id);
			toppings2Service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
