package com.tecnomexcoders.cakecode.model;

import java.util.ArrayList;
import java.util.List;
import com.tecnomexcoders.cakecode.dto.OrderDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "orders")
public class Order {

	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "fk_user_id")
	private User user;

	@ManyToMany(mappedBy = "productsOfOrders")
	private List<Product> ordersOfProducts;

	@ManyToMany(mappedBy = "customCakeOfOrders")
	private List<CustomCake> ordersOfCustomCakes;

	public Order(OrderDTO orderDTO) {
		this.id = orderDTO.getId();
		this.user = new User(orderDTO.getUserDTO());
		this.ordersOfProducts = new ArrayList<>();
		orderDTO.getListProductDTO()
				.forEach(orderOfProductDTO -> ordersOfProducts.add(new Product(orderOfProductDTO)));

		this.ordersOfCustomCakes = new ArrayList<>();
		orderDTO.getListCustomCakeDTO().forEach(orderOfCustomCakeDTO -> ordersOfCustomCakes
				.add(new CustomCake(orderOfCustomCakeDTO)));
	}



}
