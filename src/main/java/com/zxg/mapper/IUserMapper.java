package com.zxg.mapper;

import java.util.List;

import com.zxg.bean.Params;
import org.apache.ibatis.annotations.Param;

import com.zxg.bean.User;


public interface IUserMapper {
    /**
     * 验证登录
     *
     * @param account
     * @param password
     * @return
     */
    User getLogin(@Param("account") String account, @Param("password") String password);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> getUser();

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 根据关键字检索用户
     * @param params
     * @return
     */
    List<User> getUsersByKeyword(Params params);

}
