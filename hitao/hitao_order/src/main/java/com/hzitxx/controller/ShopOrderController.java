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

import com.entity.ShopOrder;
import com.hzitxx.service.ShopOrderService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RestController //替代@Controller和@ResponseBody
@RequestMapping("/ShopOrder")
public class ShopOrderController {
	@Autowired
	private ShopOrderService orderService;
	@GetMapping("/findShopOrders")
	//@ResponseBody 直接返回数据，不跳转界面
	public ServerResponse<PageUtil<List<ShopOrder>>> findShopOrders(int page,int limit){		
		return orderService.findShopOrders(page, limit);
	}
	@PostMapping("/addShopOrder")
	//@ResponseBody
	public ServerResponse<Integer> addShopOrder(@RequestBody ShopOrder shopOrder){
		System.out.println(shopOrder);
		return orderService.addShopOrder(shopOrder);
	}
	@PostMapping("/updateShopOrder")
	//@ResponseBody
	public ServerResponse<Integer> updateShopOrder(@RequestBody ShopOrder shopOrder){
		return orderService.updateShopOrder(shopOrder);
	}
	@GetMapping("/deleteShopOrder")
	//@ResponseBody
	public ServerResponse<Integer> deleteShopOrder(int orderId){
		return orderService.deleteShopOrder(orderId);
	}
}
