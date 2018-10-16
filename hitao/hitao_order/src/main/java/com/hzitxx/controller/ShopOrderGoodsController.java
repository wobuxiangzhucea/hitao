package com.hzitxx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ShopOrderGoods;
import com.hzitxx.service.ShopOrderGoodsService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RestController
@RequestMapping("/ShopOrderGoods")
public class ShopOrderGoodsController {
	@Autowired
	private ShopOrderGoodsService orderGoodsService;
	@GetMapping("/findShopOrderGoods")
	//@ResponseBody
	public ServerResponse<PageUtil<List<ShopOrderGoods>>> findShopOrderGoods(int page,int limit){		
		return orderGoodsService.findOrderGoods(page, limit);
	}
	@PostMapping("/addOrderGoods")
	//@ResponseBody
	public ServerResponse<Integer> addOrderGoods(@RequestBody ShopOrderGoods shopOrderGoods){
		System.out.println(shopOrderGoods);
		return orderGoodsService.addOrderGoods(shopOrderGoods);
	}
	@PostMapping("/updateOrderGoods")
	//@ResponseBody
	public ServerResponse<Integer> updateOrderGoods(@RequestBody ShopOrderGoods shopOrderGoods){
		return orderGoodsService.updateOrderGoods(shopOrderGoods);
	}
	@GetMapping("/deleteOrderGoods")
	//@ResponseBody
	public ServerResponse<Integer> deleteOrderGoods(Integer recId){
		return orderGoodsService.deleteOrderGoods(recId);
	}
}
