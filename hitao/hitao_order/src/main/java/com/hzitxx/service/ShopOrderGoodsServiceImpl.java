package com.hzitxx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopOrderGoods;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.mapper.ShopOrderGoodsMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Service
public class ShopOrderGoodsServiceImpl implements ShopOrderGoodsService {
	@Autowired
	private ShopOrderGoodsMapper orderGoodsMapper;
	/**
	 * 分页查询订单商品
	 * @return
	 */
	@Override
	public ServerResponse<PageUtil<List<ShopOrderGoods>>> findOrderGoods(int page,int limit) {
		PageHelper.startPage(page, limit);//开启PageHelper分页功能
		List<ShopOrderGoods> orderGoodsList=orderGoodsMapper.findOrderGoods();
		PageInfo<ShopOrderGoods> pageInfo=new PageInfo<>(orderGoodsList);
		PageUtil<List<ShopOrderGoods>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setMsg("订单商品信息");
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("订单商品信息", pageUtil);
	}
	/**
	 * 增加订单商品
	 */
	@Override
	public ServerResponse<Integer> addOrderGoods(ShopOrderGoods shopOrderGoods) {
		int i=orderGoodsMapper.addOrderGoods(shopOrderGoods);
		if(i==1){
			//增加成功
			return ServerResponse.createBySuccessMessage("增加成功");
		}
		//失败
		return null;
	}
	/**
	 * 修改订单商品
	 */
	@Override
	public ServerResponse<Integer> updateOrderGoods(ShopOrderGoods shopOrderGoods) {
		int i=orderGoodsMapper.updateOrderGoods(shopOrderGoods);
		if(i==1){
			//修改成功
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		//失败
		return null;
	}
	/**
	 * 删除订单商品
	 */
	@Override
	public ServerResponse<Integer> deleteOrderGoods(Integer recId) {
		int i=orderGoodsMapper.deleteOrderGoods(recId);
		if(i==1){
			//删除成功
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		//失败
		return null;
	}

}
