package com.tecnomexcoders.cakecode.dto;

import java.util.ArrayList;
import java.util.List;
import com.tecnomexcoders.cakecode.model.Order;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderDTO {

	private Integer id;
	private UserDTO userDTO;
	private Integer user_id;

	// ManyToMany con productos
	private List<ProductDTO> listProductDTO;
	private List<Integer> products_id;


	// ManyToMany con customCake
	private List<CustomCakeDTO> listCustomCakeDTO;
	private List<Integer> customCakes_id;

	public OrderDTO(Order order) {
		this.id = order.getId();
		this.userDTO = new UserDTO(order.getUser());
		this.listProductDTO = new ArrayList<>();

		order.getOrdersOfProducts()
				.forEach(orderOfProduct -> listProductDTO.add(new ProductDTO(orderOfProduct)));

		this.listCustomCakeDTO = new ArrayList<>();
		order.getOrdersOfCustomCakes().forEach(
				orderOfCustomCake -> listCustomCakeDTO.add(new CustomCakeDTO(orderOfCustomCake)));
	}


}
