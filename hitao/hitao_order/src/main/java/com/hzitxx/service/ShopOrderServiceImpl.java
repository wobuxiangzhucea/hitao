package com.hzitxx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopOrder;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.mapper.ShopOrderMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class ShopOrderServiceImpl implements ShopOrderService{
	@Autowired
	private ShopOrderMapper orderMapper;
	/**
	 * 分页查询所有订单
	 */
	@Override
	public ServerResponse<PageUtil<List<ShopOrder>>> findShopOrders(int page, int limit) {
		PageHelper.startPage(page, limit);//开启PageHelper的分页功能
		List<ShopOrder> shopOrderList=orderMapper.findOrders();
		PageInfo<ShopOrder> pageInfo=new PageInfo<ShopOrder>(shopOrderList);
		PageUtil<List<ShopOrder>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setMsg("订单信息");
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("订单信息", pageUtil);
	}
	/**
	 * 增加订单
	 */
	@Override
	public ServerResponse<Integer> addShopOrder(ShopOrder shopOrder) {
		int i=orderMapper.addOrder(shopOrder);
		if(i==1){
			//成功
			return ServerResponse.createBySuccessMessage("增加成功");
		}
		//失败
		return null;
	}
	/**
	 * 修改订单
	 */
	@Override
	public ServerResponse<Integer> updateShopOrder(ShopOrder shopOrder) {
		int i=orderMapper.updateOrder(shopOrder);
		if(i==1){
			//成功
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		//失败
		return null;		
	}
	/**
	 * 删除订单
	 */
	@Override
	public ServerResponse<Integer> deleteShopOrder(int orderId) {
		int i=orderMapper.deleteOrder(orderId);
		if(i==1){
			//成功
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		//失败
		return null;
	}

}
