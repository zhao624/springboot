package com.zxg.mapper;

import java.util.List;

import com.zxg.bean.Content;
import com.zxg.bean.Params;

public interface IContentMapper {
	/**
	 * 查询所有的文章信息
	 * @return List<Content>
	 */
	 List<Content> findContent(Params params);

    /**
     *查询总数
     * @return int
     */
	 int getCount();



}
