package com.mall.mapper;

import com.mall.entity.Stores;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
@author 
@create 2021-08-02-9:03
*/
@Mapper
public interface StoresMapper {
    List<Stores>findAll();
    Stores find(Integer storesId);
    int doAdd(Stores stores);
    int doUpdate(Stores stores);
}
