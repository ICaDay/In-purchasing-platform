package com.mall.Impl;

import com.mall.mapper.Mmall_attribute_keyMapper;
import com.mall.mapper.Mmall_attribute_valueMapper;
import com.mall.Service.IMmall_attribute_keyService;
import com.mall.Service.IMmall_attribute_valueService;
import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Mmall_attribute_value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
@author 
@create 2021-08-02-9:02
*/
@Service
public class Mmall_attribute_valueServiceImpl implements IMmall_attribute_valueService {
    @Resource
    private Mmall_attribute_valueMapper mmall_attribute_valueMapper;
    @Override
    public List<Mmall_attribute_value> list(){return mmall_attribute_valueMapper.findAll();}
    @Override
    public int insert(Mmall_attribute_value mmall_attribute_value){return mmall_attribute_valueMapper.doAdd(mmall_attribute_value);}
    @Override
    public Mmall_attribute_value find(Integer id){return mmall_attribute_valueMapper.find(id);}
    @Override
    public int update(Mmall_attribute_value mmall_attribute_value){return mmall_attribute_valueMapper.doUpdate(mmall_attribute_value);}
    @Override
    public List<Mmall_attribute_value> keylist(Integer attribute_id){return mmall_attribute_valueMapper.keylist(attribute_id);}
}
