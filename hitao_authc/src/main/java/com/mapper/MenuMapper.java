package com.mapper;

import java.util.List;
import java.util.Map;

import com.entity.ShopMenu;

public interface MenuMapper {
	/**
	 * 增加系统菜单
	 * @param menu
	 * @return
	 */
	public int addMenu(ShopMenu menu);
	
	/**
	 * 删除系统菜单
	 * @param id
	 * @return
	 */
	public int delMenu(int id);
	
	/**
	 * 修改系统菜单
	 * @param menu
	 * @return
	 */
	public int updateMenu(ShopMenu menu);
	
	/**
	 * 查询全部系统菜单/根据id查询系统菜单
	 * @param map
	 * @return
	 */
	public List<ShopMenu> findMenu(Map<String, Object> map);
}
