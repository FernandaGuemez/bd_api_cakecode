package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.CustomCakeDTO;
import com.tecnomexcoders.cakecode.model.CustomCake;


@Service
public class FabricCustomCakeService {

    public CustomCake createCustomCake(CustomCakeDTO customCakeDTO) {
        return new CustomCake(customCakeDTO);
    }

    public CustomCakeDTO createCustomCakeDTO(CustomCake customCake) {
        return new CustomCakeDTO(customCake);
    }

    public List<CustomCakeDTO> createCustomCakesDTO(List<CustomCake> customCakes) {
        List<CustomCakeDTO> customCakesDTO = new ArrayList<>();
        customCakes.forEach(customCake -> customCakesDTO.add(new CustomCakeDTO(customCake)));
        return customCakesDTO;
    }

}
