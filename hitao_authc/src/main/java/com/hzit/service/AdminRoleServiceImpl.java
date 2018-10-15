package com.hzit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopAdminRole;
import com.hzit.mapper.AdminRoleMapper;
import com.utils.ServerResponse;

@Service
public class AdminRoleServiceImpl implements AdminRoleService {
	/**
	 * 自动注入AdminRoleMapper实例
	 */
	@Autowired
	private AdminRoleMapper arm;

	/**
	 * 为管理员授予角色
	 */
	@Override
	public ServerResponse<Integer> addAdminRole(ShopAdminRole adminRole) {
		int result = arm.addAdminRole(adminRole);
		//添加成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		//添加失败
		return null;
	}

}
