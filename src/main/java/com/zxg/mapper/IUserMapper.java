package com.zxg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxg.bean.User;

public interface IUserMapper {
	
	
	/**
	 * 
	 * 验证登录
	 * 方法名：getLogin<br/>
	 * 创建人：zhaoxugui <br/>
	 * 时间：2017年11月2日-下午4:08:24 <br/>
	 * 手机:18230679679<br/>
	 * @param account
	 * @param password
	 * @return User<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	 User getLogin(@Param("account") String account,
                         @Param("password") String password);
	
	/**
	 * 查询所有的用户
	 * 方法名：getUser<br/>
	 * 创建人：万际洪 <br/>
	 * 时间：2017年11月3日-下午2:49:01 <br/>
	 * 手机:18774640440<br/>
	 * @return List<User><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	 List<User> getUser();
}
