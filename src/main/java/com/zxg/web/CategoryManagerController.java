package com.zxg.web;

import java.util.List;

import com.zxg.mapper.ICategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxg.bean.Category;

@Controller
@RequestMapping("/admin")
public class CategoryManagerController {
	
	@Autowired
	private ICategoryMapper categoryMapper;
	
	@RequestMapping(value="/category")
	public ModelAndView toAssortment() {
		ModelAndView modelAndView = new ModelAndView();
		List<Category> category= categoryMapper.findCategory();
		modelAndView.addObject("category",category);
		modelAndView.setViewName("categroyManage");
		return modelAndView;
	}
}
