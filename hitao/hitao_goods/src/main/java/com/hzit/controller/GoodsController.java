package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ShopGoods;
import com.hzit.service.GoodsService;
import com.utils.PageUtil;
import com.utils.ServerResponse;


@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService service;
    /**
     * 分页查询
     * @param page  页数
     * @param limit 条数
     * @return
     */
    @GetMapping("/page")
    public ServerResponse<PageUtil<List<ShopGoods>>> page(@RequestParam(value="page" ,defaultValue="1")int page,@RequestParam(value="limit" ,defaultValue="10")int limit){
    	return service.page(page, limit);
    }
    /**
     * 添加商品信息
     * @param shopGoods
     * @return
     */
    @PostMapping("/add")
    public ServerResponse<Integer> add(@RequestBody ShopGoods shopGoods){
    	return service.addGood(shopGoods);
    }
    /**
     * 编辑商品信息
     * @param shopGoods
     * @return
     */
    @PostMapping("/update")
    public ServerResponse<Integer> Update(@RequestBody ShopGoods shopGoods){
    	return service.updateGood(shopGoods);
    }
    /**
     * 根据商品id删除商品
     * @param goodsId
     * @return
     */
    @PostMapping("/delete")
    public ServerResponse<Integer> delete(int goodsId){
    	return service.deleteGoods(goodsId);
    }
//    @GetMapping("/login")
//    public String login() {
//    	return "登录成功";
//    }
}
