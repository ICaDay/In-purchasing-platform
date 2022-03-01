package com.mall.entity;

/*
@author 
@create 2021-08-24-10:00
*/

public class Mmall_product_specs {
    private Integer id;
    private Integer goodsId;
    private String  product_specs;
    private Integer specs_seq;
    private Integer product_stock;
    private Double product_price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getProduct_specs() {
        return product_specs;
    }

    public void setProduct_specs(String product_specs) {
        this.product_specs = product_specs;
    }

    public Integer getSpecs_seq() {
        return specs_seq;
    }

    public void setSpecs_seq(Integer specs_seq) {
        this.specs_seq = specs_seq;
    }

    public Integer getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(Integer product_stock) {
        this.product_stock = product_stock;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    @Override
    public String toString() {
        return "Mmall_product_specs{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", product_specs='" + product_specs + '\'' +
                ", specs_seq=" + specs_seq +
                ", product_stock=" + product_stock +
                ", product_price=" + product_price +
                '}';
    }
}
