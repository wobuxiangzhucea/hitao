package com.hzit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopAdminRole;
import com.hzit.service.AdminRoleService;
import com.utils.ServerResponse;

@Controller
public class AdminRoleController {
	/**
	 * 自动注入AdminRoleService实例
	 */
	@Autowired
	private AdminRoleService adminRoleService;
	
	/**
	 * 为管理员授予角色
	 * @param adminRole
	 * @return
	 */
	@GetMapping("/addAdminRole")
	@ResponseBody
	public ServerResponse<Integer> addAdminRole(ShopAdminRole adminRole){
		return adminRoleService.addAdminRole(adminRole);
	}
}
