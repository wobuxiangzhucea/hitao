package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ShopGoodsImages;
import com.hzit.service.GoodsImagesService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RestController
@RequestMapping("/goodsImages")
public class GoodsImagesController {
   @Autowired
   private GoodsImagesService service;
   /**
    * 分页查询
    * @param page
    * @param limit
    * @return
    */
   @GetMapping("/page")
   public ServerResponse<PageUtil<List<ShopGoodsImages>>> page(@RequestParam(value="page" ,defaultValue="1")int page,@RequestParam(value="limit" ,defaultValue="10")int limit){
	   return service.page(page, limit);
   }
   /**
    * 新增
    * @param shopGoodsImages
    * @return
    */
   @PostMapping("/add")
   public ServerResponse<Integer> add(@RequestBody ShopGoodsImages shopGoodsImages){
	   //System.out.println(shopGoodsImages);
	   return  service.addGoodImages(shopGoodsImages);
   }
   /**
    * 编辑
    * @param shopGoodsImages
    * @return
    */
   @PostMapping("/update")
   public ServerResponse<Integer> update(@RequestBody ShopGoodsImages shopGoodsImages){
	   return service.updateGoodsImages(shopGoodsImages);
   }
   /**
    * 删除
    * @param goodsImageId  商品图片id 
    * @return
    */
   @PostMapping("/delete")
   public ServerResponse<Integer> delete(int goodsImageId){
	   return service.deleteGoodsImages(goodsImageId);
   }
}
