package com.zhangwei.cms.test;

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
	 
	
	@Test
	public void select(){
		List<User> list=dao.sel();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
