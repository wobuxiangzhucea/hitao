package com.hzit.service;

import static org.hamcrest.CoreMatchers.endsWith;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopGoodsCategory;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.GoodsCategoryMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
     
	@Autowired
	private GoodsCategoryMapper goodsCategoryMapper;
	/**
	 * 查询
	 */
	@Override
	public ServerResponse<PageUtil<List<ShopGoodsCategory>>> page(int page,int limit) {
		PageHelper.startPage(page, limit);
		List<ShopGoodsCategory> list=goodsCategoryMapper.getData();
		PageInfo<ShopGoodsCategory> pageInfo=new PageInfo<>(list);
		PageUtil<List<ShopGoodsCategory>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("");
		return ServerResponse.createBySuccess("商品分类", pageUtil);
	}

	@Override
	public ServerResponse<Integer> addGoodCategory(ShopGoodsCategory shopGoodsCategory) {
		int result=goodsCategoryMapper.addGoodCategory(shopGoodsCategory);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}

	@Override
	public ServerResponse<Integer> updateGoodsCategory(ShopGoodsCategory shopGoodsCategory) {
		int result=goodsCategoryMapper.updateGoodsCategory(shopGoodsCategory);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("编辑成功");
		}else {
			return ServerResponse.createByErrorMessage("编辑失败");
		}
	}

	@Override
	public ServerResponse<Integer> deleteGoodsCategory(int catId) {
		int result=goodsCategoryMapper.deleteGoodsCategory(catId);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

}
