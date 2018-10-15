package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AuthcMicroService;
import com.entity.ShopAdminRole;
import com.service.AdminRoleService;
import com.utils.ServerResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class AdminRoleServiceImplTest {
	/**
	 * 自动注入AdminRoleService实例
	 */
	@Autowired
	private AdminRoleService ars;
	
	/**
	 * 为管理员授予角色
	 */
	@Test
	public void testAddAdminRole() {
		ShopAdminRole adminRole=new ShopAdminRole();
		adminRole.setAdminId(17);
		adminRole.setRoleId(23);
		ServerResponse<Integer> sr = ars.addAdminRole(adminRole);
		System.out.println(sr.getMsg());
	}
}
