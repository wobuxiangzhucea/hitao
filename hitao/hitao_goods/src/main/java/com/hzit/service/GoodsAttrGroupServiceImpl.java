package com.hzit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopGoodsAttrGroup;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.GoodsAttrGroupMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class GoodsAttrGroupServiceImpl implements GoodsAttrGroupService {

	@Autowired
	private GoodsAttrGroupMapper mapper;
	@Override
	public ServerResponse<PageUtil<List<ShopGoodsAttrGroup>>> page(int page,int limit) {
		PageHelper.startPage(page, limit);
		List<ShopGoodsAttrGroup> list=mapper.getData();
		PageInfo<ShopGoodsAttrGroup> pageInfo=new PageInfo<>(list);
		PageUtil<List<ShopGoodsAttrGroup>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("商品属性组");
		return ServerResponse.createBySuccess("商品属性组信息", pageUtil);
	}

	@Override
	public ServerResponse<Integer> addGoodAttrGroup(ShopGoodsAttrGroup shopGoodsAttrGroup) {
		int result=mapper.addGoodAttrGroup(shopGoodsAttrGroup);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}

	@Override
	public ServerResponse<Integer> updateGoodAttrGroup(ShopGoodsAttrGroup shopGoodsAttrGroup) {
		int result=mapper.updateGoodAttrGroup(shopGoodsAttrGroup);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("编辑成功");
		}else {
			return ServerResponse.createByErrorMessage("编辑失败");
		}
	}

	@Override
	public ServerResponse<Integer> deleteGoodsAttrGroup(int groupId) {
		int result=mapper.deleteGoodsAttrGroup(groupId);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

}
