package service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.ShopAdminLog;
import com.hzit.AuthcMicroService;
import com.hzit.service.AdminLogService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class AdminLogServiceImplTest {
	/**
	 * 自动注入AdminLogService实例
	 */
	@Autowired
	private AdminLogService adminLogService;
	
	/**
	 * 测试添加日志
	 */
	@Test
	public void testAddAdminLog() {
		ShopAdminLog adminLog=new ShopAdminLog("hahaha", null, null, null, null, 0, new Date(), null);
		ServerResponse<Integer> sr = adminLogService.addAdminLog(adminLog);
		System.out.println(sr.getMsg());
	}
	
	/*
	 * 测试逻辑删除日志
	 */
	@Test
	public void testTombAdminLog() {
		Map<String, Object> map = new HashMap<>();
		map.put("logId", 4);
		map.put("isDel", 1);
		ServerResponse<Integer> sr = adminLogService.tombAdminLog(map);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试删除日志
	 */
	@Test
	public void testDelAdminLog() {
		ServerResponse<Integer> sr = adminLogService.delAdminLog(4);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试修改日志
	 */
	@Test
	public void testUpdateAdminLog() {
		ShopAdminLog adminLog=new ShopAdminLog("world", null, null, null, null, 0, new Date(), null);
		adminLog.setLogId(1);
		ServerResponse<Integer> sr = adminLogService.updateAdminLog(adminLog);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试分页查询日志
	 */
	@Test
	public void testFindAdminLog() {
		ServerResponse<PageUtil<List<ShopAdminLog>>> sr = adminLogService.findAdminLog(1, 5, 0);
		System.out.println(sr.getData().getData());
		System.out.println(sr.getData().getCount());
	}
}
