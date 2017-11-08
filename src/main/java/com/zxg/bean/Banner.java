package com.zxg.bean;

import java.util.Date;

public class Banner {
    private Integer id;//图片ID
    private String img;//图片地址
    private String url;//内容地址
    private String title;//标题
    private String description;//描述
    private Date createTime;//创建时间
    private Integer userId;//用户ID
    private Integer status;//状态

    public Banner() {
    }

    public Banner(Integer id, String img, String url, String title, String description, Date createTime, Integer userId, Integer status) {
        this.id = id;
        this.img = img;
        this.url = url;
        this.title = title;
        this.description = description;
        this.createTime = createTime;
        this.userId = userId;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createTime=" + createTime +
                ", userId=" + userId +
                ", status=" + status +
                '}';
    }
}
