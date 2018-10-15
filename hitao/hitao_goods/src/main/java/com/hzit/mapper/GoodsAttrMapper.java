package com.hzit.mapper;

import java.util.List;

import com.entity.ShopGoodsAttr;

public interface GoodsAttrMapper {
	/**
	 * 获取数据
	 * @return
	 */
  List<ShopGoodsAttr> getData();
  /**
   * 增加数据
   * @param shopGoodsAttr
   * @return
   */
  int addGoodAttr(ShopGoodsAttr shopGoodsAttr);
  /**
   * 修改数据
   */
  int updateGoodAttr(ShopGoodsAttr shopGoodsAttr);
  /**
   * 删除数据
   */
  int deleteGoodsAttr(int goodsId);
}
