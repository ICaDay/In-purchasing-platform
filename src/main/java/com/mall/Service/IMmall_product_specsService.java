package com.mall.Service;

/*
@author 
@create 2021-08-02-8:44
*/

import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Mmall_product_specs;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IMmall_product_specsService {
    List<Mmall_product_specs> list();
    Mmall_product_specs find(Integer id);
    int insert(Mmall_product_specs mmall_product_specs);
    int update(Mmall_product_specs mmall_product_specs);
    List<Mmall_product_specs> findvalue(Integer goodsId);
}
