package com.mall.mapper;

import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Mmall_attribute_value;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
@author 
@create 2021-08-02-9:03
*/
@Mapper
public interface Mmall_attribute_valueMapper {
    List<Mmall_attribute_value>findAll();
    Mmall_attribute_value find(Integer id);
    int doAdd(Mmall_attribute_value mmall_attribute_value);
    int doUpdate(Mmall_attribute_value mmall_attribute_value);
    List<Mmall_attribute_value>keylist(Integer attribute_id);
}
