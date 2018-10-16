package com.hzit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopMenu;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.MenuMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Service
public class MenuServiceImpl implements MenuService {
	/**
	 * 自动注入MenuMapper实例
	 */
	@Autowired
	private MenuMapper menuMapper;

	/**
	 * 添加系统菜单
	 */
	@Override
	public ServerResponse<Integer> addMenu(ShopMenu menu) {
		int result = menuMapper.addMenu(menu);
		//添加成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		//添加失败
		return null;
	}

	/**
	 * 删除系统菜单
	 */
	@Override
	public ServerResponse<Integer> delMenu(int id) {
		int result = menuMapper.delMenu(id);
		//删除成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		//删除失败
		return ServerResponse.createBySuccessMessage("删除失败");
	}

	/**
	 * 修改系统菜单
	 */
	@Override
	public ServerResponse<Integer> updateMenu(ShopMenu menu) {
		int result = menuMapper.updateMenu(menu);
		//修改成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		//修改失败
		return ServerResponse.createBySuccessMessage("修改失败");
	}

	/**
	 * 分页查询系统菜单
	 */
	@Override
	public ServerResponse<PageUtil<List<ShopMenu>>> findMenu(int page,int limit,int id) {
		//自动分页
		PageHelper.startPage(page,limit);
		Map<String, Object> map = new HashMap<>();
		if(id!=0) {
			map.put("id", id);
		}
		List<ShopMenu> list = menuMapper.findMenu(map);
		//用PageInfo解析list里的数据
		PageInfo<ShopMenu> pageInfo=new PageInfo<>(list);
		//总记录数
		Long total=pageInfo.getTotal();
		//数据集合
		List<ShopMenu> menuList = pageInfo.getList();
		PageUtil<List<ShopMenu>> pageUtil = new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setMsg("系统菜单数据");
		pageUtil.setCount(total);
		pageUtil.setData(menuList);
		return ServerResponse.createBySuccess("系统菜单数据", pageUtil);
	}

}
