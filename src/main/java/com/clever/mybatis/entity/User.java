package com.clever.mybatis.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     *  ID
     */
    private Integer userId;

    /**
     *  用户名
     */
    private String username;

    /**
     *  密码
     */
    private String password;

    /**
     *  是否在数据库中删除  0 表示未删除 1表示已经删除
     */
    private Integer isDel;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIsDel() {
        return isDel;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isDel=" + isDel +
                '}';
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}

