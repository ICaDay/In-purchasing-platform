package com.mall.Service;

/*
@author 
@create 2021-08-02-8:44
*/

import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Mmall_attribute_value;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IMmall_attribute_valueService {
    List<Mmall_attribute_value> list();
    Mmall_attribute_value find(Integer id);
    int insert(Mmall_attribute_value mmall_attribute_value);
    int update(Mmall_attribute_value mmall_attribute_value);
    List<Mmall_attribute_value> keylist(Integer attribute_id);
}
