package com.zxg.bean;

import java.io.Serializable;

/**
 * 页面分页传参类
 */
public class Params implements Serializable {
    private Integer pno = 0;// 页数
    private Integer psize = 5;// 分页大小
    private Integer pCount = 5;// 总页数
    private String keyword;//搜索关键字

    public Params() {
    }

    public Params(Integer pno, Integer psize, Integer pCount, String keyword) {
        this.pno = pno;
        this.psize = psize;
        this.pCount = pCount;
        this.keyword = keyword;
    }

    public Integer getPno() {
        return pno;
    }

    public void setPno(Integer pno) {
        this.pno = pno;
    }

    public Integer getPsize() {
        return psize;
    }

    public void setPsize(Integer psize) {
        this.psize = psize;
    }

    public Integer getpCount() {
        return pCount;
    }

    public void setpCount(Integer pCount) {
        this.pCount = pCount;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "Params{" +
                "pno=" + pno +
                ", psize=" + psize +
                ", pCount=" + pCount +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}