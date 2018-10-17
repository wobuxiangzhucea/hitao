package com.mapper;

import com.entity.ShopAdminRole;

public interface AdminRoleMapper {
	/**
	 * 为管理员授予角色
	 * @param adminRole
	 * @return
	 */
	public int addAdminRole(ShopAdminRole adminRole);
}
