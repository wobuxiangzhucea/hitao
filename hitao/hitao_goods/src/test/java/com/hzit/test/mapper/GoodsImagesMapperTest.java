package com.hzit.test.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopGoodsImages;
import com.hzit.GoodsApplication8062;
import com.hzit.mapper.GoodsImagesMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=GoodsApplication8062.class)
public class GoodsImagesMapperTest {

	@Autowired
	private GoodsImagesMapper mapper;
	@Test
	public void testGetData() {
		List<ShopGoodsImages> list=mapper.getData();
		System.out.println(list);
	}
	@Test
	public void testAdd() {
		ShopGoodsImages images=new ShopGoodsImages();
		images.setColorId(11);
		images.setGoodsImage("亚洲图片");
		images.setGoodsId(33);
		mapper.addGoodImages(images);
	}
	@Test
	public void testUpdate() {
		ShopGoodsImages images=new ShopGoodsImages();
		images.setColorId(222);
		images.setGoodsImage("亚洲图片");
		images.setGoodsId(333);
		images.setGoodsImageId(6);
		mapper.updateGoodsImages(images);
	}
	@Test
	public void testDelete() {
		mapper.deleteGoodsImages(6);
	}
}
