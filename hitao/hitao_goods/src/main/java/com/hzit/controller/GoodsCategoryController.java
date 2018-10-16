package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ShopGoodsCategory;
import com.hzit.service.GoodsCategoryService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RestController
@RequestMapping("/goodsCategory")
public class GoodsCategoryController {
	@Autowired
	private GoodsCategoryService service;
	@GetMapping("/page")
	public ServerResponse<PageUtil<List<ShopGoodsCategory>>> page(@RequestParam(value="page" ,defaultValue="1")int page,@RequestParam(value="limit" ,defaultValue="10")int limit){
		return service.page(page, limit);
	}
	/**
	    * 新增
	    * @param 
	    * @return
	    */
	   @PostMapping("/add")
	   public ServerResponse<Integer> add(@RequestBody ShopGoodsCategory shopGoodsCategory){
		   //System.out.println(shopGoodsImages);
		   return  service.addGoodCategory(shopGoodsCategory);
	   }
	   /**
	    * 编辑
	    * @param 
	    * @return
	    */
	   @PostMapping("/update")
	   public ServerResponse<Integer> update(@RequestBody ShopGoodsCategory shopGoodsCategory){
		   return service.updateGoodsCategory(shopGoodsCategory);
	   }
	   /**
	    * 删除
	    * @param 
	    * @return
	    */
	   @PostMapping("/delete")
	   public ServerResponse<Integer> delete(int catId){
		   return service.deleteGoodsCategory(catId);
	   }
}
