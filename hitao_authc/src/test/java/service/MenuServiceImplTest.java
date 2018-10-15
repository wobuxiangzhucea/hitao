package service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AuthcMicroService;
import com.entity.ShopMenu;
import com.service.MenuService;
import com.utils.PageUtil;
import com.utils.ServerResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService.class)
public class MenuServiceImplTest {
	/**
	 * 自动注入MenuService实例
	 */
	@Autowired
	private MenuService menuService;
	
	/**
	 * 测试增加系统菜单
	 */
	@Test
	public void testAddMenu() {
		ShopMenu menu=new ShopMenu("yyy", null, 2, 0, 3, "/system/addMenu", "权限管理2", 1, new Date(), null, null, null, null, null, null);
		ServerResponse<Integer> sr = menuService.addMenu(menu);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试删除系统菜单
	 */
	@Test
	public void testDelMenu() {
		ServerResponse<Integer> sr = menuService.delMenu(7);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试修改系统菜单
	 */
	@Test
	public void testUpdateMenu() {
		ShopMenu menu=new ShopMenu("yyy", null, 2, 0, 3, "/system/addMenu", "权限管理3", 1, new Date(), null, null, null, null, null, null);
		ServerResponse<Integer> sr = menuService.updateMenu(menu);
		System.out.println(sr.getMsg());
	}
	
	/**
	 * 测试分页查询系统菜单
	 */
	@Test
	public void testFindMenu() {
		ServerResponse<PageUtil<List<ShopMenu>>> sr = menuService.findMenu(1, 5, 0);
		System.out.println(sr.getData().getData());
		System.out.println(sr.getData().getCount());
	}
}
