package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.CustomCakeDTO;
import com.tecnomexcoders.cakecode.dto.OrderDTO;
import com.tecnomexcoders.cakecode.dto.ProductDTO;
import com.tecnomexcoders.cakecode.dto.UserDTO;
import com.tecnomexcoders.cakecode.repository.CustomCakeRepository;
import com.tecnomexcoders.cakecode.repository.OrderRepository;
import com.tecnomexcoders.cakecode.repository.ProductRepository;
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

	@Autowired
	private FabricProductService fabricProductService;

	@Autowired
	private ProductRepository productRepository;


	@Autowired
	private FabricCustomCakeService fabricCustomCakeService;

	@Autowired
	private CustomCakeRepository customCakeRepository;

	// save order
	public OrderDTO save(OrderDTO orderDTO) {
		UserDTO userDTO = fabricUserService
				.crearUserDTO(userRepository.findById(orderDTO.getUser_id()).get());
		orderDTO.setUserDTO(userDTO);

		// todos los productos de la orden
		List<ProductDTO> listProductDTO = new ArrayList<>();
		orderDTO.getProducts_id().stream().forEach(id -> listProductDTO
				.add(fabricProductService.createProductDTO(productRepository.findById(id).get())));
		orderDTO.setListProductDTO(listProductDTO);

		// guardamos todos los custom cake de la orden
		List<CustomCakeDTO> listCustomCakesDTO = new ArrayList<>();
		orderDTO.getCustomCakes_id().stream()
				.forEach(id -> listCustomCakesDTO.add(fabricCustomCakeService
						.createCustomCakeDTO(customCakeRepository.findById(id).get())));
		orderDTO.setListCustomCakeDTO(listCustomCakesDTO);

		return fabricOrderService
				.crearOrderDTO(orderRepository.save(fabricOrderService.crearOrder(orderDTO)));
	}


	// Nos devuelve todas las ordenes
	public List<OrderDTO> findAll() {
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
