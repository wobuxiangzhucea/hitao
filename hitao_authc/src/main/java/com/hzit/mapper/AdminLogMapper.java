package com.hzit.mapper;

import java.util.List;
import java.util.Map;

import com.entity.ShopAdminLog;

public interface AdminLogMapper {
	/**
	 * 添加日志
	 * @param adminLog
	 * @return
	 */
	public int addAdminLog(ShopAdminLog adminLog);
	
	/**
	 * 逻辑删除日志
	 * @param map
	 * @return
	 */
	public int tombAdminLog(Map<String, Object> map);
	
	/**
	 * 删除日志
	 * @param logId
	 * @return
	 */
	public int delAdminLog(int logId);
	
	/**
	 * 修改日志
	 * @param adminLog
	 * @return
	 */
	public int updateAdminLog(ShopAdminLog adminLog);
	
	/**
	 * 查询日志
	 * @param map
	 * @return
	 */
	public List<ShopAdminLog> findAdminLog(Map<String, Object> map);
}
