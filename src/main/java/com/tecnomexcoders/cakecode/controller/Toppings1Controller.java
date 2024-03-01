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
import com.tecnomexcoders.cakecode.dto.Toppings1DTO;
import com.tecnomexcoders.cakecode.service.Toppings1Service;

@RestController
@RequestMapping("api/v1/ecommerce/toppings1")
@CrossOrigin(origins = "*")
public class Toppings1Controller {

    @Autowired
    private Toppings1Service toppings1Service;

    @PostMapping("/save")
    public ResponseEntity<Toppings1DTO> save(@RequestBody Toppings1DTO toppings1DTO) {
        return new ResponseEntity<>(toppings1Service.save(toppings1DTO), HttpStatus.CREATED);
    }

    // Get all toppings1
    @GetMapping()
    public ResponseEntity<List<Toppings1DTO>> findAll() {
        return new ResponseEntity<>(toppings1Service.findAll(), HttpStatus.OK);
    }

    // Get id toppings1
    @GetMapping("/{id}")
    public ResponseEntity<Toppings1DTO> findById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(toppings1Service.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    // Delete for id
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id) {
        try {
            toppings1Service.findById(id);
            toppings1Service.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
