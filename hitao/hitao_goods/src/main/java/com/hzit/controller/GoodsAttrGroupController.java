package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopGoodsAttrGroup;
import com.hzit.service.GoodsAttrGroupService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Controller
public class GoodsAttrGroupController {
    
	@Autowired
	private GoodsAttrGroupService service;
	@GetMapping("/goodsAttrGroup")
	@ResponseBody
	public ServerResponse<PageUtil<List<ShopGoodsAttrGroup>>> goodsAttrGroup(int page,int limit){
		return service.page(page, limit);
	}
}
