package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ShopGoodsAttr;
import com.hzit.service.GoodsAttrService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RestController
@RequestMapping("/goodsAttr")
public class GoodsAttrController {
  
	@Autowired
	private GoodsAttrService  service;
	/**
	 * 分页查询数据
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/page")
	public ServerResponse<PageUtil<List<ShopGoodsAttr>>> page(@RequestParam(value="page" ,defaultValue="1")int page,@RequestParam(value="limit" ,defaultValue="10")int limit){
		return service.page(page, limit);
	}
	/**
	    * 新增
	    * @param 
	    * @return
	    */
	   @PostMapping("/add")
	   public ServerResponse<Integer> add(@RequestBody ShopGoodsAttr shopGoodsAttr){
		   return  service.addGoodAttr(shopGoodsAttr);
	   }
	   /**
	    * 编辑
	    * @param 
	    * @return
	    */
	   @PostMapping("/update")
	   public ServerResponse<Integer> update(@RequestBody ShopGoodsAttr shopGoodsAttr){
		   return service.updateGoodAttr(shopGoodsAttr);
	   }
	   /**
	    * 删除
	    * @param 
	    * @return
	    */
	   @PostMapping("/delete")
	   public ServerResponse<Integer> delete(int goodsId){
		   return service.deleteGoodsAttr(goodsId);
	   }
}
