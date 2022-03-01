package com.mall.Impl;

import com.mall.mapper.CategoryMapper;
import com.mall.Service.ICategoryService;
import com.mall.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 
@create 2021-07-22-16:53
*/
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category>list(){
        return categoryMapper.findAll();
    }
    @Override
    public int insert(Category category){
        return categoryMapper.doAdd(category);
    }
    @Override
    public List<Category> find(Integer categoryId){
        return categoryMapper.find(categoryId);
    }
    @Override
    public int update(Category category){
        return categoryMapper.doUpdate(category);
    }

    @Override
    public List<Category>LevelList(Integer categoryLevel){ return categoryMapper.findLevel(categoryLevel); }

    @Override
    public List<Category>SonList(Integer parentId){ return categoryMapper.findSon(parentId);}
    @Override
    public List<Category>GrandSon(Category category){ return categoryMapper.findGrandSon(category);}
}
