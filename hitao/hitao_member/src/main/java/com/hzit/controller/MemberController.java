package com.hzit.controller;

import java.util.List;

import org.omg.CORBA.ServerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopMember;
import com.hzit.mapper.MemberMapper;
import com.hzit.service.MemberService;
import com.netflix.discovery.converters.Auto;
import com.utils.PageUtil;
import com.utils.ServerResponse;

import ch.qos.logback.core.net.LoginAuthenticator;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberService service;
	/**
	 * 验证登录
	 */
	@PostMapping("/login")
	public ServerResponse<String> checklogin(String memberName,String memgberpassword){
		return null;
	}
	/**
	 *分页数据
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/memberData")
	@ResponseBody
	public ServerResponse<PageUtil<List<ShopMember>>> Data(int page, int limit) {
		return service.pageData(page, limit);
	}
	/**
	 * 添加会员
	 * @param shopMember
	 * @return
	 */
	@PostMapping("/addMember")
	public ServerResponse addMember(@RequestBody ShopMember shopMember) {
		return service.addMember(shopMember);
	}
	/**
	 * 更新会员信息
	 * @param shopMember
	 * @return
	 */
	@PostMapping("/updateMember")
	public ServerResponse updateMember(@RequestBody ShopMember shopMember) {
		return service.updateById(shopMember);
	}
	/**
	 * 根据ID查询会员
	 * @param memberId
	 * @return
	 */
	@GetMapping("/findone")
	public ServerResponse findone(Integer memberId) {
		return service.memberById(memberId);
	}
	/**
	 * 根据ID逻辑删除会员
	 * @param memberId
	 * @return
	 */
	@GetMapping("/delete")
	public ServerResponse delete(Integer memberId) {
		int isDel=0;
		return service.memberIsDel(memberId, isDel);
	}
	
}
