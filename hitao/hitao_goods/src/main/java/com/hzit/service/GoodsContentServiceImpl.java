package com.hzit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopGoodsContent;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzit.mapper.GoodsContentMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class GoodsContentServiceImpl implements GoodsContentService {
 
	@Autowired
	private GoodsContentMapper goodsContentMapper;
	@Override
	public ServerResponse<PageUtil<List<ShopGoodsContent>>> page(int page, int limit) {
		PageHelper.startPage(page, limit);
		List<ShopGoodsContent> list=goodsContentMapper.getData();
		PageInfo<ShopGoodsContent> pageInfo=new PageInfo<>(list);
		PageUtil<List<ShopGoodsContent>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("");
		return ServerResponse.createBySuccess("商品内容",pageUtil);
	}

	@Override
	public ServerResponse<Integer> addGoodContent(ShopGoodsContent shopGoodsContent) {
		int result =goodsContentMapper.addGoodContent(shopGoodsContent);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}

	@Override
	public ServerResponse<Integer> updateGoodsContent(ShopGoodsContent shopGoodsContent) {
		int result=goodsContentMapper.updateGoodsContent(shopGoodsContent);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("编辑成功");
		}else {
			return ServerResponse.createByErrorMessage("编辑失败");
		}
	}

	@Override
	public ServerResponse<Integer> deleteGoodsContent(int goodsId) {
		int result=goodsContentMapper.deleteGoodsContent(goodsId);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

}
