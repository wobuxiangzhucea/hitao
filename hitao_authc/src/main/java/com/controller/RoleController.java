package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopRole;
import com.service.RoleService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Controller
public class RoleController {
	/**
	 * 自动注入RoleService实例
	 */
	@Autowired
	private RoleService roleService;
	
	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	@GetMapping("/addRole")
	@ResponseBody
	public ServerResponse<Integer> addRole(ShopRole role) {
		return roleService.addRole(role);
	}
	
	/**
	 * 逻辑删除角色
	 * @param roleId
	 * @param isDel
	 * @return
	 */
	@GetMapping("/tombRole")
	@ResponseBody
	public ServerResponse<Integer> tombRole(int roleId,int isDel){
		Map<String, Object> map = new HashMap<>();
		map.put("roleId", roleId);
		map.put("isDel", isDel);
		return roleService.tombRole(map);
	}
	
	/**
	 * 删除角色
	 * @param roleId
	 * @return
	 */
	@GetMapping("/delRole")
	@ResponseBody
	public ServerResponse<Integer> delRole(int roleId){
		return roleService.delRole(roleId);
	}
	
	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	@GetMapping("/updateRole")
	@ResponseBody
	public ServerResponse<Integer> updateRole(ShopRole role){
		return roleService.updateRole(role);
	}
	/**
	 * 分页查询全部角色/根据角色id查询角色/根据角色名查询角色
	 * @param page
	 * @param limit
	 * @param roleId
	 * @param roleName
	 * @return
	 */
	@GetMapping("/findRole")
	@ResponseBody
	public ServerResponse<PageUtil<List<ShopRole>>> findRole(int page,int limit,int roleId,String roleName){
		return roleService.page(page, limit, roleId, roleName);
	}
}
