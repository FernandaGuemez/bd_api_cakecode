package com.tecnomexcoders.cakecode.dto;

import com.tecnomexcoders.cakecode.model.Order;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderDTO {

	private Integer id;
    private UserDTO userDTO;
    
	public OrderDTO(Order order) {
		this.id = order.getId();
		this.userDTO = new UserDTO(order.getUser());
	}
	
    
}
