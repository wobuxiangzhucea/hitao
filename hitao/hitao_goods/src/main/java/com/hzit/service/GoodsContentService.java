package com.hzit.service;

import java.util.List;

import com.entity.ShopGoodsContent;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface GoodsContentService {

	/**
	 * 查询数据
	 */
	ServerResponse<PageUtil<List<ShopGoodsContent>>> page(int page,int limit);
	/**
	 * 新增数据
	 */
	ServerResponse<Integer> addGoodContent(ShopGoodsContent shopGoodsContent);
	/**
	 * 修改数据
	 */
	ServerResponse<Integer> updateGoodsContent(ShopGoodsContent shopGoodsContent);
	/**
	 * 删除数据
	 */
	ServerResponse<Integer> deleteGoodsContent(int goodsId);
}
