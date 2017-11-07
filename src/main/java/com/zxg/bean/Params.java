package com.zxg.bean;

import java.io.Serializable;

/**
 * 页面分页传参类
 */
public class Params implements Serializable {
    private Integer pno = 0;// 页数
    private Integer psize = 5;// 分页大小
    private Integer pCount = 5;// 总页数

    public Params() {
    }

    public Params(Integer pno, Integer psize, Integer pCount) {
        this.pno = pno;
        this.psize = psize;
        this.pCount = pCount;
    }

    public Integer getPno() {
        return pno;
    }

    public Integer getPsize() {
        return psize;
    }

    public Integer getpCount() {
        return pCount;
    }

    public void setPno(Integer pno) {
        this.pno = pno;
    }

    public void setPsize(Integer psize) {
        this.psize = psize;
    }

    public void setpCount(Integer pCount) {
        this.pCount = pCount;
    }

    @Override
    public String toString() {
        return "Params{" +
                "pno=" + pno +
                ", psize=" + psize +
                ", pCount=" + pCount +
                '}';
    }
}