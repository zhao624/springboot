package com.zxg.mapper;

import java.util.List;

import com.zxg.bean.Category;

public interface ICategoryMapper {
	/**
	 * 查询所有的分类
	 * @return
	 */
	 List<Category> quertAllCategory();

	/**
	 * 更改分类信息
	 * @param category
	 * @return
	 */
	 int update(Category category);

	/**
	 * 添加分类
	 * @param category
	 * @return
	 */
	 int addCategroy(Category category);
}
