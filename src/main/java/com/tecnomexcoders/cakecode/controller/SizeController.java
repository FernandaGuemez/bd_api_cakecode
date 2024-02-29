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
import com.tecnomexcoders.cakecode.dto.SizeDTO;
import com.tecnomexcoders.cakecode.service.SizeService;



@RestController
@RequestMapping("api/v1/ecommerce/size")
@CrossOrigin(origins = "*")
public class SizeController {

	@Autowired
	private SizeService sizeService;

	@PostMapping("/save")
	public ResponseEntity<SizeDTO> save(@RequestBody SizeDTO sizeDTO) {
		return new ResponseEntity<>(sizeService.save(sizeDTO), HttpStatus.CREATED);
	}

	@GetMapping()
	public ResponseEntity<List<SizeDTO>> findAll() {
		return new ResponseEntity<>(sizeService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<SizeDTO> findById(@PathVariable Integer id) {
		try {
			return new ResponseEntity<>(sizeService.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		try {
			sizeService.findById(id);
			sizeService.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
