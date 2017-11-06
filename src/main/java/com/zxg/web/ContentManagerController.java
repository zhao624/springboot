package com.zxg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ContentManagerController {
	/**
	 * 
	 * 内容管理<br/>
	 * 方法名：concont<br/>
	 * 创建人：chenwenqi <br/>
	 * 时间：2017年11月3日-下午2:19:51 <br/>
	 * 手机:1564545646464<br/>
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/content")
	public String concont(){
		return "contentManage";
		
	}
}
