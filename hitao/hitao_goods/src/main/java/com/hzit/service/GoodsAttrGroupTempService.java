package com.hzit.service;

import java.util.List;

import com.entity.ShopGoodsAttrGroupTemp;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface GoodsAttrGroupTempService {


	/**
	 * 获取数据
	 * @return
	 */
  ServerResponse<PageUtil<List<ShopGoodsAttrGroupTemp>>> page(int page, int limit);
  /**
   * 增加数据
   * @param shopGoodsAttr
   * @return
   */
  ServerResponse<Integer> addGoodAttrGroupTemp(ShopGoodsAttrGroupTemp shopGoodsAttrGroupTemp);
  /**
   * 修改数据
   */
  ServerResponse<Integer> updateGoodAttrGroupTemp(ShopGoodsAttrGroupTemp shopGoodsAttrGroupTemp);
  /**
   * 删除数据
   */
  ServerResponse<Integer> deleteGoodsAttrGroupTemp(int id);
}
