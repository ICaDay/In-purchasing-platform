package com.mall.mapper;

import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Mmall_product_specs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
@author 
@create 2021-08-02-9:03
*/
@Mapper
public interface Mmall_product_specsMapper {
    List<Mmall_product_specs>findAll();
    Mmall_product_specs find(Integer id);
    int doAdd(Mmall_product_specs mmall_product_specs);
    int doUpdate(Mmall_product_specs mmall_product_specs);
    List<Mmall_product_specs> findvalue(int goodsId);
}
