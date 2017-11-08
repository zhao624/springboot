package com.zxg.mapper;

import java.util.List;

import com.zxg.bean.Content;
import com.zxg.bean.Params;

public interface IContentMapper {
    /**
     * 查询所有的文章信息
     *
     * @return List<Content>
     */
    List<Content> findContent(Params params);

    /**
     * 查询总数
     *
     * @return int
     */
    int getCount();

    /**
     * 文章修改
     *
     * @param content
     * @return
     */
    int update(Content content);

    /**
     * 文章添加
     *
     * @param content
     * @return
     */
    int addContent(Content content);

}
