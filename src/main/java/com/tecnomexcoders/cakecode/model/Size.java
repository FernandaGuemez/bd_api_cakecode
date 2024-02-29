package com.tecnomexcoders.cakecode.model;

import com.tecnomexcoders.cakecode.dto.SizeDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id")
    private Integer id;

    @Column(length = 45)
    private String size;

    @Column(name = "size_img", length = 150)
    private String sizeImg;

    private Double price;


    public Size(SizeDTO sizeDTO) {
        this.id = sizeDTO.getId();
        this.size = sizeDTO.getSize();
        this.sizeImg = sizeDTO.getSizeImg();
        this.price = sizeDTO.getPrice();
    }


}


