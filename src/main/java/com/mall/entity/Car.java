package com.mall.entity;

/*
@author 
@create 2021-07-30-8:06
*/


public class Car {
    private int carId;
    private Stores stores;
    private int storesId;
    private int carFlag;
    private int money;
    private int infoSelectStatus;
    private int amount;
    private int userId;
    private Goods goods;
    private Integer goodsId;
    private Adress adress;
    private int id;
    private Mmall_product_specs mmall_product_specs;
    public int getId() {
        return id;
    }

    public Mmall_product_specs getMmall_product_specs() {
        return mmall_product_specs;
    }

    public void setMmall_product_specs(Mmall_product_specs mmall_product_specs) {
        this.mmall_product_specs = mmall_product_specs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stores getStores() {
        return stores;
    }

    public int getStoresId() {
        return storesId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public void setStoresId(int storesId) {
        this.storesId = storesId;
    }

    public void setStores(Stores stores) {
        this.stores = stores;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getCarFlag() {
        return carFlag;
    }

    public void setCarFlag(int carFlag) {
        this.carFlag = carFlag;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getInfoSelectStatus() {
        return infoSelectStatus;
    }

    public void setInfoSelectStatus(int infoSelectStatus) {
        this.infoSelectStatus = infoSelectStatus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", stores=" + stores +
                ", storesId=" + storesId +
                ", carFlag=" + carFlag +
                ", money=" + money +
                ", infoSelectStatus=" + infoSelectStatus +
                ", amount=" + amount +
                ", userId=" + userId +
                ", goods=" + goods +
                ", goodsId=" + goodsId +
                ", adress=" + adress +
                ", id=" + id +
                ", mmall_product_specs=" + mmall_product_specs +
                '}';
    }
}
