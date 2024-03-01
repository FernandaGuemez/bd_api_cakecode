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

import com.tecnomexcoders.cakecode.dto.DesignDTO;
import com.tecnomexcoders.cakecode.service.DesignService;



@RestController
@RequestMapping("api/v1/ecommerce/design")
@CrossOrigin(origins = "*")
public class DesignController {
	@Autowired
	private DesignService designService;

	@PostMapping("/save")
	public ResponseEntity<DesignDTO> save(@RequestBody DesignDTO designDTO) {
		return new ResponseEntity<>(designService.save(designDTO), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<DesignDTO>> findAll() {
		return new ResponseEntity<>(designService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<DesignDTO> findById(@PathVariable Integer id) {
		try {
			return new ResponseEntity<>(designService.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		try {
			designService.findById(id);
			designService.deleteById(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}

}
