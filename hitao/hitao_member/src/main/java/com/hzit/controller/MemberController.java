package com.hzit.controller; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopMember;
import com.hzit.mapper.MemberMapper;
import com.hzit.service.MemberService;
import com.netflix.discovery.converters.Auto;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Controller
public class MemberController {
@Autowired
MemberService service;
@GetMapping ("/member")
@ResponseBody
public ServerResponse<PageUtil<List<ShopMember>>> Data(int page,int limit){
	return service.pageData(page, limit);
}
}
