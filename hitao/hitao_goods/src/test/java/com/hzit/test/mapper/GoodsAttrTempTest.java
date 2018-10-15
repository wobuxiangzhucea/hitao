package com.hzit.test.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopGoodsAttrTemplate;
import com.hzit.GoodsApplication8762;
import com.hzit.mapper.GoodsAttrTempMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=GoodsApplication8762.class)
public class GoodsAttrTempTest {
	@Autowired
	private GoodsAttrTempMapper goodsAttrTempMapper;
    /**
      * 测试查询
     * 
     */
	@Test
	public void testGetData() {
		List<ShopGoodsAttrTemplate> list=goodsAttrTempMapper.getData();
		System.out.println(list);
	}
	/**
	 * 测试添加数据
	 */
	@Test
	public void testAdd() {
		ShopGoodsAttrTemplate shopGoodsAttrTemplate=new ShopGoodsAttrTemplate();
		shopGoodsAttrTemplate.setCreatedTime(new Date());
		shopGoodsAttrTemplate.setAttrValue("好吃不贵");
		goodsAttrTempMapper.addGoodAttrTemp(shopGoodsAttrTemplate);
	}
	/**
	 * 测试编辑
	 */
	@Test
	public void testUpdate() {
		ShopGoodsAttrTemplate shopGoodsAttrTemplate=new ShopGoodsAttrTemplate();
		shopGoodsAttrTemplate.setCreatedTime(new Date());
		shopGoodsAttrTemplate.setAttrValue("吃了还想吃");
		shopGoodsAttrTemplate.setAttrId(24);
		goodsAttrTempMapper.updateGoodAttrTemp(shopGoodsAttrTemplate);
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDelete() {
		goodsAttrTempMapper.deleteGoodsAttrTemp(24);
	}
}
