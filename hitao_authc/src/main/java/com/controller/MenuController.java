package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopMenu;
import com.service.MenuService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Controller
public class MenuController {
	/**
	 * 自动注入MenuService实例
	 */
	@Autowired
	private MenuService menuService;
	
	/**
	 * 添加系统菜单
	 * @param menu
	 * @return
	 */
	@GetMapping("/addMenu")
	@ResponseBody
	public ServerResponse<Integer> addMenu(ShopMenu menu){
		return menuService.addMenu(menu);
	}
	
	/**
	 * 删除系统菜单
	 * @param id
	 * @return
	 */
	@GetMapping("/delMenu")
	@ResponseBody
	public ServerResponse<Integer> delMenu(int id){
		return menuService.delMenu(id);
	}
	
	/**
	 * 修改系统菜单
	 * @param menu
	 * @return
	 */
	@GetMapping("/updateMenu")
	@ResponseBody
	public ServerResponse<Integer> updateMenu(ShopMenu menu){
		return menuService.updateMenu(menu);
	}
	
	/**
	 * 分页查询系统菜单
	 * @param page
	 * @param limit
	 * @param id
	 * @return
	 */
	@GetMapping("/findMenu")
	@ResponseBody
	public ServerResponse<PageUtil<List<ShopMenu>>> findMenu(int page,int limit,int id){
		return menuService.findMenu(page, limit, id);
	}
}
