package com.tecnomexcoders.cakecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnomexcoders.cakecode.dto.AdminUserDTO;
import com.tecnomexcoders.cakecode.repository.AdminUserRepository;

@Service
public class AdminUserService {

	@Autowired
	private AdminUserRepository adminUserRepository;

	@Autowired
	private FabricAdminUserService fabricAdminUserService;

	public AdminUserDTO save(AdminUserDTO adminUserDTO) {
		return fabricAdminUserService.createAdminUserDTO(
				adminUserRepository.save(fabricAdminUserService.createAdminUser(adminUserDTO)));
	}

	public List<AdminUserDTO> findAll() {
		return fabricAdminUserService.createAdminUsersDTO(adminUserRepository.findAll());
	}

	public AdminUserDTO findById(Integer id) {
		return fabricAdminUserService.createAdminUserDTO(adminUserRepository.findById(id).get());
	}

	public void deleteById(Integer id) {
		adminUserRepository.deleteById(id);
	}

}


