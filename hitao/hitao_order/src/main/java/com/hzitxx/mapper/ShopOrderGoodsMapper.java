package com.hzitxx.mapper;

import java.util.List;
import java.util.Map;

import com.entity.ShopOrder;
import com.entity.ShopOrderGoods;

public interface ShopOrderGoodsMapper {
	/**
	 * 查找所有订单商品
	 * @return
	 */
	public List<ShopOrderGoods> findOrderGoods();
	/**
	 * 增加订单商品
	 */
	public int addOrderGoods(ShopOrderGoods shopOrderGoods);
	/**
	 * 根据id修改订单商品
	 */
	public int updateOrderGoods(ShopOrderGoods shopOrderGoods);
	/**
	 * 根据id删除订单商品
	 */
	public int deleteOrderGoods(Integer recId);
}
