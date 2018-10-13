package mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AuthcMicroService;
import com.entity.ShopAdminRole;
import com.mapper.AdminRoleMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class AdminRoleMapperTest {
	/**
	 * 自动注入AdminRoleMapper实例
	 */
	@Autowired
	private AdminRoleMapper adminRoleMapper;
	
	/**
	 * 测试为管理员授予角色
	 */
	@Test
	public void testAddAdminRole() {
		ShopAdminRole adminRole=new ShopAdminRole();
		adminRole.setAdminId(17);
		adminRole.setRoleId(22);
		int result = adminRoleMapper.addAdminRole(adminRole);
		System.out.println(result);
	}
}
