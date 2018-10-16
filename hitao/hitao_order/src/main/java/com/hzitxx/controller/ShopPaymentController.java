package com.hzitxx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ShopPayment;
import com.hzitxx.service.ShopPaymentService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RestController
@RequestMapping("/ShopPayment")
public class ShopPaymentController {
	@Autowired
	private ShopPaymentService paymentService;
	@GetMapping("/findShopPayment")
	public ServerResponse<PageUtil<List<ShopPayment>>> findShopPayment(int page,int limit){
		return paymentService.findShopPayments(page, limit);
	}
	@PostMapping("/addShopPayment")
	public ServerResponse<Integer> addShopPayment(@RequestBody ShopPayment shopPayment){
		return paymentService.addShopPayment(shopPayment);
	}
	@PostMapping("/updateShopPayment")
	public ServerResponse<Integer> updateShopPayment(@RequestBody ShopPayment shopPayment){
		return paymentService.updateShopPayment(shopPayment);
	}
	@GetMapping("/deleteShopPayment")
	public ServerResponse<Integer> deleteShopPayment(int paymentId){
		return paymentService.deleteShopPayment(paymentId);
	}
}
