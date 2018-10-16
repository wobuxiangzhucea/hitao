package com.hzit.service;

import java.util.List;
import java.util.Map;

import com.entity.ShopMember;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface MemberService {
	/**
	 * 验证登录
	 */
	public ServerResponse<String> checkLogin(String memberName,String memgberpassword);
	/**
	 * 通过会员ID查询
	 */
	public ServerResponse<ShopMember> memberById(int memberId);
	/**
	 * 通过会员ID删除
	 */
	public ServerResponse memberIsDel(int memberId,int isDel);
	/**
	 * 查询分页查询会员
	 * @param map
	 * @return
	 */
	public ServerResponse<PageUtil<List<ShopMember>>> pageData(int page,int limit);
	
	/**
	 * 添加会员
	 * @param shopMember
	 * @return
	 */
	public ServerResponse addMember(ShopMember shopMember);
	/**
	 * 根据ID修改数据
	 */
	public ServerResponse updateById(ShopMember shopMember);
	
	ShopMember searchShopMember(ShopMember shopMember);
}
