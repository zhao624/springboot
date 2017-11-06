package com.zxg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxg.bean.Banner;
import com.zxg.bean.User;

public interface IBananerMapper {
	
	
	/**
	 * 
	 * 查询所有图片的信息<br/>
	 * 方法名：getBanner<br/>
	 * 创建人：HuJun <br/>
	 * 时间：2017年11月3日-下午4:59:59 <br/>
	 * 手机:1564545646464<br/>
	 * @return List<Banner><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	 List<Banner> getBanner();
	
	/**
	 * 
	 * 根据图片id删除图片<br/>
	 * 方法名：deleteBanner<br/>
	 * 创建人：HuJun <br/>
	 * 时间：2017年11月3日-下午5:00:36 <br/>
	 * 手机:1564545646464<br/>
	 * @param id
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int deleteBanner(Integer id);
}
