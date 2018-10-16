package com.hzitxx.mapper;

import java.util.List;

import com.entity.ShopOrder;

public interface ShopOrderMapper {
	/**
	 * 查找所有订单
	 * @return
	 */
	public List<ShopOrder> findOrders();
	/**
	 * 增加订单
	 */
	public int addOrder(ShopOrder shopOrder);
	/**
	 * 修改订单
	 */
	public int updateOrder(ShopOrder shopOrder);
	/**
	 * 删除订单
	 */
	public int deleteOrder(Integer orderId);
}
