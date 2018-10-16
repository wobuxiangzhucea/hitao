package com.hzit.service;

import com.entity.ShopAdminRole;
import com.utils.ServerResponse;

public interface AdminRoleService {
	/**
	 * 为管理员授予角色
	 * @param adminRole
	 * @return
	 */
	public ServerResponse<Integer> addAdminRole(ShopAdminRole adminRole);
}
