package com.tecnomexcoders.cakecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.OrderDTO;

import com.tecnomexcoders.cakecode.repository.OrderRepository;


@Service
public class OrderService {
	@Autowired
	private FabricOrderService fabricOrderService;
	
	@Autowired
	private OrderRepository orderRepository;
	
	//save user
	public OrderDTO save(OrderDTO orderDTO) {
		return fabricOrderService.crearOrderDTO(orderRepository.save(fabricOrderService.crearOrder(orderDTO)));
	}
	
	//Nos devuelve todos los users
	public List<OrderDTO>findAll(){
		return fabricOrderService.crearOrdersDTO(orderRepository.findAll());
	}
	
	 // Encontrar por ID
    public OrderDTO findById(Integer id) {
        return fabricOrderService.crearOrderDTO(orderRepository.findById(id).get());
    }


    // Delete
    public void deleteById(Integer id) {
        orderRepository.deleteById(id);
    }
}
