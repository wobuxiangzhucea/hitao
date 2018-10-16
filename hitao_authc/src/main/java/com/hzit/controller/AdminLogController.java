package com.hzit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopAdminLog;
import com.hzit.service.AdminLogService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Controller
public class AdminLogController {
	/**
	 * 自动注入AdminLogService实例
	 */
	@Autowired
	private AdminLogService adminLogService;
	
	/**
	 * 添加日志
	 * @param adminLog
	 * @return
	 */
	@GetMapping("/addLog")
	@ResponseBody
	public ServerResponse<Integer> addLog(ShopAdminLog adminLog){
		return adminLogService.addAdminLog(adminLog);
	}
	
	/**
	 * 逻辑删除日志
	 * @param logId
	 * @param isDel
	 * @return
	 */
	@GetMapping("/tombLog")
	@ResponseBody
	public ServerResponse<Integer> tombLog(int logId,int isDel){
		Map<String, Object> map = new HashMap<>();
		map.put("logId", logId);
		map.put("isDel", isDel);
		return adminLogService.tombAdminLog(map);
	}
	
	/**
	 * 删除日志
	 * @param logId
	 * @return
	 */
	@GetMapping("/delLog")
	@ResponseBody
	public ServerResponse<Integer> delLog(int logId){
		return adminLogService.delAdminLog(logId);
	}
	
	/**
	 * 修改日志
	 * @param adminLog
	 * @return
	 */
	@GetMapping("/updateLog")
	@ResponseBody
	public ServerResponse<Integer> updateLog(ShopAdminLog adminLog){
		return adminLogService.updateAdminLog(adminLog);
	}
	
	/**
	 * 分页查询日志
	 * @param page
	 * @param limit
	 * @param logId
	 * @return
	 */
	@GetMapping("/findLog")
	@ResponseBody
	public ServerResponse<PageUtil<List<ShopAdminLog>>> findLog(int page,int limit,int logId){
		return adminLogService.findAdminLog(page, limit, logId);
	}
}
