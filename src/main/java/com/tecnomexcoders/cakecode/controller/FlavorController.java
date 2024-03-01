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

import com.tecnomexcoders.cakecode.dto.FlavorDTO;
import com.tecnomexcoders.cakecode.service.FlavorService;

@RestController
@RequestMapping("api/v1/ecommerce/flavor")
@CrossOrigin(origins = "*")
public class FlavorController {

	@Autowired
	private FlavorService flavorService;

	@PostMapping("/save")
	public ResponseEntity<FlavorDTO> save(@RequestBody FlavorDTO flavorDTO) {
		return new ResponseEntity<>(flavorService.save(flavorDTO), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<FlavorDTO>> findAll() {
		return new ResponseEntity<>(flavorService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<FlavorDTO> findById(@PathVariable Integer id) {
		try {
			return new ResponseEntity<>(flavorService.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		try {
			flavorService.findById(id);
			flavorService.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}

