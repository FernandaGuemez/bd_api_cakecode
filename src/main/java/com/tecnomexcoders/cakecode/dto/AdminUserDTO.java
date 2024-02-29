package com.tecnomexcoders.cakecode.dto;

import com.tecnomexcoders.cakecode.model.AdminUser;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminUserDTO {

	private Integer id;
	private String name;
	private String password;
	
	public AdminUserDTO(AdminUser adminuser) {
		this.id = adminuser.getId();
		this.name = adminuser.getName();
		this.password = adminuser.getPassword();
	}
	
}
