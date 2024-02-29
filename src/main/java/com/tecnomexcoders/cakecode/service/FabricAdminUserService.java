package com.tecnomexcoders.cakecode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.tecnomexcoders.cakecode.dto.AdminUserDTO;
import com.tecnomexcoders.cakecode.model.AdminUser;


@Service
public class FabricAdminUserService {
	
	public AdminUser createAdminUser(AdminUserDTO adminUserDTO) {
		return new AdminUser(adminUserDTO);
	}
	
	public AdminUserDTO createAdminUserDTO(AdminUser adminUser) {
		return new AdminUserDTO(adminUser);
	}
	
	public List<AdminUserDTO> createAdminUsersDTO(List<AdminUser> adminUsers) {
        List<AdminUserDTO> adminUsersDTO = new ArrayList<>();
        adminUsers.forEach(adminUser -> adminUsersDTO.add(new AdminUserDTO(adminUser)));
        return adminUsersDTO;
    }
}
