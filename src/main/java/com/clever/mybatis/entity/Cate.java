package com.clever.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Cate implements Serializable {
    /**
     * 主键
     */
    private Integer cateId;

    /**
     * 分类名称
     */
    private String title;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 1表示删除 0 表示未删除
     */
    private Integer status;
    private List<Product> list;

    private static final long serialVersionUID = 1L;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }
}

