package com.hzit.service;

import java.util.List;

import com.entity.ShopGoods;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface GoodsService {
   /**
     * 查询数据
     */
	ServerResponse<PageUtil<List<ShopGoods>>> page(int page,int limit);
	/**
	 * 添加数据
	 */
	ServerResponse<Integer> addGood(ShopGoods shopGoods);
	/**
	 * 编辑商品
	 * @param shopGoods
	 * @return
	 */
	ServerResponse<Integer> updateGood(ShopGoods shopGoods);
	/**
	 * 物理删除
	 * @param goodsId
	 * @return
	 */
	ServerResponse<Integer> deleteGoods(int goodsId);
	/**
	 * 逻辑删除
	 * @param shopGoods
	 * @return
	 */
	ServerResponse<Integer> isDel(ShopGoods shopGoods);
}
