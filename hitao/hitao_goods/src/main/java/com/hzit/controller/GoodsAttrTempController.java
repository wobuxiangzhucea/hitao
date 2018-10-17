package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ShopGoodsAttrTemplate;
import com.hzit.service.GoodsAttrTempService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RestController
@RequestMapping("/goodsAttrTemp")
public class GoodsAttrTempController {

	@Autowired
	private GoodsAttrTempService service;
	/**
	 * 分页查询
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/page")
	public ServerResponse<PageUtil<List<ShopGoodsAttrTemplate>>> page(@RequestParam(value="page" ,defaultValue="1")int page,@RequestParam(value="limit" ,defaultValue="10")int limit) {
		return service.page(page, limit);
	}
	/**
	    * 新增
	    * @param 
	    * @return
	    */
	   @PostMapping("/add")
	   public ServerResponse<Integer> add(@RequestBody ShopGoodsAttrTemplate shopGoodsAttrTemplate){
		   return  service.addGoodAttrTemp(shopGoodsAttrTemplate);
	   }
	   /**
	    * 编辑
	    * @param 
	    * @return
	    */
	   @PostMapping("/update")
	   public ServerResponse<Integer> update(@RequestBody ShopGoodsAttrTemplate shopGoodsAttrTemplate){
		   return service.updateGoodAttrTemp(shopGoodsAttrTemplate);
	   }
	   /**
	    * 删除
	    * @param 
	    * @return
	    */
	   @PostMapping("/delete")
	   public ServerResponse<Integer> delete(int attrId){
		   return service.deleteGoodsAttrTemp(attrId);
	   }
}
