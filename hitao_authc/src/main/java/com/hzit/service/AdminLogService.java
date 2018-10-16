package com.hzit.service;

import java.util.List;
import java.util.Map;

import com.entity.ShopAdminLog;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface AdminLogService {
	/**
	 * 添加日志
	 * @param adminLog
	 * @return
	 */
	public ServerResponse<Integer> addAdminLog(ShopAdminLog adminLog);
	
	/**
	 * 逻辑删除日志
	 * @param map
	 * @return
	 */
	public ServerResponse<Integer> tombAdminLog(Map<String, Object> map);
	
	/**
	 * 删除日志
	 * @param logId
	 * @return
	 */
	public ServerResponse<Integer> delAdminLog(int logId);
	
	/**
	 * 修改日志
	 * @param adminLog
	 * @return
	 */
	public ServerResponse<Integer> updateAdminLog(ShopAdminLog adminLog);
	
	/**
	 * 分页查询日志
	 * @param map
	 * @return
	 */
	public ServerResponse<PageUtil<List<ShopAdminLog>>> findAdminLog(int page,int limit,int logId);
}
