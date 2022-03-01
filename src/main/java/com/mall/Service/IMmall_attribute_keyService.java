package com.mall.Service;

/*
@author 
@create 2021-08-02-8:44
*/

import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Stores;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IMmall_attribute_keyService {
    List<Mmall_attribute_key> list();
    Mmall_attribute_key find(Integer id);
    int insert(Mmall_attribute_key mmall_attribute_key);
    int update(Mmall_attribute_key mmall_attribute_key);
    List<Mmall_attribute_key>keylist(Integer categoryId);
}
