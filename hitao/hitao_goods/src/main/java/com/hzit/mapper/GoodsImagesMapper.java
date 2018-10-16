package com.hzit.mapper;

import java.util.List;

import com.entity.ShopGoodsImages;

public interface GoodsImagesMapper {

	/**
	 * 查询数据
	 */
	List<ShopGoodsImages> getData();
	/**
	 * 新增数据
	 */
	int addGoodImages(ShopGoodsImages shopGoodsImages);
	/**
	 * 修改数据
	 */
	int updateGoodsImages(ShopGoodsImages shopGoodsImages);
	/**
	 * 删除数据
	 */
	int deleteGoodsImages(int goodsImageId);
}
