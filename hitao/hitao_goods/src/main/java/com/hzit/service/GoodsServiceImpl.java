package com.hzit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopGoods;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.GoodsMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
    /**
     * 使用Pagehelper进行分页
     */
	@Override
	public ServerResponse<PageUtil<List<ShopGoods>>> page(int page,int limit) {
		PageHelper.startPage(page, limit);
		List<ShopGoods> list=goodsMapper.pageData();
		PageInfo<ShopGoods> pageInfo=new PageInfo<>(list);
		PageUtil<List<ShopGoods>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("商品数据");
		return ServerResponse.createBySuccess("商品数据",pageUtil);
	}
	/**
	 * 添加商品信息
	 */
	@Override
	public ServerResponse<Integer> addGood(ShopGoods shopGoods) {
		int result=goodsMapper.addGood(shopGoods);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}
	@Override
	public ServerResponse<Integer> updateGood(ShopGoods shopGoods) {
		int result=goodsMapper.updateGood(shopGoods);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("编辑成功");
		}else {
			return ServerResponse.createByErrorMessage("编辑失败");
		}
	}
	@Override
	public ServerResponse<Integer> deleteGoods(int goodsId) {
		int result=goodsMapper.deleteGoods(goodsId);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}
	@Override
	public ServerResponse<Integer> isDel(ShopGoods shopGoods) {
		int result=goodsMapper.isDel(shopGoods);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("禁用成功");
		}else {
			return ServerResponse.createByErrorMessage("禁用失败");
		}
	}

}
