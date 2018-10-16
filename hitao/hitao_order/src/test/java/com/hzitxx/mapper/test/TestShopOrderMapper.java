package com.hzitxx.mapper.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopOrder;
import com.hzitxx.OrderMicroService8764;
import com.hzitxx.mapper.ShopOrderMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=OrderMicroService8764.class)
public class TestShopOrderMapper {
	@Autowired
	private ShopOrderMapper mapper;
	/**
	 * 测试查询所有的订单
	 */
	@Test
	public void testfindOrder(){
		List<ShopOrder> orderList=mapper.findOrders();
		System.out.println(orderList);
	}
	/**
	 * 测试增加订单
	 */
	@Test
	public void testAddOrder(){
		ShopOrder shopOrder=new ShopOrder();
		shopOrder.setBuyerName("你");
		shopOrder.setBuyerEmail("1324468");
		int i=mapper.addOrder(shopOrder);
		System.out.println(i);
	}
	/**
	 * 测试根据id修改订单
	 */
	@Test
	public void testUpdateOrder(){
		ShopOrder shopOrder=new ShopOrder();
		shopOrder.setBuyerName("他");
		shopOrder.setOrderId(4);
		int i=mapper.updateOrder(shopOrder);
		System.out.println(i);
	}
	/**
	 * 测试根据id删除订单
	 */
	@Test
	public void testDeleteOrder(){		
		Integer orderId=3;
		int i=mapper.deleteOrder(orderId);
		System.out.println(i);
	}
}
