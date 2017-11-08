package com.zxg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/page")
    public String toPage() {
        return "page/list";
    }


}
