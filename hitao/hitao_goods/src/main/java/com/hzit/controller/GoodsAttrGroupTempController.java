package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopGoodsAttrGroupTemp;
import com.hzit.service.GoodsAttrGroupTempService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Controller
public class GoodsAttrGroupTempController {

	@Autowired
	private GoodsAttrGroupTempService service;
	@GetMapping("/goodsAttrGroupTemp")
	@ResponseBody
	public ServerResponse<PageUtil<List<ShopGoodsAttrGroupTemp>>> page(int page ,int limit) {
		 return service.page(page, limit);
	}
}
