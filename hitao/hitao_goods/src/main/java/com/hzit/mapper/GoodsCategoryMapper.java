package com.hzit.mapper;

import java.util.List;

import com.entity.ShopGoodsCategory;

public interface GoodsCategoryMapper {

	/**
	 * 查询数据
	 */
	List<ShopGoodsCategory> getData();
	/**
	 * 新增数据
	 */
	int addGoodCategory(ShopGoodsCategory shopGoodsCategory);
	/**
	 * 修改数据
	 */
	int updateGoodsCategory(ShopGoodsCategory shopGoodsCategory);
	/**
	 * 删除数据
	 */
	int deleteGoodsCategory(int catId);
}
