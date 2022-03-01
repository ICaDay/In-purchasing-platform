package com.mall.mapper;

import com.mall.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
@author 
@create 2021-07-22-16:47
*/
@Mapper
public interface CategoryMapper {
    List<Category> findAll(); //查询所有方法
    List<Category> find(Integer categoryId);//根据编号查询数据
    int doAdd(Category category);//添加商品分类数据
    int doUpdate(Category category);//修改商品分类信息
    List<Category> findLevel(Integer categoryLevel);     //查询分类级别
    List<Category> findSon(Integer parentId);
    List<Category> findGrandSon(Category category);
}
