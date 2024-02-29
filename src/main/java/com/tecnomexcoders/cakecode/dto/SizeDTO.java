package com.tecnomexcoders.cakecode.dto;

import com.tecnomexcoders.cakecode.model.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SizeDTO {

    private Integer id;
    private String size;
    private String sizeImg;
    private Double price;

    public SizeDTO(Size size) {
        this.id = size.getId();
        this.size = size.getSize();
        this.sizeImg = size.getSizeImg();
        this.price = size.getPrice();
    }

}
