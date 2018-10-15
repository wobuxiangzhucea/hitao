package com.hzit.test.mapper;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopGoods;
import com.hzit.GoodsApplication8762;
import com.hzit.mapper.GoodsMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=GoodsApplication8762.class)
public class GoodsMapperTest {
	@Autowired
    private GoodsMapper goodsMapper;
	/**
	 * 测试查询商品
	 */
	@Test
	public void testData() {
		Map<String, Object> map=new HashMap<>();
		map.put("page", 1);
		map.put("limit", 5);
		List<ShopGoods> goods=goodsMapper.pageData();
		System.out.println(goods);
	}
	/**
	 * 测试增加商品
	 */
	@Test
	public void testAddGood() {
		ShopGoods shopGoods=new ShopGoods();
		shopGoods.setGoodsName("杜蕾斯");
		shopGoods.setGoodsPrice(new BigDecimal(10));
		int result=goodsMapper.addGood(shopGoods);
		System.out.println(result);
	}
	/**
	 * 测试修改商品信息
	 */
	@Test
	public void testUpdateGood() {
		ShopGoods shopGoods=new ShopGoods();
		shopGoods.setGoodsName("冈本");
		shopGoods.setGoodsPrice(new BigDecimal(10));
		shopGoods.setGoodsId(16);
		int result=goodsMapper.updateGood(shopGoods);
		System.out.println(result);
	}
	/**
	 * 测试物理删除
	 */
	@Test
	public void testDeleteGoods() {
		int result=goodsMapper.deleteGoods(20);
		System.out.println(result);
	}
	/**
	 * 测试逻辑删除
	 */
	@Test
	public void testIsDel() {
		ShopGoods shopGoods=new ShopGoods();
		shopGoods.setIsDel(0);
		shopGoods.setGoodsId(2);
		int result=goodsMapper.isDel(shopGoods);
		System.out.println(result);
	}
}
