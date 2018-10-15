package com.hzit.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzit.GoodsApplication8762;
import com.hzit.service.GoodsAttrTempService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=GoodsApplication8762.class)
public class GoodsAttrTempServiceTest {
 @Autowired
 private GoodsAttrTempService service;
 @Test
 public void testPage() {
	
	System.out.println(service.page(1, 5));
 }
	
}
