package com.mall.Impl;

import com.mall.mapper.Mmall_attribute_keyMapper;
import com.mall.mapper.Mmall_product_specsMapper;
import com.mall.Service.IMmall_attribute_keyService;
import com.mall.Service.IMmall_product_specsService;
import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Mmall_product_specs;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
@author 
@create 2021-08-02-9:02
*/
@Service
public class Mmall_product_specsServiceImpl implements IMmall_product_specsService {
    @Resource
    private Mmall_product_specsMapper mmall_product_specsMapper;

    @Override
    public List<Mmall_product_specs> list() {
        return mmall_product_specsMapper.findAll();
    }

    @Override
    public int insert(Mmall_product_specs mmall_product_specs) {
        return mmall_product_specsMapper.doAdd(mmall_product_specs);
    }

    @Override
    public Mmall_product_specs find(Integer id) {
        return mmall_product_specsMapper.find(id);
    }

    @Override
    public int update(Mmall_product_specs mmall_product_specs) {
        return mmall_product_specsMapper.doUpdate(mmall_product_specs);
    }
    @Override
    public  List<Mmall_product_specs> findvalue(Integer goodsId){
        return mmall_product_specsMapper.findvalue(goodsId);
    }
}
