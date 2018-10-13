package com.hzit.test.mapper;


import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopGoodsAttr;
import com.hzit.GoodsApplication8762;
import com.hzit.mapper.GoodsAttrMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=GoodsApplication8762.class)
public class GoodsAttrMapperTest {
	@Autowired
	private GoodsAttrMapper goodsAttrMapper;
	/**
	 * 测试查询数据
	 */
	@Test
	public void testGetData() {
		List<ShopGoodsAttr> list=goodsAttrMapper.getData();
		System.out.println(list);
	}
	/**
	 * 测试增加数据
	 */
    @Test
    public void testAddGoodsAttr() {
    	ShopGoodsAttr sga=new ShopGoodsAttr();
    	sga.setCatId(22);
    	sga.setCreatedTime(new Date());
    	sga.setGoodsId(2);
    	sga.setIsDel(0);
    	int result=goodsAttrMapper.addGoodAttr(sga);
    	System.out.println(result);
    }
    /**
     * 测试修改数据
     */
    @Test
    public void testUpdateGoodsAttr() {
    	ShopGoodsAttr sga=new ShopGoodsAttr();
    	sga.setCreatedTime(new Date());
    	sga.setGoodsId(2);
    	sga.setIsDel(1);
    	int result=goodsAttrMapper.updateGoodAttr(sga);
    	System.out.println(result);
    }
    /**
     * 测试删除数据
     */
    @Test
    public void testDeleteGoodsAttr() {
    	goodsAttrMapper.deleteGoodsAttr(2);
    }
}
