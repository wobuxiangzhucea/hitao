package com.hzit.service;

import java.util.List;

import com.entity.ShopGoodsAttrGroup;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface GoodsAttrGroupService {
 
	/**
	 * 获取数据
	 * @return
	 */
  ServerResponse<PageUtil<List<ShopGoodsAttrGroup>>> page(int page,int limit);
  /**
   * 增加数据
   * @param shopGoodsAttr
   * @return
   */
  ServerResponse<Integer> addGoodAttrGroup(ShopGoodsAttrGroup shopGoodsAttrGroup);
  /**
   * 修改数据
   */
  ServerResponse<Integer> updateGoodAttrGroup(ShopGoodsAttrGroup shopGoodsAttrGroup);
  /**
   * 删除数据
   */
  ServerResponse<Integer> deleteGoodsAttrGroup(int groupId);
}
