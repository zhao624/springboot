package com.zxg.web;

import java.util.List;

import com.zxg.mapper.IBannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zxg.bean.Banner;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class BannerManageController {

    @Autowired
    private IBannerMapper bananerMapper;

    @RequestMapping("/banner")
    public ModelAndView slideshow() {
        ModelAndView modelAndView = new ModelAndView();
        List<Banner> banner = bananerMapper.getBanner();
        modelAndView.addObject("banner", banner);
        modelAndView.setViewName("bannerManage");
        return modelAndView;
    }


}
