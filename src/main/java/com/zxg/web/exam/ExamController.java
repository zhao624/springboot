package com.zxg.web.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: zhaoxugui
 * @Description:com.zxg.web.exam
 * @Date: Created in 2017/11/13
 * @Version: 1.0.0
 */
@Controller
@RequestMapping("/exam")
public class ExamController {
    @RequestMapping("/{paramter}")
    public String topage(@PathVariable("paramter") String Paramter) {
        return "exam/" + Paramter;
    }
}
