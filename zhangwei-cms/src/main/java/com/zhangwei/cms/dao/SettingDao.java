package com.zhangwei.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.zhangwei.cms.pojo.Channel;
import com.zhangwei.cms.pojo.Setting;

public interface SettingDao {
	/*
	 * 查询频道
	 */
	List<Setting> select();
	/*
	 * 根据id，查询对象
	 */
	Setting selectById(@Param("id")Integer id);
	/*
	 * 查询数据条数
	 */
	int count();
	/*
	 * 插入一条记录
	 * 
	 */
	int insert(@Param("setting")Setting setting);
	/*
	 * 根据id更新记录
	 */
	int update(@Param("setting")Setting setting);
	/*
	 * 根据id删除记录
	 */
	int deleteById(@Param("id")Integer id);
	/*
	 * 根据IDS批量删除记录
	 */
	int deleteByIds(@Param("ids")String ids);
}
