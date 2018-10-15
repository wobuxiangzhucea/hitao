package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopAdmin;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.AdminMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	/**
	 * 自动注入AdminMapper实例
	 */
	@Autowired
	private AdminMapper adminMapper;

	/**
	 * 添加管理员
	 */
	@Override
	public ServerResponse<Integer> addAdmin(ShopAdmin admin) {
		int result = adminMapper.addAdmin(admin);
		//添加成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		//添加失败
		return null;
	}

	/**
	 * 分页
	 */
	@Override
	public ServerResponse<PageUtil<List<ShopAdmin>>> page(int page, int limit,int adminId) {
		//自动分页
		PageHelper.startPage(page,limit);
		Map<String, Object> map =new HashMap<>();
		if(adminId!=0) {
			map.put("adminId", adminId);
		}
		List<ShopAdmin> list =adminMapper.findAdmin(map);
		//list里包含了分页后的数据和总记录数
		System.out.println(list);
		//用PageInfo解析list里的数据
		PageInfo<ShopAdmin> pageInfo=new PageInfo<>(list);
		//总记录数
		Long total=pageInfo.getTotal();
		//数据集合
		List<ShopAdmin> adminList = pageInfo.getList();
		System.out.println(adminList);
		PageUtil<List<ShopAdmin>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setMsg("管理员数据");
		pageUtil.setCount(total);
		pageUtil.setData(adminList);
		return ServerResponse.createBySuccess("管理员数据", pageUtil);
	}

	/**
	 * 逻辑删除管理员
	 */
	@Override
	public ServerResponse<Integer> tombAdmin(Map<String, Object> map) {
		int result = adminMapper.tombAdmin(map);
		//逻辑删除成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("逻辑删除成功");
		}
		//逻辑删除失败
		return ServerResponse.createBySuccessMessage("逻辑删除失败");
	}

	/**
	 * 删除管理员
	 */
	@Override
	public ServerResponse<Integer> delAdmin(int adminId) {
		int result = adminMapper.delAdmin(adminId);
		//删除成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		//删除失败
		return ServerResponse.createBySuccessMessage("删除失败");
	}

	/**
	 * 修改管理员
	 */
	@Override
	public ServerResponse<Integer> updateAdmin(ShopAdmin admin) {
		int result = adminMapper.updateAdmin(admin);
		//修改成功
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		//修改失败
		return ServerResponse.createBySuccessMessage("修改失败");
	}

}
