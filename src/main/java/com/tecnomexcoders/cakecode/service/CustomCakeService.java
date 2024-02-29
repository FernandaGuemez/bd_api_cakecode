package com.tecnomexcoders.cakecode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.CustomCakeDTO;
import com.tecnomexcoders.cakecode.dto.DesignDTO;
import com.tecnomexcoders.cakecode.dto.FlavorDTO;
import com.tecnomexcoders.cakecode.dto.SizeDTO;
import com.tecnomexcoders.cakecode.dto.TopperDTO;
import com.tecnomexcoders.cakecode.dto.Toppings1DTO;
import com.tecnomexcoders.cakecode.dto.Toppings2DTO;
import com.tecnomexcoders.cakecode.model.Toppings1;
import com.tecnomexcoders.cakecode.repository.CustomCakeRepository;
import com.tecnomexcoders.cakecode.repository.DesignRepository;
import com.tecnomexcoders.cakecode.repository.FlavorRepository;
import com.tecnomexcoders.cakecode.repository.SizeRepository;
import com.tecnomexcoders.cakecode.repository.TopperRepository;
import com.tecnomexcoders.cakecode.repository.Toppings1Repository;
import com.tecnomexcoders.cakecode.repository.Toppings2Repository;;

@Service
public class CustomCakeService {

    @Autowired
    private FabricCustomCakeService fabricCustomCakeService;

    @Autowired
    private CustomCakeRepository customCakeRepository;

    @Autowired
    private SizeRepository sizeRepository;
    @Autowired
    private FabricSizeService fabricSizeService;

    @Autowired
    private FabricDesignService fabricDesignService;
    @Autowired
    private DesignRepository designRepository;
    @Autowired
    private FabricFlavorService fabricFlavorService;
    @Autowired
    private FlavorRepository flavorRepository;
    @Autowired
    private FabricTopperService fabricTopperService;
    @Autowired
    private TopperRepository topperRepository;
    @Autowired
    private FabricToppings1Service fabricToppings1Service;
    @Autowired
    private Toppings1Repository toppings1Repository;
    @Autowired
    private FabricToppings2Service fabricToppings2Service;
    @Autowired
    private Toppings2Repository toppings2Repository;

    public CustomCakeDTO save(CustomCakeDTO customCakeDTO) {
        SizeDTO sizeDTO = fabricSizeService
                .createSizeDTO(sizeRepository.findById(customCakeDTO.getSize_id()).get());
        DesignDTO designDTO = fabricDesignService
                .createDesignDTO(designRepository.findById(customCakeDTO.getDesign_id()).get());
        FlavorDTO flavorDTO = fabricFlavorService
                .createFlavorDTO(flavorRepository.findById(customCakeDTO.getFlavor_id()).get());
        TopperDTO topperDTO = fabricTopperService
                .createTopperDTO(topperRepository.findById(customCakeDTO.getTopper_id()).get());
        Toppings1DTO toppings1DTO = fabricToppings1Service.createToppings1DTO(
                toppings1Repository.findById(customCakeDTO.getToppings1_id()).get());
        Toppings2DTO toppings2DTO = fabricToppings2Service.createToppings2DTO(
                toppings2Repository.findById(customCakeDTO.getToppings2_id()).get());
        customCakeDTO.setFlavorDTO(flavorDTO);
        customCakeDTO.setDesignDTO(designDTO);
        customCakeDTO.setSizeDTO(sizeDTO);
        customCakeDTO.setTopperDTO(topperDTO);
        customCakeDTO.setToppings1DTO(toppings1DTO);
        customCakeDTO.setToppings2DTO(toppings2DTO);
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
    public void deleteById(Integer id) {
        customCakeRepository.deleteById(id);
    }


}
