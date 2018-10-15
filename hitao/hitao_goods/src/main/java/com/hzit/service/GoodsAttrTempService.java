package com.hzit.service;

import java.util.List;

import com.entity.ShopGoodsAttrTemplate;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface GoodsAttrTempService {
	/**
	 * 获取数据
	 * @return
	 */
  ServerResponse<PageUtil<List<ShopGoodsAttrTemplate>>> page(int page,int limit);
  /**
   * 增加数据
   * @param shopGoodsAttr
   * @return
   */
  ServerResponse<Integer> addGoodAttrTemp(ShopGoodsAttrTemplate shopGoodsAttrTemplate);
  /**
   * 修改数据
   */
  ServerResponse<Integer> updateGoodAttrTemp(ShopGoodsAttrTemplate shopGoodsAttrTemplate);
  /**
   * 删除数据
   */
  ServerResponse<Integer> deleteGoodsAttrTemp(int attrId);
  /**
   * 逻辑删除
   */
  ServerResponse<Integer> isDel(ShopGoodsAttrTemplate shopGoodsAttrTemplate);
}
