package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.SizeDTO;
import com.tecnomexcoders.cakecode.model.Size;

@Service
public class FabricSizeService {

    public Size createSize(SizeDTO sizeDTO) {
        return new Size(sizeDTO);
    }

    public SizeDTO createSizeDTO(Size size) {
        return new SizeDTO(size);
    }

    public List<SizeDTO> createSizesDTO(List<Size> sizes) {
        List<SizeDTO> sizesDTO = new ArrayList<>();
        sizes.stream().forEach(size -> sizesDTO.add(new SizeDTO(size)));
        return sizesDTO;
    }
}
