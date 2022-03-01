package com.mall.entity;

/*
@author 
@create 2021-08-24-10:00
*/



public class Mmall_attribute_value {
    private Integer id;
    private Integer attribute_id;
    private String  attribute_value;
    private Integer value_sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttribute_id() {
        return attribute_id;
    }

    public void setAttribute_id(Integer attribute_id) {
        this.attribute_id = attribute_id;
    }

    public String getAttribute_value() {
        return attribute_value;
    }

    public void setAttribute_value(String attribute_value) {
        this.attribute_value = attribute_value;
    }

    public Integer getValue_sort() {
        return value_sort;
    }

    public void setValue_sort(Integer value_sort) {
        this.value_sort = value_sort;
    }

    @Override
    public String toString() {
        return "mmall_attribute_value{" +
                "id=" + id +
                ", attribute_id=" + attribute_id +
                ", attribute_value='" + attribute_value + '\'' +
                ", value_sort=" + value_sort +
                '}';
    }
}
