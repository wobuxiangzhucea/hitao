package com.service;

import java.util.List;
import java.util.Map;

import com.entity.ShopRole;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface RoleService {
	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	public ServerResponse<Integer> addRole(ShopRole role);
	
	/**
	 * 逻辑删除角色
	 * @param map
	 * @return
	 */
	public ServerResponse<Integer> tombRole(Map<String, Object> map);
	
	/**
	 * 删除角色
	 * @param roleId
	 * @return
	 */
	public ServerResponse<Integer> delRole(int roleId);
	
	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	public ServerResponse<Integer> updateRole(ShopRole role);
	
	/**
	 * 分页查询全部角色/根据角色id查询角色/根据角色名查询角色
	 * @param page
	 * @param limit
	 * @param roleId
	 * @param roleName
	 * @return
	 */
	public ServerResponse<PageUtil<List<ShopRole>>> page(int page,int limit,int roleId,String roleName);
}
