package com.hzit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopGoodsImages;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.GoodsImagesMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class GoodsImagesServiceImpl implements GoodsImagesService {
    @Autowired
    private GoodsImagesMapper mapper;
	@Override
	public ServerResponse<PageUtil<List<ShopGoodsImages>>> page(int page, int limit) {
		PageHelper.startPage(page, limit);
		List<ShopGoodsImages> list=mapper.getData();
		PageInfo<ShopGoodsImages> pageInfo=new PageInfo<>(list);
		PageUtil<List<ShopGoodsImages>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("");
		return ServerResponse.createBySuccess("商品图片", pageUtil);
	}

	@Override
	public ServerResponse<Integer> addGoodImages(ShopGoodsImages shopGoodsImages) {
		int result=mapper.addGoodImages(shopGoodsImages);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}

	@Override
	public ServerResponse<Integer> updateGoodsImages(ShopGoodsImages shopGoodsImages) {
		int result=mapper.updateGoodsImages(shopGoodsImages);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("编辑成功");
		}else {
			return ServerResponse.createByErrorMessage("编辑失败");
		}
	}

	@Override
	public ServerResponse<Integer> deleteGoodsImages(int goodsImageId) {
		int result=mapper.deleteGoodsImages(goodsImageId);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

}
