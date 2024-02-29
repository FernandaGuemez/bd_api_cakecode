package com.tecnomexcoders.cakecode.dto;
import com.tecnomexcoders.cakecode.model.User;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class UserDTO {
	private Integer id;
	private String name;
	private String lastName;
	private String address1;
	private String password;
	private String phoneNumber;
	private String email;
	private String payment;
	private String address2;
	
	
	public UserDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.lastName = user.getLastName();
		this.address1 = user.getAddress1();
		this.password = user.getPassword();
		this.phoneNumber = user.getPhoneNumber();
		this.email = user.getEmail();
		this.payment = user.getPayment();
		this.address2 = user.getAddress2();
	}
	
	
	
	

}
