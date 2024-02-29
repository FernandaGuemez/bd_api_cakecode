package com.tecnomexcoders.cakecode.model;

import com.tecnomexcoders.cakecode.dto.OrderDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="order")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private Integer id;
	
	@ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

	public Order(OrderDTO orderDTO) {
		this.id = orderDTO.getId();
		this.user = new User(orderDTO.getUserDTO());
	}

	
}
