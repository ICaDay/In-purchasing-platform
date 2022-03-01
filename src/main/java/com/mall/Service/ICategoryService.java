package com.mall.Service;

import com.mall.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 
@create 2021-07-22-16:52
*/


public interface ICategoryService {
    List<Category> list();
    List<Category> LevelList(Integer categoryLevel);
    List<Category> SonList(Integer parentId);
    List<Category> GrandSon(Category category);
    List<Category> find(Integer categoryId);
    int insert(Category category);
    int update(Category category);
}
