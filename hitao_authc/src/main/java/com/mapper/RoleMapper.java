package com.mapper;

import java.util.List;
import java.util.Map;

import com.entity.ShopRole;

public interface RoleMapper {
	/**
	 * 增加系统角色
	 * @param role
	 * @return
	 */
	public int addRole(ShopRole role);
	
	/**
	 * 根据角色id删除系统角色
	 * @param roleId
	 * @return
	 */
	public int delRole(int roleId);
	
	/**
	 * 逻辑删除系统角色
	 * @param map
	 * @return
	 */
	public int tombRole(Map<String, Object> map);
	
	/**
	 * 修改系统角色
	 * @param role
	 * @return
	 */
	public int updateRole(ShopRole role);
	
	/**
	 * 查询全部系统角色/根据角色id查询角色
	 * @param map
	 * @return
	 */
	public List<ShopRole> findRole(Map<String, Object> map);
}
