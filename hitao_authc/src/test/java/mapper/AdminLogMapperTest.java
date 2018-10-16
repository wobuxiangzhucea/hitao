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

import com.entity.ShopAdminLog;
import com.hzit.AuthcMicroService;
import com.hzit.mapper.AdminLogMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class AdminLogMapperTest {
	/**
	 * 自动注入AdminLogMapper对象
	 */
	@Autowired
	private AdminLogMapper adminLogMapper;
	
	/**
	 * 测试增加日志
	 */
	@Test
	public void testAddAdminLog() {
		ShopAdminLog adminLog=new ShopAdminLog("hello", null, null, null, null, 0, new Date(), null);
		int result = adminLogMapper.addAdminLog(adminLog);
		System.out.println(result);
	}
	
	/**
	 * 测试逻辑删除日志
	 */
	@Test
	public void testTombAdminLog() {
		Map<String, Object> map = new HashMap<>();
		map.put("logId", 1);
		map.put("isDel", 1);
		int result = adminLogMapper.tombAdminLog(map);
		System.out.println(result);
	}
	
	/**
	 * 测试删除日志
	 */
	@Test
	public void testDelAdminLog() {
		int result = adminLogMapper.delAdminLog(1);
		System.out.println(result);
	}
	
	/**
	 * 测试修改日志
	 */
	@Test
	public void testUpdateAdminLog() {
		ShopAdminLog adminLog=new ShopAdminLog("world", null, null, null, null, 0, new Date(), null);
		adminLog.setLogId(3);
		int result = adminLogMapper.updateAdminLog(adminLog);
		System.out.println(result);
	}
	
	/**
	 * 查询日志
	 */
	@Test
	public void testFindAdminLog() {
		List<ShopAdminLog> list = adminLogMapper.findAdminLog(new HashMap<>());
		System.out.println(list);
	}
}
