package com.hzitxx.service;


import java.util.List;

import com.entity.ShopOrderGoods;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface ShopOrderGoodsService {
	/**
	 * 分页查询订单商品
	 * @return
	 */
	public ServerResponse<PageUtil<List<ShopOrderGoods>>> findOrderGoods(int page,int limit);
	/**
	 * 增加订单商品
	 * @param shopOrderGoods
	 * @return
	 */
	public ServerResponse<Integer> addOrderGoods(ShopOrderGoods shopOrderGoods);
	/**
	 * 修改订单商品
	 * @param shopOrderGoods
	 * @return
	 */
	public ServerResponse<Integer> updateOrderGoods(ShopOrderGoods shopOrderGoods);
	/**
	 * 根据id删除订单商品
	 * @param recId
	 * @return
	 */
	public ServerResponse<Integer> deleteOrderGoods(Integer recId);
}
