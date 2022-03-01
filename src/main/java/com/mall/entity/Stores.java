package com.mall.entity;/*
    @author Administrator
    @create 2021-07-14 16:31
*/

import javax.management.loading.PrivateClassLoader;

public class Stores {
    private int  storesId;
    private String storesName;
    private String storesNotice;
    private int storesFlag;
    private int businessSelectStatus;
    private int categoryId;
    private Category category;
    private int goodsId;
    private Goods goods;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getStoresId() {
        return storesId;
    }

    public void setStoresId(int storesId) {
        this.storesId = storesId;
    }

    public String getStoresName() {
        return storesName;
    }

    public void setStoresName(String storesName) {
        this.storesName = storesName;
    }

    public String getStoresNotice() {
        return storesNotice;
    }

    public void setStoresNotice(String storesNotice) {
        this.storesNotice = storesNotice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getBusinessSelectStatus() {
        return businessSelectStatus;
    }

    public void setBusinessSelectStatus(int businessSelectStatus) {
        this.businessSelectStatus = businessSelectStatus;
    }

    public int getStoresFlag() {
        return storesFlag;
    }

    public void setStoresFlag(int storesFlag) {
        this.storesFlag = storesFlag;
    }

    @Override
    public String toString() {
        return "Stores{" +
                "storesId=" + storesId +
                ", storesName='" + storesName + '\'' +
                ", storesNotice='" + storesNotice + '\'' +
                ", storesFlag=" + storesFlag +
                ", businessSelectStatus=" + businessSelectStatus +
                ", categoryId=" + categoryId +
                ", category=" + category +
                ", goodsId=" + goodsId +
                ", goods=" + goods +
                '}';
    }
}
