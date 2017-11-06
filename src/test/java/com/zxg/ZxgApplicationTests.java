package com.zxg;

import com.zxg.bean.User;
import com.zxg.mapper.IUserMapper;
import com.zxg.util.MD5PwdUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@MapperScan("com.zxg.mapper")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ZxgApplicationTests {

	@Autowired()
	private IUserMapper userMapper;
	@Test
	public void getLogin(){
		MD5PwdUtil md5=new MD5PwdUtil();
		User u=userMapper.getLogin("11111111111",md5.md5Base64("123456"));
		System.out.printf(u.getUsername()+"================================>");
	}

}
