package com.zxg.core;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;


/**
 * 设置basePath<br/>
 * 创建人:zhaoxugui<br/>
 * 时间：2017年11月2日-下午1:44:09 <br/>
 *
 * @version 1.0.0<br/>
 */
@Component
public class BasePathExposer implements ServletContextAware {
    private ServletContext servletContext;
    @Value("${zhao.path.basepath}")
    private String basePath;
    @Value("${zhao.path.resources}")
    private String resPath;

    public void init() {
        servletContext.setAttribute("basePath", basePath);
        servletContext.setAttribute("resPath", resPath);

    }

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

}
