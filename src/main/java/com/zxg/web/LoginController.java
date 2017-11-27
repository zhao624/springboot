package com.zxg.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zxg.util.cookie.CookieConstantTable;
import com.zxg.util.cookie.CookieUtils;
import com.zxg.util.cookie.EncryptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxg.bean.User;
import com.zxg.mapper.IUserMapper;
import com.zxg.util.MD5PwdUtil;

import java.util.Calendar;
import java.util.Date;

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
	@RequestMapping(value = "/logined", method = RequestMethod.POST)
	public String logined(User user, @RequestParam("rememberMe") String rememberMe, HttpSession session, HttpServletResponse response) {
		User user2 = userMapper.getLogin(user.getAccount(), MD5PwdUtil.md5Base64(user.getPassword()));
		if (user2 != null && rememberMe.equals("1")) {
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.MONTH, 1); // 一个月
			long ctime = new Date().getTime();
			// Cookie值
			String cookieValue = EncryptionUtil.base64Encode(user2.getAccount() + ":" + ctime);
			// 保存cookie
			CookieUtils.addCookie(response, CookieConstantTable.RememberMe, cookieValue, null);
			session.setAttribute("session_user", user2);
			return "success";
		} else {
			return "fail";
		}
	}

	@RequestMapping("loginout")
	public String loginOut(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		CookieUtils.delCookie(request, response, CookieConstantTable.RememberMe);
		session.invalidate();
		return "login";
	}
}
