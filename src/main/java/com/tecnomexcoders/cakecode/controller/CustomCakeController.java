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
import com.tecnomexcoders.cakecode.dto.CustomCakeDTO;
import com.tecnomexcoders.cakecode.service.CustomCakeService;


@RestController
@RequestMapping("/api/v1/ecommerce/customcake")
@CrossOrigin(origins = "*")
public class CustomCakeController {

    @Autowired
    private CustomCakeService customCakeService;


    @PostMapping("/save")
    public ResponseEntity<CustomCakeDTO> save(@RequestBody CustomCakeDTO customCakeDTO) {
        try {
            return new ResponseEntity<>(customCakeService.save(customCakeDTO), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Get All customCake
    @GetMapping()
    public ResponseEntity<List<CustomCakeDTO>> findAll() {
        return new ResponseEntity<>(customCakeService.findAll(), HttpStatus.OK);
    }

    // Get id customCake
    @GetMapping("/{id}")
    public ResponseEntity<CustomCakeDTO> findById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(customCakeService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete for id customCake
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id) {
        try {
            customCakeService.findById(id);
            customCakeService.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
