package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopAdmin;
import com.service.AdminService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Controller
public class AdminController {
	/**
	 * 自动注入AdminService实例
	 */
	@Autowired
	private AdminService adminService;
	
	/**
	 * 添加管理员
	 * @param admin
	 * @return
	 */
	@GetMapping("/addAdmin")
	@ResponseBody
	public ServerResponse<Integer> addAdmin(ShopAdmin admin) {
		return adminService.addAdmin(admin);
	}
	
	/**
	 * 逻辑删除管理员
	 * @param adminId
	 * @param isDel
	 * @return
	 */
	@GetMapping("/tombAdmin")
	@ResponseBody
	public ServerResponse<Integer> tombAdmin(int adminId,int isDel) {
		Map<String, Object> map = new HashMap<>();
		map.put("adminId", adminId);
		map.put("isDel", isDel);
		return adminService.tombAdmin(map);
	}
	
	/**
	 * 删除管理员
	 * @param adminId
	 * @return
	 */
	@GetMapping("/delAdmin")
	@ResponseBody
	public ServerResponse<Integer> delAdmin(int adminId){
		return adminService.delAdmin(adminId);
	}
	
	/**
	 * 修改管理员
	 * @param admin
	 * @return
	 */
	@GetMapping("/updateAdmin")
	@ResponseBody
	public ServerResponse<Integer> updateAdmin(ShopAdmin admin){
		return adminService.updateAdmin(admin);
	}
	/**
	 * 分页查询全部管理员/根据管理员id查询管理员
	 * @param page
	 * @param limit
	 * @param adminId
	 * @return
	 */
	@GetMapping("/findAdmin")
	@ResponseBody
	public ServerResponse<PageUtil<List<ShopAdmin>>> findAdmin(int page,int limit,int adminId) {
		ServerResponse<PageUtil<List<ShopAdmin>>> sr = adminService.page(page, limit, adminId);
		return sr;
	}
}
