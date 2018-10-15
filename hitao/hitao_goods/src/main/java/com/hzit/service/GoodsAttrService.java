package com.hzit.service;

import java.util.List;

import com.entity.ShopGoodsAttr;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface GoodsAttrService {
	/**
	 * 获取数据
	 * @return
	 */
	ServerResponse<PageUtil<List<ShopGoodsAttr>>> page(int page, int limit);
  /**
   * 增加数据
   * @param shopGoodsAttr
   * @return
   */
  ServerResponse<Integer> addGoodAttr(ShopGoodsAttr shopGoodsAttr);
  /**
   * 修改数据
   */
  ServerResponse<Integer> updateGoodAttr(ShopGoodsAttr shopGoodsAttr);
  /**
   * 删除数据
   */
  ServerResponse<Integer> deleteGoodsAttr(int goodsId);
}
