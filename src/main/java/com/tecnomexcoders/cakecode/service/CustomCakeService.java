package com.tecnomexcoders.cakecode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.CustomCakeDTO;
import com.tecnomexcoders.cakecode.repository.CustomCakeRepository;;

@Service
public class CustomCakeService {

    @Autowired
    private FabricCustomCakeService fabricCustomCakeService;

    @Autowired
    private CustomCakeRepository customCakeRepository;

    // Guardar un customcake
    public CustomCakeDTO save(CustomCakeDTO customCakeDTO) {
        return fabricCustomCakeService.createCustomCakeDTO(
                customCakeRepository.save(fabricCustomCakeService.createCustomCake(customCakeDTO)));
    }

    // finAll customcake
    public List<CustomCakeDTO> findAll() {
        return fabricCustomCakeService.createCustomCakesDTO(customCakeRepository.findAll());
    }

    // find customcake by id
    public CustomCakeDTO findById(Integer id) {
        return fabricCustomCakeService.createCustomCakeDTO(customCakeRepository.findById(id).get());
    }

    // Delete customcake by id
    public void delete(Integer id) {
        customCakeRepository.deleteById(id);
    }


}
