package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopRoleMenu;
import com.mapper.RoleMenuMapper;
import com.utils.ServerResponse;

@Service
public class RoleMenuServiceImpl implements RoleMenuService{
	/**
	 * 自动注入RoleMenuMapper实例
	 */
	@Autowired
	private RoleMenuMapper roleMenuMapper;

	/**
	 * 为角色授予权限
	 */
	@Override
	public ServerResponse<Integer> addRoleMenu(ShopRoleMenu roleMenu) {
		int result = roleMenuMapper.addRoleMenu(roleMenu);
		//添加成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		//添加失败
		return null;
	}

}
