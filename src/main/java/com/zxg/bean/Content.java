package com.zxg.bean;

import java.util.Date;

public class Content {
	// 内容id
	private Integer id;
	// 标题
	private String title;
	// 描述
	private String description;
	// 内容
	private String content;
	// 图片
	private String img;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;
	// 发布状态 1表示发布状态 0表示默认状态未发布
	private Integer status;
	// 期刊id
	private Integer categoryId;
	// 点击数
	private Integer hits;
	// 喜爱数
	private Integer loves;
	// 用户Id
	private Integer user_id;

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

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Content [id=" + id + ", title=" + title + ", description=" + description + ", content=" + content
				+ ", img=" + img + ", createTime=" + createTime + ", updateTime=" + updateTime + ", status=" + status
				+ ", categoryId=" + categoryId + ", hits=" + hits + ", loves=" + loves + ", user_id=" + user_id + "]";
	}
	
	

}
