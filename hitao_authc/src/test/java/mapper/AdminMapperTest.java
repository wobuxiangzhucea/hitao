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
import com.entity.ShopAdmin;
import com.mapper.AdminMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class AdminMapperTest {
	/**
	 * 自动注入AdminMapper实例
	 */
	@Autowired
	private AdminMapper adminMapper;
	
	/**
	 * 测试增加管理员
	 */
	@Test
	public void testAddAdmin() {
		ShopAdmin admin=new ShopAdmin("wjj", "111", 1, "127.0.0.1", 0, "test@qq.com", 0, null, null, null, 1, new Date(), null, null);
		int result = adminMapper.addAdmin(admin);
		System.out.println(result);
	}
	
	/**
	 * 测试删除管理员
	 */
	@Test
	public void testDelAdmin() {
		int result = adminMapper.delAdmin(16);
		System.out.println(result);
	}
	
	/**
	 * 测试逻辑删除管理员，isDel：   0：不删除    1：删除
	 */
	@Test
	public void testTombAdmin() {
		Map<String, Object> map = new HashMap<>();
		map.put("adminId", 6);
		map.put("isDel", 1);
		int result= adminMapper.tombAdmin(map);
		System.out.println(result);
	}
	/**
	 * 测试修改管理员
	 */
	@Test
	public void testUpdateAdmin() {
		ShopAdmin admin=new ShopAdmin("fpp", "222", 1, "127.0.0.1", 0, "test@qq.com", 0, null, null, null, null, null, 2, new Date());
		admin.setAdminId(15);
		int result = adminMapper.updateAdmin(admin);
		System.out.println(result);
	}
	
	/**
	 * 查询全部管理员/根据管理员id查询管理员
	 */
	@Test
	public void testFindAdmin() {
		Map<String, Object> map =new HashMap<>();
		map.put("adminId", 17);
		List<ShopAdmin> list = adminMapper.findAdmin(map);
		System.out.println(list);
	}
}
