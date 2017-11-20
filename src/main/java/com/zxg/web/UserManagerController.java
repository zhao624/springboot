package com.zxg.web;

import java.util.List;

import com.zxg.bean.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zxg.bean.User;
import com.zxg.mapper.IUserMapper;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class UserManagerController {
	
	
	@Autowired
	private IUserMapper usermapper;

    /**
     *查询Users并跳转页面
     * @return
     */
	@RequestMapping("/user")
	public ModelAndView usermanager() {
		ModelAndView modelAndView=new ModelAndView();
		List<User> user = usermapper.getUser();
		modelAndView.addObject("userList",user);
		modelAndView.setViewName("/user/userManage");
		return modelAndView;

	}

	@RequestMapping("/selectByKeyword")
    public ModelAndView selectByKeyWord(Params params){
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = usermapper.getUsersByKeyword(params);
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("/user/template");
        return modelAndView;
    }




}
