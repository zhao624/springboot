package com.zxg.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * serialVersionUID:序列号
     *
     * @since 1.0.0
     */
    private static final long serialVersionUID = 1L;

    private Integer id;// 用户ID
    private String username;// 用户名
    private String account;// 用户账号
    private Date createTime;// 创建时间
    private Date updateTime;// 更新时间
    private Integer active;// 状态 0未发布 ： 1发布
    private String password;// 用户密码
    private String headerPic;// 用户头像

    public User() {
        super();
    }

    public User(Integer id, String username, String account, Date createTime, Date updateTime, Integer active,
                String password, String headerPic) {
        super();
        this.id = id;
        this.username = username;
        this.account = account;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.active = active;
        this.password = password;
        this.headerPic = headerPic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeaderPic() {
        return headerPic;
    }

    public void setHeaderPic(String headerPic) {
        this.headerPic = headerPic;
    }


    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", account=" + account + ", createTime=" + createTime
                + ", updateTime=" + updateTime + ", active=" + active + ", password=" + password + ", headerPic="
                + headerPic + "]";
    }

}
