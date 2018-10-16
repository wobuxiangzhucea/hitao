package com.hzitxx.service;

import java.util.List;

import com.entity.ShopOrder;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface ShopOrderService {
	/**
	 * 分页查询所有订单
	 * @param page
	 * @param limit
	 * @return
	 */
	public ServerResponse<PageUtil<List<ShopOrder>>> findShopOrders(int page,int limit);
	/**
	 * 增加订单
	 * @param shopOrder
	 * @return
	 */
	public ServerResponse<Integer> addShopOrder(ShopOrder shopOrder);
	/**
	 * 修改订单
	 * @param shopOrder
	 * @return
	 */
	public ServerResponse<Integer> updateShopOrder(ShopOrder shopOrder);
	/**
	 * 删除订单
	 * @param orderId
	 * @return
	 */
	public ServerResponse<Integer> deleteShopOrder(int orderId);
}
