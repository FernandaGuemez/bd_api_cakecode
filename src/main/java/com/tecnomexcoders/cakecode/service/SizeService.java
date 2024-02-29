package com.tecnomexcoders.cakecode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.SizeDTO;
import com.tecnomexcoders.cakecode.repository.SizeRepository;

@Service
public class SizeService {

    @Autowired
    private SizeRepository sizeRepository;

    @Autowired
    private FabricSizeService fabricSizeService;

    // Guardar un size
    public SizeDTO save(SizeDTO sizeDTO) {
        return fabricSizeService
                .createSizeDTO(sizeRepository.save(fabricSizeService.createSize(sizeDTO)));
    }

    // finAll size
    public List<SizeDTO> findAll() {
        return fabricSizeService.createSizesDTO(sizeRepository.findAll());
    }

    // find size by id
    public SizeDTO findById(Integer id) {
        return fabricSizeService.createSizeDTO(sizeRepository.findById(id).get());
    }

    // Delete size by id
    public void delete(Integer id) {
        sizeRepository.deleteById(id);
    }
}
