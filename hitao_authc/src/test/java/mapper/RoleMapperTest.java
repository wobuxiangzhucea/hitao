package mapper;

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
import com.mapper.RoleMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class RoleMapperTest {
	/**
	 * 自动注入roleMapper实例
	 */
	@Autowired
	private RoleMapper roleMapper;
	
	/**
	 * 测试增加系统角色
	 */
	@Test
	public void testAddRole() {
		ShopRole role=new ShopRole("娜美", "航海士", new Date(), 1, null, null,0);
		int result = roleMapper.addRole(role);
		System.out.println(result);
	}
	
	/**
	 * 测试删除系统角色
	 */
	@Test
	public void testDelRole() {
		int result = roleMapper.delRole(44);
		System.out.println(result);
	}
	
	/**
	 * 测试逻辑删除系统角色，isDel ：0：不删除 1：删除
	 */
	@Test
	public void testTombRole() {
		Map<String, Object> map = new HashMap<>();
		map.put("roleId", 42);
		map.put("isDel", 1);
		int result = roleMapper.tombRole(map);
		System.out.println(result);
	}
	/**
	 * 测试修改系统角色
	 */
	@Test
	public void testUpdateRole() {
		ShopRole role=new ShopRole("路飞", "航海士", null, null, new Date(), 2,0);
		int result = roleMapper.updateRole(role);
		System.out.println(result);
	}
	
	/**
	 * 测试查询全部角色/根据角色id查询角色
	 */
	@Test
	public void testFindRole() {
		Map<String, Object> map=new HashMap<>();
		List<ShopRole> list = roleMapper.findRole(map);
		System.out.println(list);
	}
}
