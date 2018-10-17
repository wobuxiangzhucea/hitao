package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopRole;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.RoleMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
	/**
	 * 自动注入RoleMapper实例
	 */
	@Autowired
	private RoleMapper roleMapper;

	/**
	 * 添加角色
	 */
	@Override
	public ServerResponse<Integer> addRole(ShopRole role) {
		int result = roleMapper.addRole(role);
		//添加成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		//添加失败
		return ServerResponse.createBySuccessMessage("添加失败");
	}

	/**
	 * 分页查询全部角色/根据角色id查询角色/根据角色名查询角色
	 */
	@Override
	public ServerResponse<PageUtil<List<ShopRole>>> page(int page, int limit, int roleId, String roleName) {
		//自动分页
		PageHelper.startPage(page,limit);
		Map<String, Object> map = new HashMap<>();
		if(roleId!=0) {
			map.put("roleId", roleId);
		}
		if(roleName!=null && !"".equals(roleName)) {
			map.put("roleName", roleName);
		}
		List<ShopRole> list = roleMapper.findRole(map);
		//用PageInfo解析list里的数据
		PageInfo<ShopRole> pageInfo=new PageInfo<>(list);
		//记录数
		Long total=pageInfo.getTotal();
		//角色集合
		List<ShopRole> roleList = pageInfo.getList();
		PageUtil<List<ShopRole>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setMsg("角色数据");
		pageUtil.setCount(total);
		pageUtil.setData(roleList);
		return ServerResponse.createBySuccess("角色数据", pageUtil);
	}

	/**
	 * 逻辑删除角色
	 */
	@Override
	public ServerResponse<Integer> tombRole(Map<String, Object> map) {
		int result = roleMapper.tombRole(map);
		//逻辑删除成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("逻辑删除成功");
		}
		//逻辑删除失败
		return ServerResponse.createBySuccessMessage("逻辑删除失败");
	}

	/**
	 * 删除角色
	 */
	@Override
	public ServerResponse<Integer> delRole(int roleId) {
		int result = roleMapper.delRole(roleId);
		//删除成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		//删除失败
		return ServerResponse.createBySuccessMessage("删除失败");
	}

	/**
	 * 修改角色
	 */
	@Override
	public ServerResponse<Integer> updateRole(ShopRole role) {
		int result = roleMapper.updateRole(role);
		//修改成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		//修改失败
		return ServerResponse.createBySuccessMessage("修改失败");
	}

}
