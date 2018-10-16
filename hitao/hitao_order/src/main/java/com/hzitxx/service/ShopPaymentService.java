package com.hzitxx.service;

import java.util.List;

import com.entity.ShopPayment;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface ShopPaymentService {
	/**
	 * 分页查询所有的支付方式
	 * @return
	 */
	public ServerResponse<PageUtil<List<ShopPayment>>> findShopPayments(int page,int limit);
	/**
	 * 增加支付方式
	 * @return
	 */
	public ServerResponse<Integer> addShopPayment(ShopPayment shopPayment);
	/**
	 * 修改支付方式
	 */
	public ServerResponse<Integer> updateShopPayment(ShopPayment shopPayment);
	/**
	 * 根据id删除支付方式
	 */
	public ServerResponse<Integer> deleteShopPayment(Integer paymentId);
}
