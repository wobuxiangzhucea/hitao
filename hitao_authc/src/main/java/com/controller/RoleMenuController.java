package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopRoleMenu;
import com.service.RoleMenuService;
import com.utils.ServerResponse;

@Controller
public class RoleMenuController {
	/**
	 * 自动注入RoleMenuService实例
	 */
	@Autowired
	private RoleMenuService roleMenuService;
	
	/**
	 * 为角色授予权限
	 * @param roleMenu
	 * @return
	 */
	@GetMapping("/addRoleMenu")
	@ResponseBody
	public ServerResponse<Integer> addRoleMenu(ShopRoleMenu roleMenu){
		return roleMenuService.addRoleMenu(roleMenu);
	}
}
