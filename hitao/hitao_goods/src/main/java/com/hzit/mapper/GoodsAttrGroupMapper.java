package com.hzit.mapper;

import java.util.List;

import com.entity.ShopGoodsAttrGroup;

public interface GoodsAttrGroupMapper {
	/**
	 * 获取数据
	 * @return
	 */
  List<ShopGoodsAttrGroup> getData();
  /**
   * 增加数据
   * @param shopGoodsAttr
   * @return
   */
  int addGoodAttrGroup(ShopGoodsAttrGroup shopGoodsAttrGroup);
  /**
   * 修改数据
   */
  int updateGoodAttrGroup(ShopGoodsAttrGroup shopGoodsAttrGroup);
  /**
   * 删除数据
   */
  int deleteGoodsAttrGroup(int groupId);
}
