package com.mall.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/*
@author 
@create 2021-07-20-20:53
*/public class Orders {
    private int ordersId;
    private int ordersFlag;
    private String ordersStatus;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ordersProduceDate;
    private String ordersPurchaser;
    private String ordersAddress;
    private String ordersPhone;
    private String ordersPost;
    private String ordersCompany;
    private String ordersNumber;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ordersDate;
    private Goods goods;
    private Integer member_id;
    private String odd;
    private Integer goodsId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public int getOrdersFlag() {
        return ordersFlag;
    }

    public void setOrdersFlag(int ordersFlag) {
        this.ordersFlag = ordersFlag;
    }

    public String getOrdersStatus() {
        return ordersStatus;
    }

    public void setOrdersStatus(String ordersStatus) {
        this.ordersStatus = ordersStatus;
    }

    public Date getOrdersProduceDate() {
        return ordersProduceDate;
    }

    public void setOrdersProduceDate(Date ordersProduceDate) {
        this.ordersProduceDate = ordersProduceDate;
    }

    public String getOrdersPurchaser() {
        return ordersPurchaser;
    }

    public void setOrdersPurchaser(String ordersPurchaser) {
        this.ordersPurchaser = ordersPurchaser;
    }

    public String getOrdersAddress() {
        return ordersAddress;
    }

    public void setOrdersAddress(String ordersAddress) {
        this.ordersAddress = ordersAddress;
    }

    public String getOrdersPhone() {
        return ordersPhone;
    }

    public void setOrdersPhone(String ordersPhone) {
        this.ordersPhone = ordersPhone;
    }

    public String getOrdersPost() {
        return ordersPost;
    }

    public void setOrdersPost(String ordersPost) {
        this.ordersPost = ordersPost;
    }

    public String getOrdersCompany() {
        return ordersCompany;
    }

    public void setOrdersCompany(String ordersCompany) {
        this.ordersCompany = ordersCompany;
    }

    public String getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(String ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    public Date getOrdersDate() {
        return ordersDate;
    }

    public void setOrdersDate(Date ordersDate) {
        this.ordersDate = ordersDate;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "ordersId=" + ordersId +
                ", ordersFlag=" + ordersFlag +
                ", ordersStatus='" + ordersStatus + '\'' +
                ", ordersProduceDate=" + ordersProduceDate +
                ", ordersPurchaser='" + ordersPurchaser + '\'' +
                ", ordersAddress='" + ordersAddress + '\'' +
                ", ordersPhone='" + ordersPhone + '\'' +
                ", ordersPost='" + ordersPost + '\'' +
                ", ordersCompany='" + ordersCompany + '\'' +
                ", ordersNumber='" + ordersNumber + '\'' +
                ", ordersDate=" + ordersDate +
                ", goods=" + goods +
                ", member_id=" + member_id +
                ", odd='" + odd + '\'' +
                ", goodsId=" + goodsId +
                '}';
    }
}
