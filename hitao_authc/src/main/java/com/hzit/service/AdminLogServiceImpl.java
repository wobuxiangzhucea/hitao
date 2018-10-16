package com.hzit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopAdminLog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.AdminLogMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Service
public class AdminLogServiceImpl implements AdminLogService {
	/**
	 * 自动注入AdminMapper实例
	 */
	@Autowired
	private AdminLogMapper adminLogMapper;

	/**
	 * 添加日志
	 */
	@Override
	public ServerResponse<Integer> addAdminLog(ShopAdminLog adminLog) {
		int result = adminLogMapper.addAdminLog(adminLog);
		//添加成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		//添加失败
		return ServerResponse.createBySuccessMessage("添加失败");
	}

	/**
	 * 逻辑删除日志
	 */
	@Override
	public ServerResponse<Integer> tombAdminLog(Map<String, Object> map) {
		int result = adminLogMapper.tombAdminLog(map);
		//逻辑删除成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("逻辑删除成功");
		}
		//逻辑删除失败
		return ServerResponse.createBySuccessMessage("逻辑删除失败");
	}

	/**
	 * 删除日志
	 */
	@Override
	public ServerResponse<Integer> delAdminLog(int logId) {
		int result = adminLogMapper.delAdminLog(logId);
		//删除成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		//删除失败
		return ServerResponse.createBySuccessMessage("删除失败");
	}

	/**
	 * 修改日志
	 */
	@Override
	public ServerResponse<Integer> updateAdminLog(ShopAdminLog adminLog) {
		int result = adminLogMapper.updateAdminLog(adminLog);
		//修改成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		//修改失败
		return ServerResponse.createBySuccessMessage("修改失败");
	}

	/**
	 * 分页查询日志
	 */
	@Override
	public ServerResponse<PageUtil<List<ShopAdminLog>>> findAdminLog(int page,int limit,int logId) {
		//自动分页
		PageHelper.startPage(page,limit);
		Map<String, Object> map =new HashMap<>();
		if(logId!=0) {
			map.put("logId", logId);
		}
		List<ShopAdminLog> list=adminLogMapper.findAdminLog(map);
		//用PageInfo解析list里的数据
		PageInfo<ShopAdminLog> pageInfo=new PageInfo<>(list);
		//总记录数
		Long total=pageInfo.getTotal();
		//数据集合
		List<ShopAdminLog> adminLogList = pageInfo.getList();
		PageUtil<List<ShopAdminLog>> pageUtil = new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setMsg("日志信息");
		pageUtil.setCount(total);
		pageUtil.setData(adminLogList);
		return ServerResponse.createBySuccess("日志信息", pageUtil);
	}

}
