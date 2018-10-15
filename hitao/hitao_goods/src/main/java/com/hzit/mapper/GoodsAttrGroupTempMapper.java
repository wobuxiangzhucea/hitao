package com.hzit.mapper;

import java.util.List;

import com.entity.ShopGoodsAttrGroupTemp;

public interface GoodsAttrGroupTempMapper {

	/**
	 * 获取数据
	 * @return
	 */
  List<ShopGoodsAttrGroupTemp> getData();
  /**
   * 增加数据
   * @param shopGoodsAttr
   * @return
   */
  int addGoodAttrGroupTemp(ShopGoodsAttrGroupTemp shopGoodsAttrGroupTemp);
  /**
   * 修改数据
   */
  int updateGoodAttrGroupTemp(ShopGoodsAttrGroupTemp shopGoodsAttrGroupTemp);
  /**
   * 删除数据
   */
  int deleteGoodsAttrGroupTemp(int id);
}
