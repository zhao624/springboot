package com.zxg.core;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;


import com.zxg.mapper.IUserMapper;
import com.zxg.util.cookie.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zxg.bean.User;

/**
 * 登录拦截器
 * LoginInterceptor<br/>
 * 创建人:zhaoxugui<br/>
 * 时间：2017年11月2日-下午2:08:39 <br/>
 *
 * @version 1.0.0<br/>
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse rsp, Object arg2) throws Exception {
		User user = (User) req.getSession().getAttribute("session_user");
		if (user == null) {
			//判断cookie是否存在用户
			Cookie rememberme = CookieUtils.getCookie(req, CookieConstantTable.RememberMe);
			if (rememberme != null) {
				String cookieValue = EncryptionUtil.base64Decode(rememberme.getValue());
				String[] cValues = cookieValue.split(":");
				if (cValues.length == 2) {
					String account_cookie = cValues[0]; // 获取用户名
					String ctime = cValues[1]; // 获取UUID值
					//获取上次登录的时间
					Long cLong = Long.parseLong(ctime);
					//获取当前时间
					Date date = new Date();
					//如果当前时间还在30天之内，就直接根据用户名查询登录，否则退出登录
					if (DateUtil.differentDays(new Date(cLong), date) <= 30) {
						WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(req.getServletContext());
						IUserMapper userMapper = context.getBean(IUserMapper.class);
						User cookieuser =userMapper.getLoginByAccount(account_cookie);
						req.getSession().setAttribute("session_user", cookieuser);
					} else {
						//删除cookie重新区登录
						CookieUtils.delCookie(rsp, rememberme);
						rsp.sendRedirect(req.getContextPath() + "/login");
					}
				}
				return true;
			} else {
				return false;
			}
		}else {
			return true;
		}
	}
}
