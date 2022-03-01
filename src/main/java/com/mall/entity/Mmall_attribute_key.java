package com.mall.entity;

/*
@author 
@create 2021-08-24-9:58
*/


public class Mmall_attribute_key {
    private Integer id;
    private Integer category_id;
    private String  attribute_name;
    private Integer name_sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    public Integer getName_sort() {
        return name_sort;
    }

    public void setName_sort(Integer name_sort) {
        this.name_sort = name_sort;
    }

    @Override
    public String toString() {
        return "mmall_attribute_key{" +
                "id=" + id +
                ", category_id=" + category_id +
                ", attribute_name='" + attribute_name + '\'' +
                ", name_sort=" + name_sort +
                '}';
    }
}
