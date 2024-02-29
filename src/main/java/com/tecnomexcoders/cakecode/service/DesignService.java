package com.tecnomexcoders.cakecode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.DesignDTO;
import com.tecnomexcoders.cakecode.repository.DesignRepository;

@Service
public class DesignService {

    @Autowired
    private FabricDesignService fabricDesignService;

    @Autowired
    private DesignRepository designRepository;

    // Guardar un design
    public DesignDTO save(DesignDTO designDTO) {
        return fabricDesignService.createDesignDTO(
                designRepository.save(fabricDesignService.createDesign(designDTO)));
    }

    // finAll design
    public List<DesignDTO> findAll() {
        return fabricDesignService.createDesignsDTO(designRepository.findAll());
    }

    // find design by id
    public DesignDTO findById(Integer id) {
        return fabricDesignService.createDesignDTO(designRepository.findById(id).get());
    }

    // Delete design by id
    public void deleteById(Integer id) {
        designRepository.deleteById(id);
    }

}
