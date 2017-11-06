package com.zxg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class CommentManagerController {
	@RequestMapping("/comment")
	public String toIndex() {
		return "commentManage";
	}
}
