package com.hzitxx.mapper;

import java.util.List;
import java.util.Map;

import com.entity.ShopOrder;
import com.entity.ShopOrderGoods;
import com.entity.ShopPayment;

public interface ShopPaymentMapper {
	/**
	 * 查找所有支付方式
	 * @return
	 */
	public List<ShopPayment> findShopPayments();
	/**
	 * 增加支付方式
	 */
	public int addShopPayment(ShopPayment shopPayment);
	/**
	 * 根据id修改支付方式
	 */
	public int updateShopPayment(ShopPayment shopPayment);
	/**
	 * 根据id删除支付方式
	 */
	public int deleteShopPayment(Integer paymentId);
}
