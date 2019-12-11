package com.zhangwei.cms.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zhangwei.cms.dao.ChannelDao;
import com.zhangwei.cms.pojo.Channel;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/spring-beans.xml")
public class ChannelTest {

	@Autowired
	private ChannelDao dao;     
	 
	//列表查询
	@Test
	public void select(){
		List<Channel> list=dao.select();
		for (Channel channel : list) {
			System.out.println(channel);
		}
	}
	//根据id查询
	@Test
	public void selectById() {
		
		Channel channel=dao.selectById(1);
		
		System.out.println(channel.toString());
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
		Channel channel = new Channel();
		int i=dao.insert(channel);
		System.out.println(i);
	}
	//根据id更新记录
	@Test
	public void update() {
		Channel channel = new Channel();
		channel.setId(10);
		int update = dao.update(channel);
		System.out.println(update);
	}
	//根据id删除记录
	@Test
	public void deleteById() {
		
		int deleteById = dao.deleteById(10);
		System.out.println(deleteById);
	}
	//根据ids批量删除记录
	@Test
	public void deleteByIds(){
		
	}
	
}
