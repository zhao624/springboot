package com.zxg.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
            rsp.sendRedirect(req.getContextPath() + "/login");
            return false;
        } else {
            return true;
        }
    }

}
