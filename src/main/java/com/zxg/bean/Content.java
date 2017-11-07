package com.zxg.bean;

import java.util.Date;

public class Content {
    private Integer id;
    private String title;
    private String description;
    private String content;
    private String img;
    private Date createTime;
    private Date updateTime;
    private Integer status;
    private Integer categoryId;
    private Integer hits;
    private Integer loves;
    private Integer userId;

    public Content() {
    }

    public Content(Integer id, String title, String description, String content, String img, Date createTime, Date updateTime, Integer status, Integer categoryId, Integer hits, Integer loves, Integer userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.img = img;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
        this.categoryId = categoryId;
        this.hits = hits;
        this.loves = loves;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getLoves() {
        return loves;
    }

    public void setLoves(Integer loves) {
        this.loves = loves;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", categoryId=" + categoryId +
                ", hits=" + hits +
                ", loves=" + loves +
                ", userId=" + userId +
                '}';
    }
}