package com.zxg.bean;

import java.io.Serializable;
import java.util.Date;


public class Category implements Serializable {
    /**
     * serialVersionUID:序列号
     *
     * @since 1.0.0
     */
    private static final long serialVersionUID = 8032313006156816397L;
    private Integer id;
    private String name;//分类名
    private Date createTime;//创建时间
    private Integer status;//发布状态。1发布，0不发布

    public Category() {
        super();
    }

    public Category(Integer id, String name, Date createTime, Integer status) {
        super();
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + ", createTime=" + createTime + ", status=" + status + "]";
    }



}
