package com.zxg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxg.bean.Banner;
import com.zxg.bean.User;

public interface IBannerMapper {

    /**
     * 获得所有的轮播图信息
     *
     * @return
     */
    List<Banner> getBanner();

    /**
     * 修改轮播图信息,允许修改的内容为:img,url,title,description,status
     *
     * @param banner
     * @return int
     */
    int updateBanner(Banner banner);

    /**
     * 添加轮播图
     *
     * @param banner
     * @return
     */
    int addBanner(Banner banner);
}
