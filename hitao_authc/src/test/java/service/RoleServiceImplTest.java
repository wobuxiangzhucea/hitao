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
import com.entity.ShopRole;
import com.service.RoleService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class RoleServiceImplTest {
	/**
	 * 自动注入RoleService实例
	 */
	@Autowired
	private RoleService roleService;
	
	/**
	 * 测试增加角色
	 */
	@Test
	public void testAddRole() {
		ShopRole role=new ShopRole("罗宾", "考古学家", new Date(), 1, null, null,0);
		ServerResponse<Integer> sr=roleService.addRole(role);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试逻辑删除角色
	 */
	@Test
	public void testTombRole() {
		Map<String, Object> map = new HashMap<>();
		map.put("roleId", 42);
		map.put("isDel", 0);
		ServerResponse<Integer> sr = roleService.tombRole(map);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试删除角色
	 */
	@Test
	public void testDelRole() {
		ServerResponse<Integer> sr = roleService.delRole(42);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试修改角色
	 */
	@Test
	public void testUpdateRole() {
		ShopRole role=new ShopRole("罗宾", "考古学家", new Date(), 1, null, null,1);
		ServerResponse<Integer> sr=roleService.addRole(role);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试查询角色
	 */
	@Test
	public void testFindRole() {
		ServerResponse<PageUtil<List<ShopRole>>> sr = roleService.page(1, 5, 0, null);
		System.out.println(sr.getData().getData());
		System.out.println(sr.getData().getCount());
	}
}
