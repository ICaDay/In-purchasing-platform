package com.mall.mapper;

/*
@author 
@create 2021-08-16-18:02
*/


import com.mall.entity.Recommend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecommendMapper {
    List<Recommend> findAll();
    Recommend find(Integer Id);
    int doAdd(Recommend recommend);
    int doUpdate(Recommend recommend);
    List<Recommend> finduser(Integer Id);
}
