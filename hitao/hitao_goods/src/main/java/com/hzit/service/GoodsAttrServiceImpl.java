package com.hzit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopGoodsAttr;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.GoodsAttrMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class GoodsAttrServiceImpl implements GoodsAttrService {
    @Autowired 
    private GoodsAttrMapper goodsAttrMapper;
	@Override
	public ServerResponse<PageUtil<List<ShopGoodsAttr>>> page(int page, int limit) {
		PageHelper.startPage(page, limit);
		List<ShopGoodsAttr> list=goodsAttrMapper.getData();
		PageInfo<ShopGoodsAttr> pageInfo=new PageInfo<>(list);
		PageUtil<List<ShopGoodsAttr>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("商品属性");
		return ServerResponse.createBySuccess("商品属性信息", pageUtil);
	}

	@Override
	public ServerResponse<Integer> addGoodAttr(ShopGoodsAttr shopGoodsAttr) {
		int result=goodsAttrMapper.addGoodAttr(shopGoodsAttr);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}

	@Override
	public ServerResponse<Integer> updateGoodAttr(ShopGoodsAttr shopGoodsAttr) {
		int result=goodsAttrMapper.updateGoodAttr(shopGoodsAttr);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("编辑成功");
		}else {
			return ServerResponse.createByErrorMessage("编辑失败");
		}
	}

	@Override
	public ServerResponse<Integer> deleteGoodsAttr(int goodsId) {
		int result =goodsAttrMapper.deleteGoodsAttr(goodsId);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

}
