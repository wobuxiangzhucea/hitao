package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AuthcMicroService;
import com.entity.ShopRoleMenu;
import com.service.RoleMenuService;
import com.utils.ServerResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class RoleMenuServiceImplTest {
	/**
	 * 自动注入RoleMenuService实例
	 */
	@Autowired
	private RoleMenuService roleMenuService;
	
	/**
	 * 测试为角色授予权限
	 */
	@Test
	public void testAddRoleMenu() {
		ShopRoleMenu roleMenu=new ShopRoleMenu();
		roleMenu.setMenuId(3);
		roleMenu.setRoleId(17);
		ServerResponse<Integer> sr = roleMenuService.addRoleMenu(roleMenu);
		System.out.println(sr.getMsg());
	}
}
