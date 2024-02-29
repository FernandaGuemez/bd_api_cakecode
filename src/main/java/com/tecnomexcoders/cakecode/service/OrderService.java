package com.tecnomexcoders.cakecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.OrderDTO;
import com.tecnomexcoders.cakecode.dto.UserDTO;
import com.tecnomexcoders.cakecode.repository.OrderRepository;
import com.tecnomexcoders.cakecode.repository.UserRepository;


@Service
public class OrderService {
	@Autowired
	private FabricOrderService fabricOrderService;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private FabricUserService fabricUserService;
	
	@Autowired
	private UserRepository userRepository;
	
	//save order
	public OrderDTO save(OrderDTO orderDTO) {
		UserDTO userDTO= fabricUserService
				.crearUserDTO(userRepository.findById(orderDTO.getUser_id()).get());
		orderDTO.setUserDTO(userDTO);
		return fabricOrderService.crearOrderDTO(orderRepository.save(fabricOrderService.crearOrder(orderDTO)));
	}
	
	//Nos devuelve todas las ordenes
	public List<OrderDTO> findAll(){
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
