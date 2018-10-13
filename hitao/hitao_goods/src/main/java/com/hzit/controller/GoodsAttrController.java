package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopGoodsAttr;
import com.hzit.service.GoodsAttrService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Controller
public class GoodsAttrController {
  
	@Autowired
	private GoodsAttrService  service;
	@GetMapping("/goodsAttr")
	@ResponseBody
	public ServerResponse<PageUtil<List<ShopGoodsAttr>>> goodsAttr(int page,int limit){
		return service.page(page, limit);
	}
}
