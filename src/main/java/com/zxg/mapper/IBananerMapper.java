package com.zxg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxg.bean.Banner;
import com.zxg.bean.User;

public interface IBananerMapper {
	
	

	 List<Banner> getBanner();
	

	 int deleteBanner(Integer id);
}
