package com.zhangwei.cms.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zhangwei.cms.dao.CategoryDao;
import com.zhangwei.cms.pojo.Category;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/spring-beans.xml")
public class CategoryTest {

	@Autowired
	private CategoryDao dao;     
	 
	//列表查询
	@Test
	public void select(){
		List<Category> list=dao.select();
		for (Category category : list) {
			System.out.println(category);
		}
	}
	//根据id查询
	@Test
	public void selectById() {
		
		Category category=dao.selectById(1);
		
		System.out.println(category.toString());
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
		Category category = new Category();
		int i=dao.insert(category);
		System.out.println(i);
	}
	//根据id更新记录
	@Test
	public void update() {
		Category category = new Category();
		category.setId(33);
		int update = dao.update(category);
		System.out.println(update);
	}
	//根据id删除记录
	@Test
	public void deleteById() {
		
		int deleteById = dao.deleteById(33);
		System.out.println(deleteById);
	}
	//根据ids批量删除记录
	@Test
	public void deleteByIds(){
		
	}
	
}
