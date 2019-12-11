package com.zhangwei.cms.test;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangwei.cms.dao.UserDao;
import com.zhangwei.cms.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/spring-beans.xml")
public class UserTest {

	@Autowired
	private UserDao dao;     
	 
	//列表查询
	@Test
	public void select(){
		List<User> list=dao.sel();
		for (User user : list) {
			System.out.println(user);
		}
	}
	//根据id查询
	@Test
	public void selectById() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		User user=dao.selectById(137);
		System.out.println(simpleDateFormat.format(user.getBirthday()));
		System.out.println(user.toString());
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
		User user = new User();
		int i=dao.insert(user);
		System.out.println(i);
	}
	//根据id更新记录
	@Test
	public void update() {
		User user=new User();
		user.setId(170);
		int update = dao.update(user);
		System.out.println(update);
	}
	//根据id删除记录
	@Test
	public void deleteById() {
		
		int deleteById = dao.deleteById(170);
		System.out.println(deleteById);
	}
	//根据ids批量删除记录
	@Test
	public void deleteByIds(){
		
	}
	
}
