package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.TopperDTO;
import com.tecnomexcoders.cakecode.model.Topper;

@Service
public class FabricTopperService {

    public Topper createTopper(TopperDTO topperDTO) {
        return new Topper(topperDTO);
    }

    public TopperDTO createTopperDTO(Topper topper) {
        return new TopperDTO(topper);
    }

    public List<TopperDTO> createToppersDTO(List<Topper> toppers) {
        List<TopperDTO> toppersDTO = new ArrayList<>();
        toppers.forEach(topper -> toppersDTO.add(new TopperDTO(topper)));
        return toppersDTO;
    }

}
