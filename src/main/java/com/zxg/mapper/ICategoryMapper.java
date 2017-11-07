package com.zxg.mapper;

import java.util.List;

import com.zxg.bean.Banner;
import com.zxg.bean.Category;

public interface ICategoryMapper {
	
	 List<Category> findCategory();
	 int update(Banner banner);
	 int addBanner(Banner banner);
}
