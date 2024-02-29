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
import com.tecnomexcoders.cakecode.dto.TopperDTO;
import com.tecnomexcoders.cakecode.service.TopperService;

@RestController
@RequestMapping("api/v1/ecommerce/topper")
@CrossOrigin(origins = "*")
public class TopperController {

	@Autowired
	private TopperService topperService;

	@PostMapping("/save")
	public ResponseEntity<TopperDTO> save(@RequestBody TopperDTO topperDTO) {
		return new ResponseEntity<>(topperService.save(topperDTO), HttpStatus.CREATED);
	}

	@GetMapping()
	public ResponseEntity<List<TopperDTO>> findAll() {
		return new ResponseEntity<>(topperService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<TopperDTO> findById(@PathVariable Integer id) {
		try {
			return new ResponseEntity<>(topperService.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		try {
			topperService.findById(id);
			topperService.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
