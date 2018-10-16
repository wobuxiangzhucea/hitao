package com.hzit.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopGoods;
import com.entity.ShopMember;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.MemberMapper;
import com.hzit.service.MemberService;
import com.utils.Md5Util;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberMapper memberMapper;
	@Override
	public ServerResponse<ShopMember> memberById(int memberId) {
		ShopMember shopMember=memberMapper.memberById(memberId);
		if(shopMember ==null) {
			return ServerResponse.createByErrorMessage("查询失败");
		}
		return ServerResponse.createBySuccess(shopMember);
		
	}
	@Override
	public ServerResponse<PageUtil<List<ShopMember>>> pageData(int page,int limit) {
		PageHelper.startPage(page, limit);
		List<ShopMember> list=memberMapper.pageData();
		PageInfo<ShopMember> pageInfo=new PageInfo<>(list);
		PageUtil<List<ShopMember>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("会员数据");
		return ServerResponse.createBySuccess("会员数据",pageUtil);
	}
	@Override
	public ServerResponse memberIsDel(int memberId,int isDel) {
		int result=memberMapper.memberIsDel(memberId, isDel);
		if(result!=1) {
			return ServerResponse.createBySuccess("删除成功");
		}
		return ServerResponse.createByErrorMessage("删除失败");
	}
	@Override
	public ServerResponse addMember(ShopMember shopMember) {
		try {
			shopMember.setPasswordSalt(Md5Util.getMD5(shopMember.getPasswordSalt()));
		} catch (Exception e) {
			e.printStackTrace();
			return ServerResponse.createByErrorMessage("添加失败");
		}
		int result=memberMapper.addMember(shopMember);
		if(result!=1) {
			return ServerResponse.createBySuccess("添加成功");
		}
		return ServerResponse.createByErrorMessage("添加失败");
	}
	@Override
	public ServerResponse updateById(ShopMember shopMember) {
		int result=memberMapper.updateById(shopMember);
				if(result!=1) {
					return ServerResponse.createBySuccess("更新成功");
				}
				return ServerResponse.createByErrorMessage("更新失败");
	}
	@Override
	public ServerResponse<String> checkLogin(String memberName,String memgberpassword) {
		ShopMember shopMember=new ShopMember();
		shopMember.setMemberName(memberName);
		
		shopMember.setPasswordSalt(memgberpassword);
		return null;
	}
	@Override
	public ShopMember searchShopMember(ShopMember shopMember) {
		return memberMapper.searchShopMember(shopMember);
	}

}
