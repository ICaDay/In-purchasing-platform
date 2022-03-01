package com.mall.mapper;

import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Stores;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
@author 
@create 2021-08-02-9:03
*/
@Mapper
public interface Mmall_attribute_keyMapper {
    List<Mmall_attribute_key>findAll();
    Mmall_attribute_key find(Integer id);
    int doAdd(Mmall_attribute_key mmall_attribute_key);
    int doUpdate(Mmall_attribute_key mmall_attribute_key);
    List<Mmall_attribute_key>keylist(Integer categoryId);
}
