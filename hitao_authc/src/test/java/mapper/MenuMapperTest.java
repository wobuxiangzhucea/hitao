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
import com.entity.ShopMenu;
import com.mapper.MenuMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class MenuMapperTest {
	/**
	 * 自动注入MenuMapper实例
	 */
	@Autowired
	private MenuMapper menuMapper;
	
	/**
	 * 测试增加系统菜单
	 */
	@Test
	public void testAddMenu() {
		ShopMenu menu=new ShopMenu("xxx", null, 2, 0, 3, "/system/addMenu", "权限管理2", 1, new Date(), null, null, null, null, null, null);
		int result = menuMapper.addMenu(menu);
		System.out.println(result);
	}
	
	/**
	 * 测试删除系统菜单
	 */
	@Test
	public void testDelMenu() {
		int result = menuMapper.delMenu(26);
		System.out.println(result);
	}
	
	/**
	 * 测试修改系统菜单
	 */
	@Test
	public void testUpdateMenu() {
		ShopMenu menu=new ShopMenu("yyy", null, 2, 0, 3, "/system/addMenu", "权限管理2", 1, new Date(), null, null, null, null, null, null);
		menu.setId(27);
		int result = menuMapper.updateMenu(menu);
		System.out.println(result);
	}
	
	/**
	 * 测试查询全部系统菜单/根据id查询系统菜单
	 */
	@Test
	public void findMenu() {
		Map<String, Object> map = new HashMap<>();
		List<ShopMenu> list = menuMapper.findMenu(map);
		System.out.println(list);
	}
}
