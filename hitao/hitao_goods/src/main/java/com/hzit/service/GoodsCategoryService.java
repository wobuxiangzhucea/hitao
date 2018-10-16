package com.hzit.service;

import java.util.List;

import com.entity.ShopGoodsCategory;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface GoodsCategoryService {


	/**
	 * 查询数据
	 */
	ServerResponse<PageUtil<List<ShopGoodsCategory>>> page(int page,int limit);
	/**
	 * 新增数据
	 */
	ServerResponse<Integer> addGoodCategory(ShopGoodsCategory shopGoodsCategory);
	/**
	 * 修改数据
	 */
	ServerResponse<Integer> updateGoodsCategory(ShopGoodsCategory shopGoodsCategory);
	/**
	 * 删除数据
	 */
	ServerResponse<Integer> deleteGoodsCategory(int catId);
}
