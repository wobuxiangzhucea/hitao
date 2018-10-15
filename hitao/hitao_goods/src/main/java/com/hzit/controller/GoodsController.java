package com.hzit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ShopGoods;
import com.hzit.service.GoodsService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService service;
    @GetMapping("/goods")
    @ResponseBody
    public ServerResponse<PageUtil<List<ShopGoods>>> goods(int page,int limit){
    	return service.page(page, limit);
    }
}
