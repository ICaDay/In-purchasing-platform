package com.mall.Service;

/*
@author 
@create 2021-08-16-18:02
*/


import com.mall.entity.Recommend;
import org.springframework.stereotype.Service;

import java.util.List;



public interface IRecommendService {
    List<Recommend> list();
    Recommend find(Integer Id);
    int insert(Recommend recommend);
    int update(Recommend recommend);
    List<Recommend> finduser(Integer userId);
}
