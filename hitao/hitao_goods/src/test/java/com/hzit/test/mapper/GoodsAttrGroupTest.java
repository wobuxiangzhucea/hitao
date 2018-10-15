package com.hzit.test.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopGoodsAttrGroup;
import com.hzit.GoodsApplication8762;
import com.hzit.mapper.GoodsAttrGroupMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=GoodsApplication8762.class)
public class GoodsAttrGroupTest {
	@Autowired
   private GoodsAttrGroupMapper goodsAttrGroupMapper;
	@Test
	public void testGetData() {
		List<ShopGoodsAttrGroup> list=goodsAttrGroupMapper.getData();
		System.out.println(list);
		
	}
	@Test
	public void testAddGoodsAttrGroup() {
		ShopGoodsAttrGroup shopGoodsAttrGroup=new ShopGoodsAttrGroup();
		shopGoodsAttrGroup.setGroupName("蛋白质");
		goodsAttrGroupMapper.addGoodAttrGroup(shopGoodsAttrGroup);
	}
	@Test
	public void testUpdateGoodsAttrGroup() {
		ShopGoodsAttrGroup shopGoodsAttrGroup=new ShopGoodsAttrGroup();
		shopGoodsAttrGroup.setGroupName("奶制品");
		shopGoodsAttrGroup.setGroupId(1);
		goodsAttrGroupMapper.updateGoodAttrGroup(shopGoodsAttrGroup);
	}
	@Test
	public void testDeleteGoodsAttrGroup() {
		goodsAttrGroupMapper.deleteGoodsAttrGroup(1);
	}
}
