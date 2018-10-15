package com.mapper;

import com.entity.ShopRoleMenu;

public interface RoleMenuMapper {
	/**
	 * 为角色授予权限
	 * @param roleMenu
	 * @return
	 */
	public int addRoleMenu(ShopRoleMenu roleMenu);
}
