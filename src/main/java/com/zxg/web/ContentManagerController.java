package com.zxg.web;

import com.zxg.bean.Content;
import com.zxg.bean.Params;
import com.zxg.mapper.IContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class ContentManagerController {
    @Autowired()
    private IContentMapper contentMapper;

    /**
     * 内容管理<br/>
     * 方法名：concont<br/>
     * 创建人：chenwenqi <br/>
     * 时间：2017年11月3日-下午2:19:51 <br/>
     * 手机:1564545646464<br/>
     *
     * @return String<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @RequestMapping("/content")
    public ModelAndView concont() {
        ModelAndView modelAndView=new ModelAndView();
        //select all content
        List<Content> list=contentMapper.findContent(new Params());
        modelAndView.addObject("contentsList",list);
        modelAndView.setViewName("/contentManage");
        return modelAndView;
    }


}
