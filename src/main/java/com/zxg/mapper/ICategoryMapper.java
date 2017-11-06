package com.zxg.mapper;

import java.util.List;

import com.zxg.bean.Category;

public interface ICategoryMapper {
	
	/**
	 * 
	 * (查询所有分类)<br/>
	 * 方法名：findCategory<br/>
	 * 创建人：houlibing <br/>
	 * 时间：2017年11月2日-上午11:39:39 <br/>
	 * 手机:1564545646464<br/>
	 * @return List<Category><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	 List<Category> findCategory();
}
