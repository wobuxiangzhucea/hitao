package com.hzitxx.service.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopOrderGoods;
import com.hzitxx.OrderMicroService8764;
import com.hzitxx.service.ShopOrderGoodsService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=OrderMicroService8764.class)
public class TestShopOrderGoodsService {
	@Autowired 
	private ShopOrderGoodsService orderGoodsService;
	/**
	 * 测试分页查询订单商品
	 */
	@Test
	public void testFindOrderGoods(){
		ServerResponse<PageUtil<List<ShopOrderGoods>>> serverResponse=orderGoodsService.findOrderGoods(1, 5);
		System.out.println(serverResponse.getData().getData());
		System.out.println(serverResponse.getData().getCount());
	}
	/**
	 * 测试增加订单商品
	 */
	@Test
	public void testAddOrderGoods(){
		ShopOrderGoods shopOrderGoods=new ShopOrderGoods();
		shopOrderGoods.setGoodsName("女朋友");
		shopOrderGoods.setGoodsPrice(new BigDecimal(999999));
		shopOrderGoods.setGoodsPayPrice(100000l);
		ServerResponse<Integer> serverResponse=orderGoodsService.addOrderGoods(shopOrderGoods);
		System.out.println(serverResponse.getData());
	}
	/**
	 * 测试修改订单商品
	 */
	@Test
	public void testUpdateOrderGoods(){
		ShopOrderGoods shopOrderGoods=new ShopOrderGoods();
		shopOrderGoods.setGoodsName("亚文");
		shopOrderGoods.setGoodsPrice(new BigDecimal(999999999));
		shopOrderGoods.setGoodsPayPrice(1l);
		shopOrderGoods.setRecId(3);
		ServerResponse<Integer> serverResponse=orderGoodsService.updateOrderGoods(shopOrderGoods);
		System.out.println(serverResponse.getStatus());
	}
	/**
	 * 测试删除订单商品
	 */
	@Test
	public void testDeleteOrderGoods(){
		int recId=6;
		orderGoodsService.deleteOrderGoods(recId);
	}
}
