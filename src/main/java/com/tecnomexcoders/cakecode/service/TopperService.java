package com.tecnomexcoders.cakecode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.TopperDTO;
import com.tecnomexcoders.cakecode.repository.TopperRepository;

@Service
public class TopperService {

    @Autowired
    private FabricTopperService fabricTopperService;

    @Autowired
    private TopperRepository topperRepository;

    // Guardar un topper
    public TopperDTO save(TopperDTO topperDTO) {
        return fabricTopperService.createTopperDTO(
                topperRepository.save(fabricTopperService.createTopper(topperDTO)));
    }

    // finAll topper
    public List<TopperDTO> findAll() {
        return fabricTopperService.createToppersDTO(topperRepository.findAll());
    }

    // find topper by id
    public TopperDTO findById(Integer id) {
        return fabricTopperService.createTopperDTO(topperRepository.findById(id).get());
    }

    // Delete topper by id
    public void delete(Integer id) {
        topperRepository.deleteById(id);
    }

}
