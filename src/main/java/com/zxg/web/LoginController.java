package com.zxg.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxg.bean.User;
import com.zxg.mapper.IUserMapper;
import com.zxg.util.MD5PwdUtil;

@Controller()
/**
 * 
 * 登录控制类
 * LoginController<br/>
 * 创建人:zhaoxugui<br/>
 * 时间：2017年11月3日-下午2:22:30 <br/>
 * @version 1.0.0<br/>
 *
 */
public class LoginController {
	
	@RequestMapping("/login")
	public String toLogin() {
		return "login";
	}
	
	@Autowired
	private IUserMapper userMapper;
	@ResponseBody
	@RequestMapping(value="/logined",method=RequestMethod.POST)
	public String logined(User user,HttpSession session){
		User user2 = userMapper.getLogin(user.getAccount(),MD5PwdUtil.md5Base64(user.getPassword()));
		if(user2!=null){
			session.setAttribute("session_user", user2);
			return "success";
		}else{
			return "fail";
		}
	}
}
