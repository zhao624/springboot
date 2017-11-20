package com.zxg.bean;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable{

    private static final long serialVersionUID = 1L;
    private Integer id;// 评论ID
    private Integer userId;// 用户ID
    private String content;// 用户评论
    private Date createTime;// 评论时间
    private Integer hits;// 点赞数
    private Integer contentId;// 评论ID
    private Date updateTime;// 更新时间
    private Integer status;// 状态0未发布 1发布
    private String ip;// IP地址



    //无参构造
    public Comment() {
        super();
    }

    //有参构造

    public Comment(Integer id, Integer userId, String content, Date createTime, Integer hits, Integer contentId,
                   Date updateTime, Integer status, String ip) {
        super();
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.createTime = createTime;
        this.hits = hits;
        this.contentId = contentId;
        this.updateTime = updateTime;
        this.status = status;
        this.ip = ip;
    }
    //toString方法

    @Override
    public String toString() {
        return "Content [id=" + id + ", userId=" + userId + ", content=" + content + ", createTime=" + createTime
                + ", hits=" + hits + ", contentId=" + contentId + ", updateTime=" + updateTime + ", status=" + status
                + ", ip=" + ip + "]";
    }

    //set get方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}
