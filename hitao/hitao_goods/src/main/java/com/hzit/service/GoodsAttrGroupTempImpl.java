package com.hzit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopGoodsAttrGroupTemp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.GoodsAttrGroupTempMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class GoodsAttrGroupTempImpl implements GoodsAttrGroupTempService {

	@Autowired
	private GoodsAttrGroupTempMapper goodsAttrGroupTempMapper;
	@Override
	public ServerResponse<PageUtil<List<ShopGoodsAttrGroupTemp>>> page(int page, int limit) {
		PageHelper.startPage(page, limit);
		List<ShopGoodsAttrGroupTemp> list=goodsAttrGroupTempMapper.getData();
		PageInfo< ShopGoodsAttrGroupTemp> pageInfo=new PageInfo<>(list);
		PageUtil<List<ShopGoodsAttrGroupTemp>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("");
		return ServerResponse.createBySuccess("商品信息模块中间表信息", pageUtil);
	}

	@Override
	public ServerResponse<Integer> addGoodAttrGroupTemp(ShopGoodsAttrGroupTemp shopGoodsAttrGroupTemp) {
		int result=goodsAttrGroupTempMapper.addGoodAttrGroupTemp(shopGoodsAttrGroupTemp);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return ServerResponse.createByErrorMessage("添加失败");
		}
		
	}

	@Override
	public ServerResponse<Integer> updateGoodAttrGroupTemp(ShopGoodsAttrGroupTemp shopGoodsAttrGroupTemp) {
		int result=goodsAttrGroupTempMapper.updateGoodAttrGroupTemp(shopGoodsAttrGroupTemp);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("编辑成功");
		}else {
			return ServerResponse.createByErrorMessage("编辑失败");
		}
	}

	@Override
	public ServerResponse<Integer> deleteGoodsAttrGroupTemp(int id) {
		int result=goodsAttrGroupTempMapper.deleteGoodsAttrGroupTemp(id);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

}
