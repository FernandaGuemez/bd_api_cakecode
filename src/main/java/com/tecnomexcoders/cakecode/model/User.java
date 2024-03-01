package com.tecnomexcoders.cakecode.model;

import com.tecnomexcoders.cakecode.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;

	@Column(length = 45)
	private String name;

	@Column(name = "last_name", length = 45)
	private String lastName;

	@Column(length = 250)
	private String address1;

	@Column(name = "password", length = 45)
	private String password;

	@Column(name = "phone_number", length = 45)
	private String phoneNumber;

	@Column(length = 45)
	private String email;

	@Column(length = 45)
	private String payment;

	@Column(length = 250)
	private String address2;

	public User(UserDTO userDTO) {
		this.id = userDTO.getId();
		this.name = userDTO.getName();
		this.lastName = userDTO.getLastName();
		this.address1 = userDTO.getAddress1();
		this.password = userDTO.getPassword();
		this.phoneNumber = userDTO.getPhoneNumber();
		this.email = userDTO.getEmail();
		this.payment = userDTO.getPayment();
		this.address2 = userDTO.getAddress2();
	}
}
