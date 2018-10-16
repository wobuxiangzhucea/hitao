package com.hzitxx.service.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopPayment;
import com.hzitxx.OrderMicroService8764;
import com.hzitxx.service.ShopPaymentService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=OrderMicroService8764.class)
public class TestShopPaymentService {
	@Autowired
	private ShopPaymentService paymentService;
	@Test
	public void testFind(){
		ServerResponse<PageUtil<List<ShopPayment>>> serverResponse=paymentService.findShopPayments(1, 3);
		System.out.println(serverResponse.getData().getData());
		System.out.println(serverResponse.getData().getCount());
	}
	@Test
	public void testAdd(){
		ShopPayment shopPayment=new ShopPayment();
		shopPayment.setPaymentCode("24rfdyu6");
		shopPayment.setPaymentConfig("sfdyuks");
		paymentService.addShopPayment(shopPayment);
	}
	@Test
	public void testUpdate(){
		ShopPayment shopPayment=new ShopPayment();
		shopPayment.setPaymentCode("rfdyu6");
		shopPayment.setPaymentConfig("sfdyuks");
		shopPayment.setPaymentName("dgf387d");
		shopPayment.setPaymentId(4);
		paymentService.updateShopPayment(shopPayment);
	}
	@Test
	public void testDelete(){		
		paymentService.deleteShopPayment(4);
	}
}
