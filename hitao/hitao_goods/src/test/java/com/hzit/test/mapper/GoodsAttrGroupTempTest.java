package com.hzit.test.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopGoodsAttrGroupTemp;
import com.hzit.GoodsApplication8062;
import com.hzit.mapper.GoodsAttrGroupTempMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=GoodsApplication8062.class)
public class GoodsAttrGroupTempTest {
	@Autowired
	private GoodsAttrGroupTempMapper goodsAttrGroupTempMapper;
   /**
     * 测试查询数据
    */
	@Test
	public void testGetData() {
		List<ShopGoodsAttrGroupTemp> list=goodsAttrGroupTempMapper.getData();
		System.out.println(list);
	}
	/**
	 * 测试添加数据
	 */
	@Test
	public void testAddGoodsAttrGroupTemp() {
		ShopGoodsAttrGroupTemp shopGoodsAttrGroupTemp=new ShopGoodsAttrGroupTemp();
		shopGoodsAttrGroupTemp.setAttrGroupId(1);
		shopGoodsAttrGroupTemp.setAttrId(2);
		goodsAttrGroupTempMapper.addGoodAttrGroupTemp(shopGoodsAttrGroupTemp);
	}
	/**
	 * 测试编辑数据
	 */
	@Test
	public void testUpdateGoodsAttrGroupTemp() {
		ShopGoodsAttrGroupTemp shopGoodsAttrGroupTemp=new ShopGoodsAttrGroupTemp();
		shopGoodsAttrGroupTemp.setAttrGroupId(3);
		shopGoodsAttrGroupTemp.setAttrId(6);
		goodsAttrGroupTempMapper.updateGoodAttrGroupTemp(shopGoodsAttrGroupTemp);
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDeleteGoodsAttrGroupTemp() {
		goodsAttrGroupTempMapper.deleteGoodsAttrGroupTemp(1);
	}
}
