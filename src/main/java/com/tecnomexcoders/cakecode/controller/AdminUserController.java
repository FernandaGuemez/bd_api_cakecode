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

import com.tecnomexcoders.cakecode.dto.AdminUserDTO;
import com.tecnomexcoders.cakecode.service.AdminUserService;

@RestController
@RequestMapping("api/v1/ecommerce/adminuser")
@CrossOrigin(origins = "*")
public class AdminUserController {

	@Autowired
	private AdminUserService adminUserService;

	@PostMapping("/save")
	public ResponseEntity<AdminUserDTO> save(@RequestBody AdminUserDTO adminUserDTO) {
		return new ResponseEntity<>(adminUserService.save(adminUserDTO), HttpStatus.CREATED);
	}

	@GetMapping()
	public ResponseEntity<List<AdminUserDTO>> findAll() {
		return new ResponseEntity<>(adminUserService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<AdminUserDTO> findById(@PathVariable Integer id) {
		try {
			return new ResponseEntity<>(adminUserService.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		try {
			adminUserService.findById(id);
			adminUserService.deleteById(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}


}
