package com.zhangwei.cms.test;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zhangwei.cms.dao.SettingDao;
import com.zhangwei.cms.pojo.Setting;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/spring-beans.xml")
public class SettingTest {

	@Autowired
	private SettingDao dao;     
	 
	//列表查询
	@Test
	public void select(){
		List<Setting> list=dao.select();
		for (Setting setting : list) {
			System.out.println(setting);
		}
	}
	//根据id查询
	@Test
	public void selectById() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Setting setting=dao.selectById(1);
		
		System.out.println(setting.toString());
	}
	
	//查询数据条数
	@Test
	public void count(){
		int count = dao.count();
		System.out.println(count);
	}
	//插入一条记录
	@Test
	public  void insert() {
	Setting setting = new Setting();
		int i=dao.insert(setting);
		System.out.println(i);
	}
	//根据id更新记录
	@Test
	public void update() {
		Setting setting = new Setting();
		setting.setId(1);
		int update = dao.update(setting);
		System.out.println(update);
	}
	//根据id删除记录
	@Test
	public void deleteById() {
		
		int deleteById = dao.deleteById(1);
		System.out.println(deleteById);
	}
	//根据ids批量删除记录
	@Test
	public void deleteByIds(){
		
	}
	
}
