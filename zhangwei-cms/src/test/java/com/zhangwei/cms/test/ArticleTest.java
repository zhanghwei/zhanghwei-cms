package com.zhangwei.cms.test;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangwei.cms.dao.ArticleDao;
import com.zhangwei.cms.dao.UserDao;
import com.zhangwei.cms.pojo.Article;
import com.zhangwei.cms.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/spring-beans.xml")
public class ArticleTest {

	@Autowired
	private ArticleDao dao;     
	 
	//列表查询
	@Test
	public void select(){
		List<Article> list=dao.select();
		for (Article article : list) {
			System.out.println(article);
		}
	}
	//根据id查询
	@Test
	public void selectById() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Article article=dao.selectById(1);
		
		System.out.println(article.toString());
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
		Article article = new Article();
		int i=dao.insert(article);
		System.out.println(i);
	}
	//根据id更新记录
	@Test
	public void update() {
		Article article = new Article();
		article.setId(8);
		int update = dao.update(article);
		System.out.println(update);
	}
	//根据id删除记录
	@Test
	public void deleteById() {
		
		int deleteById = dao.deleteById(8);
		System.out.println(deleteById);
	}
	//根据ids批量删除记录
	@Test
	public void deleteByIds(){
		
	}
	
}
