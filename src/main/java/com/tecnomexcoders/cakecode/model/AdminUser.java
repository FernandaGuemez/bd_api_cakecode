package com.tecnomexcoders.cakecode.model;

import com.tecnomexcoders.cakecode.dto.AdminUserDTO;

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
@Table(name="adminuser")
public class AdminUser {
	
	@Id
	@Column(name="adminuser_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Integer id;
	@Column(length = 45)
	private String name;
	@Column(length = 45)
	private String password;
	
	
	public AdminUser(AdminUserDTO adminUserDTO) {
		this.id = adminUserDTO.getId();
		this.name = adminUserDTO.getName();
		this.password = adminUserDTO.getPassword();
	}
	
	
}
