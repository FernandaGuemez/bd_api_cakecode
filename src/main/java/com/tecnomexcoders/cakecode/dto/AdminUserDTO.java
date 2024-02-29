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
	
	public AdminUserDTO(AdminUser adminUser) {
		this.id = adminUser.getId();
		this.name = adminUser.getName();
		this.password = adminUser.getPassword();
	}
	
}
