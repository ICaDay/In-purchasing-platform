package com.mall.Impl;


import com.alibaba.fastjson.JSON;
import com.mall.entity.Member;
import com.mall.mapper.GoodsMapper;
import com.mall.Service.IGoodsService;
import com.mall.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 
@create 2021-07-19-13:21
*/
@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods>list(){
        return goodsMapper.findAll();
    }
    @Override
    public Goods find(Integer goodsId){
        return goodsMapper.find(goodsId);
    }
    @Override
    public int insert(Goods goods){
        return goodsMapper.doAdd(goods);
    }
    @Override
    public boolean update(Goods goods){
        if(goods!=null){
            //将前端导入的json格式对象转换成java对象

            int i=goodsMapper.doUpdate(goods);
            if(i==1) return true;
        }
        return false;
    }
    @Override
    public List<Goods>storesgoods(Integer storesId){
        return goodsMapper.findstoresgoods(storesId);
    }
    @Override
    public List<Goods>findType(String goodsType){
        return goodsMapper.findType(goodsType);
    }
    @Override
    public List<Goods>findStatus(String goodsStatus){
        return goodsMapper.findStatus(goodsStatus);
    }
    @Override
    public List<Goods> findcategorygoods(String categoryId){
        return goodsMapper.findcategorygoods(categoryId);
    }
    @Override
    public List<Goods> search(String keyword){
        return goodsMapper.search(keyword);
    }
    @Override
    public List<Goods> findgoodsId(Integer goodsId){
        return goodsMapper.findgoodsId(goodsId);
    }
    @Override
    public Integer get_Id(){
        return goodsMapper.get_Id();
    }
}
