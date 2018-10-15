package com.hzit.mapper;

import java.util.List;

import com.entity.ShopGoodsAttrTemplate;

public interface GoodsAttrTempMapper {

	/**
	 * 获取数据
	 * @return
	 */
  List<ShopGoodsAttrTemplate> getData();
  /**
   * 增加数据
   * @param shopGoodsAttr
   * @return
   */
  int addGoodAttrTemp(ShopGoodsAttrTemplate shopGoodsAttrTemplate);
  /**
   * 修改数据
   */
  int updateGoodAttrTemp(ShopGoodsAttrTemplate shopGoodsAttrTemplate);
  /**
   * 删除数据
   */
  int deleteGoodsAttrTemp(int attrId);
  /**
   * 逻辑删除
   */
  int isDel(ShopGoodsAttrTemplate shopGoodsAttrTemplate);
}
