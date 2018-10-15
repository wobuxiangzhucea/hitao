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

import com.AuthcMicroService;
import com.entity.ShopAdmin;
import com.service.AdminService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class AdminServiceImplTest {
	/**
	 * 自动注入AdminService实例
	 */
	@Autowired
	private AdminService adminService;
	
	/**
	 * 测试添加管理员
	 */
	@Test
	public void testAddAdmin() {
		ShopAdmin admin=new ShopAdmin("wcc", "333", 1, "127.0.0.1", 0, "test@qq.com", 0, null, null, null, 1, new Date(), null, null);
		ServerResponse<Integer> serverResponse = adminService.addAdmin(admin);
		System.out.println(serverResponse.getMsg());
	}
	
	/**
	 * 逻辑删除管理员
	 */
	@Test
	public void testTombAdmin() {
		Map<String, Object> map = new HashMap<>();
		map.put("adminId", 6);
		map.put("isDel", 1);
		ServerResponse<Integer> sr = adminService.tombAdmin(map);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 删除管理员
	 */
	@Test
	public void testDelAdmin() {
		ServerResponse<Integer> sr = adminService.delAdmin(6);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 修改管理员
	 */
	@Test
	public void testUpdateAdmin() {
		ShopAdmin admin=new ShopAdmin("wcc", "333", 1, "127.0.0.1", 0, "test1@qq.com", 0, null, null, null, 1, new Date(), null, null);
		ServerResponse<Integer> sr = adminService.updateAdmin(admin);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试查询分页
	 */
	@Test
	public void testPage() {
		ServerResponse<PageUtil<List<ShopAdmin>>> serverResponse = adminService.page(1, 5,0);
		System.out.println(serverResponse.getData().getData());
		System.out.println(serverResponse.getData().getCount());
	}
}
