package com.hzitxx.mapper.test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopOrderGoods;
import com.hzitxx.OrderMicroService8764;
import com.hzitxx.mapper.ShopOrderGoodsMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=OrderMicroService8764.class)
public class TestShopOrderGoodsMapper {
	@Autowired
	private ShopOrderGoodsMapper mapper;
	/**
	 * 测试查询所有的订单商品
	 */
	@Test
	public void testfindOrderGoods(){		
		List<ShopOrderGoods> orderGoodsList= mapper.findOrderGoods();
		System.out.println(orderGoodsList);
	}
	/**
	 * 测试增加订单商品
	 */
	@Test
	public void testAddOrderGoods(){
		ShopOrderGoods shopOrderGoods=new ShopOrderGoods();
		shopOrderGoods.setGoodsName("电脑");		
		shopOrderGoods.setGoodsPrice(new BigDecimal(9999));
		int i=mapper.addOrderGoods(shopOrderGoods);
		System.out.println(i);
	}
	/**
	 * 测试根据id修改订单商品
	 */
	@Test
	public void testUpdateOrderGoods(){
		ShopOrderGoods shopOrderGoods=new ShopOrderGoods();
		shopOrderGoods.setOrderId(1);
		shopOrderGoods.setGoodsId(2);
		shopOrderGoods.setGoodsPrice(new BigDecimal(10999));
		shopOrderGoods.setRecId(3);
		int i=mapper.updateOrderGoods(shopOrderGoods);
		System.out.println(i);
	}
	/**
	 * 测试根据id删除订单商品
	 */
	@Test
	public void testDeleteOrderGoods(){		
		Integer recId=2;
		int i=mapper.deleteOrderGoods(recId);
		System.out.println(i);
	}
}
