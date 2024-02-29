package com.tecnomexcoders.cakecode.dto;
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
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.address1 = address1;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.payment = payment;
		this.address2 = address2;
	}
	
	
	
	

}
