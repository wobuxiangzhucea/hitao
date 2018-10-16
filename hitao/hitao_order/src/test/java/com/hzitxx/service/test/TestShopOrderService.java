package com.hzitxx.service.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopOrder;
import com.hzitxx.OrderMicroService8764;
import com.hzitxx.service.ShopOrderService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=OrderMicroService8764.class)
public class TestShopOrderService {
	@Autowired
	private ShopOrderService orderService;
	/**
	 * 测试分页查询所有的订单信息
	 */
	@Test
	public void testFindShopOrder(){
		ServerResponse<PageUtil<List<ShopOrder>>> serverResponse=orderService.findShopOrders(1, 1);
		System.out.println(serverResponse.getData().getData());
		System.out.println(serverResponse.getData().getCount());
	}
	/**
	 * 测试增加订单
	 */
	@Test
	public void testAddShopOrder(){
		ShopOrder shopOrder=new ShopOrder();
		shopOrder.setBuyerId(4);
		shopOrder.setBuyerName("littleFairy");		
		ServerResponse<Integer> serverResponse=orderService.addShopOrder(shopOrder);
		System.out.println(serverResponse.getMsg());
	}
	/**
	 * 测试删除订单
	 */
	@Test
	public void testDeleteShopOrder(){
		ServerResponse<Integer> serverResponse=orderService.deleteShopOrder(5);
		System.out.println(serverResponse.getMsg());
	}
}
