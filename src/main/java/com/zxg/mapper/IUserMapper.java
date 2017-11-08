package com.zxg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxg.bean.User;


public interface IUserMapper {
    User getLogin(@Param("account") String account, @Param("password") String password);

    List<User> getUser();

    int addUser(User user);

    int update(User user);

}
