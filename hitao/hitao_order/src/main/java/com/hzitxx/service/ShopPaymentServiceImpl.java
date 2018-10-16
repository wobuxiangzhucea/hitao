package com.hzitxx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopPayment;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.mapper.ShopPaymentMapper;
import com.utils.PageUtil;
import com.utils.ServerResponse;
@Service
public class ShopPaymentServiceImpl implements ShopPaymentService {
	@Autowired
	private ShopPaymentMapper paymentMapper;
	/**
	 * 分页查询所有支付方式
	 */
	@Override
	public ServerResponse<PageUtil<List<ShopPayment>>> findShopPayments(int page,int limit) {
		PageHelper.startPage(page, limit);
		List<ShopPayment> paymentList=paymentMapper.findShopPayments();
		PageInfo<ShopPayment> pageInfo=new PageInfo<>(paymentList);
		PageUtil<List<ShopPayment>> pageUtil=new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setMsg("支付方式信息");
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("支付方式信息", pageUtil);
	}
	/**
	 * 增加支付方式
	 */
	@Override
	public ServerResponse<Integer> addShopPayment(ShopPayment shopPayment) {
		int i=paymentMapper.addShopPayment(shopPayment);
		if(i==1){
			return ServerResponse.createBySuccessMessage("增加成功");
		}
		return null;
	}

	@Override
	public ServerResponse<Integer> updateShopPayment(ShopPayment shopPayment) {
		int i=paymentMapper.updateShopPayment(shopPayment);
		if(i==1){
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		return null;
	}

	@Override
	public ServerResponse<Integer> deleteShopPayment(Integer paymentId) {
		int i=paymentMapper.deleteShopPayment(paymentId);
		if(i==1){
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		return null;
	}

}
