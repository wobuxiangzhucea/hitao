package com.hzit.service;

import java.util.List;
import java.util.Map;

import com.entity.ShopAdmin;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface AdminService {
	/**
	 * 添加管理员
	 * @param admin
	 * @return
	 */
	public ServerResponse<Integer> addAdmin(ShopAdmin admin);
	
	/**
	 * 逻辑删除管理员
	 * @param adminId
	 * @param isDel
	 * @return
	 */
	public ServerResponse<Integer> tombAdmin(Map<String, Object> map);
	
	/**
	 * 删除管理员
	 * @param adminId
	 * @return
	 */
	public ServerResponse<Integer> delAdmin(int adminId);
	
	/**
	 * 修改管理员
	 * @param admin
	 * @return
	 */
	public ServerResponse<Integer> updateAdmin(ShopAdmin admin);
	
	/**
	 * 分页
	 * @param page
	 * @param limit
	 * @return
	 */
	public ServerResponse<PageUtil<List<ShopAdmin>>> page(int page,int limit,int adminId);
}
