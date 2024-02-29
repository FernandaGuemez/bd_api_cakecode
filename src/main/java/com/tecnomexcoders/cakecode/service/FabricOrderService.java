package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.tecnomexcoders.cakecode.dto.OrderDTO;

import com.tecnomexcoders.cakecode.model.Order;

@Service
public class FabricOrderService {
	
	public Order crearOrder(OrderDTO orderDTO) {
		return new Order(orderDTO);
	}
	
	public OrderDTO crearOrderDTO(Order order) {
		return new OrderDTO(order);
	}
	
	public List<OrderDTO> crearOrdersDTO(List<Order> listOrders){
		List<OrderDTO> listOrdersDTO = new ArrayList<>();
		listOrders.stream().forEach(order-> listOrdersDTO.add(crearOrderDTO(order)));
		return listOrdersDTO;
	}

}
