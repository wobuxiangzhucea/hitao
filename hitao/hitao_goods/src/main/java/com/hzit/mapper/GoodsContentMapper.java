package com.hzit.mapper;

import java.util.List;

import com.entity.ShopGoodsContent;

public interface GoodsContentMapper {
 
	/**
	 * 查询数据
	 */
	List<ShopGoodsContent> getData();
	/**
	 * 新增数据
	 */
	int addGoodContent(ShopGoodsContent shopGoodsContent);
	/**
	 * 修改数据
	 */
	int updateGoodsContent(ShopGoodsContent shopGoodsContent);
	/**
	 * 删除数据
	 */
	int deleteGoodsContent(int goodsId);
}
