package com.hzitxx.mapper.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopPayment;
import com.hzitxx.OrderMicroService8764;
import com.hzitxx.mapper.ShopPaymentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=OrderMicroService8764.class)
public class TestShopPayment {
	@Autowired
	private ShopPaymentMapper paymentMapper;
	/**
	 * 测试分页查询所有的支付方式
	 */
	@Test
	public void testFind(){
		List<ShopPayment> paymentList=paymentMapper.findShopPayments();
		System.out.println(paymentList);
	}
	/**
	 * 测试增加支付方式
	 */
	@Test
	public void testAdd(){
		ShopPayment shopPayment=new ShopPayment();
		shopPayment.setPaymentCode("skdgfvnhk");
		shopPayment.setPaymentName("随缘");
		shopPayment.setPaymentConfig("dgyeeey");
		int i=paymentMapper.addShopPayment(shopPayment);
		System.out.println(i);
	}
	/**
	 * 测试修改支付方式
	 */
	@Test
	public void testUpdate(){
		ShopPayment shopPayment=new ShopPayment();
		shopPayment.setPaymentCode("skdgfvnhk");
		shopPayment.setPaymentName("随缘");
		shopPayment.setPaymentConfig("edkfj");
		shopPayment.setPaymentId(4);
		paymentMapper.updateShopPayment(shopPayment);
	}
	/**
	 * 测试删除支付方式
	 */
	@Test
	public void testDelete(){
		int paymentId=4;
		paymentMapper.deleteShopPayment(paymentId);
	}
}
