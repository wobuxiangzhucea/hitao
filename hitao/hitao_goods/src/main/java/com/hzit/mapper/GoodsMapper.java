package com.hzit.mapper;

import java.util.List;
import java.util.Map;

import com.entity.ShopGoods;

public interface GoodsMapper {
	/**
	 * 查询商品
	 * @param map
	 * @return
	 */
	List<ShopGoods> pageData(Map<String, Object> map);
	/**
	 * 添加商品
	 * @param shopGoods
	 * @return
	 */
	int addGood(ShopGoods shopGoods);
	/**
	 * 修改商品
	 * @param shopGoods
	 * @return
	 */
	int updateGood(ShopGoods shopGoods);
	/**
	 * 删除商品
	 */
	int deleteGoods(int goodsId);
	/**
	 * 逻辑删除
	 * @param goodsId
	 * @return
	 */
	int isDel(ShopGoods shopGoods);
}
