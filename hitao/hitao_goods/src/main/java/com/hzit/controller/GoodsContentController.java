package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ShopGoodsContent;
import com.hzit.service.GoodsContentService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RestController
@RequestMapping("/goodsContent")
public class GoodsContentController {

	@Autowired
	private GoodsContentService service;
	@GetMapping("/page")
	public ServerResponse<PageUtil<List<ShopGoodsContent>>> page(@RequestParam(value="page" ,defaultValue="1")int page,@RequestParam(value="limit" ,defaultValue="10")int limit){
		return service.page(page, limit);
	}
	/**
	    * 新增
	    * @param 
	    * @return
	    */
	   @PostMapping("/add")
	   public ServerResponse<Integer> add(@RequestBody ShopGoodsContent shopGoodsContent){
		   return  service.addGoodContent(shopGoodsContent);
	   }
	   /**
	    * 编辑
	    * @param 
	    * @return
	    */
	   @PostMapping("/update")
	   public ServerResponse<Integer> update(@RequestBody ShopGoodsContent shopGoodsContent){
		   return service.updateGoodsContent(shopGoodsContent);
	   }
	   /**
	    * 删除
	    * @param 
	    * @return
	    */
	   @PostMapping("/delete")
	   public ServerResponse<Integer> delete(int goodsId){
		   return service.deleteGoodsContent(goodsId);
	   }
}
