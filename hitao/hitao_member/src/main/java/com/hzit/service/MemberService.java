package com.hzit.service;

import java.util.List;
import java.util.Map;

import com.entity.ShopMember;

public interface MemberService {
	/**
	 * 通过会员ID查询
	 */
	public ShopMember memberById(int memberId);
	/**
	 * 通过会员ID删除
	 */
	public int memberIsDel(int memberId,int isDel);
	/**
	 * 查询分页查询会员
	 * @param map
	 * @return
	 */
	List<ShopMember> pageData(Map<String, Object> map);
	
	/**
	 * 添加会员
	 * @param shopMember
	 * @return
	 */
	public int addMember(ShopMember shopMember);
	/**
	 * 根据ID修改数据
	 */
	public int updateById(ShopMember shopMember);
}
