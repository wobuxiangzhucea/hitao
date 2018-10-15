package com.hzit.service;

import com.entity.ShopRoleMenu;
import com.utils.ServerResponse;

public interface RoleMenuService {
	/**
	 * 为角色授予权限
	 * @param roleMenu
	 * @return
	 */
	public ServerResponse<Integer> addRoleMenu(ShopRoleMenu roleMenu);
}
