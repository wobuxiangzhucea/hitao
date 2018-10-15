package com.service;

import java.util.List;

import com.entity.ShopMenu;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface MenuService {
	/**
	 * 添加系统菜单
	 * @param menu
	 * @return
	 */
	public ServerResponse<Integer> addMenu(ShopMenu menu);
	
	/**
	 * 删除系统菜单
	 * @param id
	 * @return
	 */
	public ServerResponse<Integer> delMenu(int id);
	
	/**
	 * 修改系统菜单
	 * @param menu
	 * @return
	 */
	public ServerResponse<Integer> updateMenu(ShopMenu menu);
	
	/**
	 * 分页查询全部系统菜单/根据id查询系统菜单
	 * @param map
	 * @return
	 */
	public ServerResponse<PageUtil<List<ShopMenu>>> findMenu(int page,int limit,int id);
}
