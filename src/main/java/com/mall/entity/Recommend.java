package com.mall.entity;

/*
@author 
@create 2021-08-16-18:00
*/



public class Recommend {
    private int Id;
    private int userId;
    private Goods goods;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Recommend{" +
                "Id=" + Id +
                ", userId=" + userId +
                ", goods=" + goods +
                '}';
    }
}
