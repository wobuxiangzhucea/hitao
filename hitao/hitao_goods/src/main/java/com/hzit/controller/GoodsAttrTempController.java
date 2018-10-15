package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopGoodsAttrTemplate;
import com.hzit.service.GoodsAttrTempService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Controller
public class GoodsAttrTempController {

	@Autowired
	private GoodsAttrTempService service;
	@GetMapping("/goodsAttrTemp")
	@ResponseBody
	public ServerResponse<PageUtil<List<ShopGoodsAttrTemplate>>> page(int page,int limit) {
		return service.page(page, limit);
	}
}
