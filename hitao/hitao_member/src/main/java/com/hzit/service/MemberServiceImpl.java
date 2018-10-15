package com.hzit.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopMember;
import com.hzit.mapper.MemberMapper;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberMapper memberMapper;
	@Override
	public ShopMember memberById(int memberId) {
		return memberMapper.memberById(memberId);
		
	}
	@Override
	public List<ShopMember> pageData(Map<String, Object> map) {
		return memberMapper.pageData(map);
	}
	@Override
	public int memberIsDel(int memberId,int isDel) {
		return memberMapper.memberIsDel(memberId, isDel);
	}
	@Override
	public int addMember(ShopMember shopMember) {
		return memberMapper.addMember(shopMember);
	}
	@Override
	public int updateById(ShopMember shopMember) {
		return memberMapper.updateById(shopMember);
	}

}
