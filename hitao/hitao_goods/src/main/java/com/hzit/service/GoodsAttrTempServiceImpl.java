package com.hzit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopGoodsAttrTemplate;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.GoodsAttrTempMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class GoodsAttrTempServiceImpl implements GoodsAttrTempService {
    @Autowired
    private GoodsAttrTempMapper goodsAttrTempMapper;
	@Override
	public ServerResponse<PageUtil<List<ShopGoodsAttrTemplate>>> page(int page, int limit) {
		PageHelper.startPage(page, limit);
		List<ShopGoodsAttrTemplate> list=goodsAttrTempMapper.getData();
		PageInfo<ShopGoodsAttrTemplate> pageInfo=new PageInfo<>(list);
		PageUtil<List<ShopGoodsAttrTemplate>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("");
		return ServerResponse.createBySuccess("商品属性模板", pageUtil);
	}

	@Override
	public ServerResponse<Integer> addGoodAttrTemp(ShopGoodsAttrTemplate shopGoodsAttrTemplate) {
		int result=goodsAttrTempMapper.addGoodAttrTemp(shopGoodsAttrTemplate);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}

	@Override
	public ServerResponse<Integer> updateGoodAttrTemp(ShopGoodsAttrTemplate shopGoodsAttrTemplate) {
		int result=goodsAttrTempMapper.updateGoodAttrTemp(shopGoodsAttrTemplate);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("编辑成功");
		}else {
			return ServerResponse.createByErrorMessage("编辑失败");
		}
	}

	@Override
	public ServerResponse<Integer> deleteGoodsAttrTemp(int attrId) {
		int result=goodsAttrTempMapper.deleteGoodsAttrTemp(attrId);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

	@Override
	public ServerResponse<Integer> isDel(ShopGoodsAttrTemplate shopGoodsAttrTemplate) {
		int result=goodsAttrTempMapper.isDel(shopGoodsAttrTemplate);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("禁用成功");
		}else {
			return ServerResponse.createByErrorMessage("禁用失败");
		}
	}

}
