package mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AuthcMicroService;
import com.entity.ShopRoleMenu;
import com.mapper.RoleMenuMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class RoleMenuMapperTest {
	/**
	 * 自动注入RoleMenuMapper实例
	 */
	@Autowired
	private RoleMenuMapper roleMenuMapper;
	
	/**
	 * 测试为角色授予权限
	 */
	@Test
	public void testAddRoleMenu() {
		ShopRoleMenu roleMenu=new ShopRoleMenu();
		roleMenu.setMenuId(3);
		roleMenu.setRoleId(18);
		int result = roleMenuMapper.addRoleMenu(roleMenu);
		System.out.println(result);
	}
}
