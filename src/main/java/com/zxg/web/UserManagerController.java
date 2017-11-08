package com.zxg.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zxg.bean.User;
import com.zxg.mapper.IUserMapper;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class UserManagerController {
	
	
	@Autowired
	private IUserMapper usermapper;

	@RequestMapping("/user")
	public ModelAndView usermanager() {
		ModelAndView modelAndView=new ModelAndView();
		List<User> user = usermapper.getUser();
		modelAndView.addObject("user",user);
		modelAndView.setViewName("userManage");
		return modelAndView;

	}



}
