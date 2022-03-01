package com.mall.entity;

/*
@author 
@create 2021-07-22-16:40
*/public class Category {
    private Integer categoryId;
    private String categoryName;
    private Integer categoryLevel;
    private Integer categoryFlag;
    private Integer parentId;
    private Integer categoryRank;
    private String picture;
    private boolean isplay;

    public boolean isIsplay() {
        return isplay;
    }

    public void setIsplay(boolean isplay) {
        this.isplay = isplay;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public Integer getCategoryFlag() {
        return categoryFlag;
    }

    public void setCategoryFlag(Integer categoryFlag) {
        this.categoryFlag = categoryFlag;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCategoryRank() {
        return categoryRank;
    }

    public void setCategoryRank(Integer categoryRank) {
        this.categoryRank = categoryRank;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryLevel=" + categoryLevel +
                ", categoryFlag=" + categoryFlag +
                ", parentId=" + parentId +
                ", categoryRank=" + categoryRank +
                ", picture='" + picture + '\'' +
                ", isplay=" + isplay +
                '}';
    }
}
