package com.mall.entity;/*
    @author Administrator
    @create 2021-07-14 16:30
*/

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Goods{
    private int goodsId;
    private String goodsName;
    private String goodsType;
    private String goodsStatus;
    private double goodsPrice;
    private double goodsHuaxianjia;
    private int goodsStock;
    private String goodsSpecifications;
    private String goodsAddress;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date goodsProduceDate;
    private int goodsYunfei;
    private String goodsPicture;
    private String goodsXiangqing;
    private int goodsFlag;
    private int storesId;
    private int selectStatus;
    private int xiaoliang;
    private Stores stores;
    private Integer categoryId;
    private Category category;

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public double getGoodsHuaxianjia() {
        return goodsHuaxianjia;
    }

    public void setGoodsHuaxianjia(double goodsHuaxianjia) {
        this.goodsHuaxianjia = goodsHuaxianjia;
    }

    public int getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(int goodsStock) {
        this.goodsStock = goodsStock;
    }

    public String getGoodsSpecifications() {
        return goodsSpecifications;
    }

    public void setGoodsSpecifications(String goodsSpecifications) {
        this.goodsSpecifications = goodsSpecifications;
    }

    public String getGoodsAddress() {
        return goodsAddress;
    }

    public void setGoodsAddress(String goodsAddress) {
        this.goodsAddress = goodsAddress;
    }

    public Date getGoodsProduceDate() {
        return goodsProduceDate;
    }

    public void setGoodsProduceDate(Date goodsProduceDate) {
        this.goodsProduceDate = goodsProduceDate;
    }

    public int getGoodsYunfei() {
        return goodsYunfei;
    }

    public void setGoodsYunfei(int goodsYunfei) {
        this.goodsYunfei = goodsYunfei;
    }

    public String getGoodsPicture() {
        return goodsPicture;
    }

    public void setGoodsPicture(String goodsPicture) {
        this.goodsPicture = goodsPicture;
    }

    public String getGoodsXiangqing() {
        return goodsXiangqing;
    }

    public void setGoodsXiangqing(String goodsXiangqing) {
        this.goodsXiangqing = goodsXiangqing;
    }

    public int getGoodsFlag() {
        return goodsFlag;
    }

    public void setGoodsFlag(int goodsFlag) {
        this.goodsFlag = goodsFlag;
    }

    public int getStoresId() {
        return storesId;
    }

    public void setStoresId(int storesId) {
        this.storesId = storesId;
    }

    public int getSelectStatus() {
        return selectStatus;
    }

    public void setSelectStatus(int selectStatus) {
        this.selectStatus = selectStatus;
    }

    public int getXiaoliang() {
        return xiaoliang;
    }

    public void setXiaoliang(int xiaoliang) {
        this.xiaoliang = xiaoliang;
    }

    public Stores getStores() {
        return stores;
    }

    public void setStores(Stores stores) {
        this.stores = stores;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", goodsStatus='" + goodsStatus + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsHuaxianjia=" + goodsHuaxianjia +
                ", goodsStock=" + goodsStock +
                ", goodsSpecifications='" + goodsSpecifications + '\'' +
                ", goodsAddress='" + goodsAddress + '\'' +
                ", goodsProduceDate=" + goodsProduceDate +
                ", goodsYunfei=" + goodsYunfei +
                ", goodsPicture='" + goodsPicture + '\'' +
                ", goodsXiangqing='" + goodsXiangqing + '\'' +
                ", goodsFlag=" + goodsFlag +
                ", storesId=" + storesId +
                ", selectStatus=" + selectStatus +
                ", xiaoliang=" + xiaoliang +
                ", stores=" + stores +
                ", categoryId=" + categoryId +
                ", category=" + category +
                ", storesId=" + storesId +
                '}';
    }
}
























