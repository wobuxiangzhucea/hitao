package com.mapper;

import java.util.List;
import java.util.Map;

import com.entity.ShopAdmin;

public interface AdminMapper {
	/**
	 * 增加管理员
	 * @param admin
	 * @return
	 */
	public int addAdmin(ShopAdmin admin);
	
	/**
	 * 删除管理员
	 * @param adminId
	 * @return
	 */
	public int delAdmin(int adminId);
	
	/**
	 * 逻辑删除管理员
	 * @param map
	 * @return
	 */
	public int tombAdmin(Map<String, Object> map);
	
	/**
	 * 修改管理员
	 * @param admin
	 * @return
	 */
	public int updateAdmin(ShopAdmin admin);
	
	/**
	 * 查询全部管理员/根据管理员id查询管理员
	 * @param adminId
	 * @return
	 */
	public List<ShopAdmin> findAdmin(Map<String, Object> map);
}
