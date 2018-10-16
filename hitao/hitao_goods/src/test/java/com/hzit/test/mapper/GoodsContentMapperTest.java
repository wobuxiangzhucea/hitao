package com.hzit.test.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopGoodsContent;
import com.hzit.GoodsApplication8062;
import com.hzit.mapper.GoodsContentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=GoodsApplication8062.class)
public class GoodsContentMapperTest {
	@Autowired
	private GoodsContentMapper mapper;
	@Test
	public void testGetData() {
		List<ShopGoodsContent> list=mapper.getData();
		System.out.println(list);
				
	}
	@Test
	public void testAdd() {
		ShopGoodsContent shopGoodsContent=new ShopGoodsContent();
		shopGoodsContent.setContent("11223343445");
		shopGoodsContent.setGoodsId(66);
		mapper.addGoodContent(shopGoodsContent);
	}
	@Test
	public void testUpdate() {
		ShopGoodsContent shopGoodsContent=new ShopGoodsContent();
		shopGoodsContent.setContent("宝宝精水");
		shopGoodsContent.setGoodsId(66);
		mapper.updateGoodsContent(shopGoodsContent);
	}
	@Test
	public void testDelete() {
		mapper.deleteGoodsContent(66);
	}

}
