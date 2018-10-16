package com.hzit.service;

import java.util.List;

import com.entity.ShopGoodsImages;
import com.utils.PageUtil;
import com.utils.ServerResponse;

public interface GoodsImagesService {

	/**
	 * 查询数据
	 */
	ServerResponse<PageUtil<List<ShopGoodsImages>>> page(int page,int limit);
	/**
	 * 新增数据
	 */
	ServerResponse<Integer> addGoodImages(ShopGoodsImages shopGoodsImages);
	/**
	 * 修改数据
	 */
	ServerResponse<Integer> updateGoodsImages(ShopGoodsImages shopGoodsImages);
	/**
	 * 删除数据
	 */
	ServerResponse<Integer> deleteGoodsImages(int goodsImageId);
}
