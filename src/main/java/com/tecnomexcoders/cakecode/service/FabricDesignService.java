package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.DesignDTO;
import com.tecnomexcoders.cakecode.model.Design;

@Service
public class FabricDesignService {

    public Design createDesign(DesignDTO designDTO) {
        return new Design(designDTO);
    }

    public DesignDTO createDesignDTO(Design design) {
        return new DesignDTO(design);
    }

    public List<DesignDTO> createDesignsDTO(List<Design> designs) {
        List<DesignDTO> designsDTO = new ArrayList<>();
        designs.stream().forEach(design -> designsDTO.add(new DesignDTO(design)));
        return designsDTO;
    }

}
