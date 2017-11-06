package com.zxg.bean;

import java.util.Date;

/**
 * Banner<br/>
 * 创建人:HuJun<br/>
 * 时间：2017年11月3日-下午4:58:51 <br/>
 * @version 1.0.0<br/>
 */
public class Banner {
	private Integer id;//图片ID
	private String img;//图片地址
	private String url;//内容地址
	private String title;//标题
	private String description;//描述
	private Date createTime;//创建时间
	private Integer userId;//用户ID
	private Integer status;//状态

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

}
