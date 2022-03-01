package com.mall.Service;

/*
@author 
@create 2021-08-02-8:44
*/

import com.mall.entity.Stores;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IStoresService {
    List<Stores> list();
    Stores find(Integer storesId);
    int insert(Stores stores);
    int update(Stores stores);
}
