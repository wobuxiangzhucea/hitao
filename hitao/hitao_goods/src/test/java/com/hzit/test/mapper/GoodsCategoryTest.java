package com.hzit.test.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopGoodsCategory;
import com.hzit.mapper.GoodsCategoryMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GoodsCategoryTest {

	@Autowired
	private GoodsCategoryMapper goodsCategoryMapper;
	@Test
	public void testGetData() {
		List<ShopGoodsCategory> list=goodsCategoryMapper.getData();
		System.out.println(list);
		
	}
	@Test
	public void testAdd() {
		ShopGoodsCategory shopGoodsCategory=new ShopGoodsCategory();
		shopGoodsCategory.setCatName("日常用品");
		shopGoodsCategory.setCreatedTime(new Date());
		shopGoodsCategory.setIsDel(0);
		goodsCategoryMapper.addGoodCategory(shopGoodsCategory);
	}
	@Test
	public void testUpdate() {
		ShopGoodsCategory shopGoodsCategory=new ShopGoodsCategory();
		shopGoodsCategory.setCatName("日常用品new");
		shopGoodsCategory.setCreatedTime(new Date());
		shopGoodsCategory.setCatId(23);
		shopGoodsCategory.setIsDel(0);
		goodsCategoryMapper.updateGoodsCategory(shopGoodsCategory);
	}
	@Test
	public void testDelete() {
		goodsCategoryMapper.deleteGoodsCategory(23);
	}
}
